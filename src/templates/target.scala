package com.craftcodehouse.userstore.common

import com.twitter.finagle.http.Method
import com.twitter.finagle.http.Method.{Delete, Get, Post, Put}

import scala.util.Try

case class DocumentTypeAndKeys(documentType: DocumentType[_ <: AnyRef],
                               primaryKey: String,
                               additionalKeys: Seq[String] = Seq.empty)

trait DocumentTypeMapper {
  def getDocumentTypeAndKeysWithValidMethods(urlTail: Seq[String]): Option[(DocumentTypeAndKeys, Seq[Method])]
}


object DocumentTypeMapper extends DocumentTypeMapper {

  val all: Seq[Method] = Seq(Get, Post, Put, Delete)
  val enableTestConfig: Boolean = Try(sys.env.getOrElse("GENERIC_USERSTORE_ENABLE_TEST_CONFIG", "false").toBoolean).getOrElse(false)

  def getDocumentTypeAndKeysWithValidMethods(urlTail: Seq[String]): Option[(DocumentTypeAndKeys, Seq[Method])] = {
    (urlTail match {
      //Top level document for sports and ondemand sub-documents
      case nsprofileid :: "main" :: Nil => Some(DocumentTypeAndKeys(UserStoreDocumentTypes.MAIN, nsprofileid), Seq(Get, Post, Delete))
      //Post for sub-document until PUT can create
      case nsprofileid :: "sports" :: Nil => Some(DocumentTypeAndKeys(UserStoreDocumentTypes.SPORTS_PREFERENCES, nsprofileid), Seq(Post))
      case nsprofileid :: "sports" :: sportsId :: Nil => Some(DocumentTypeAndKeys(UserStoreDocumentTypes.SPORTS_PREFERENCES, nsprofileid, Seq(sportsId)), Seq(Get, Put, Delete))
      case nsprofileid :: "sports" :: "public":: sportsId :: Nil => Some(DocumentTypeAndKeys(UserStoreDocumentTypes.PUBLIC_SPORTS_PREFERENCES, nsprofileid, Seq(sportsId)), Seq(Get, Put, Delete))
      //Post for sub-document until PUT can create
      case nsprofileid :: "ondemand" :: Nil => Some(DocumentTypeAndKeys(UserStoreDocumentTypes.ON_DEMAND, nsprofileid), Seq(Post))
      case nsprofileid :: "ondemand" :: onDemandId :: Nil => Some(DocumentTypeAndKeys(UserStoreDocumentTypes.ON_DEMAND, nsprofileid, Seq(onDemandId)), Seq(Get, Put, Delete))
      //Top level document
      case nsprofileid :: "authentication" :: Nil => Some(DocumentTypeAndKeys(UserStoreDocumentTypes.AUTHENTICATION, nsprofileid), all)
      case _ => None
    }).filter(_ => enableTestConfig)
  }
}

trait Validator {
  def validate(data: AnyRef): Option[String]
}

abstract class DocumentType[T <: AnyRef](val name: String,
                                         val primaryIdentifierType: PrimaryIdentifierType,
                                         val validators: Seq[Validator] = Seq.empty,
                                         val rabbitConfig: Option[DocumentRabbitConfig] = None
                                        )(implicit mf: Manifest[T]) {
  val manifest: Manifest[T] = mf
}

case class DocumentRabbitConfig(eventName: String, keysToDocumentKey: Seq[String] => String, routingKeys: List[String], ttlMinutes: Option[Int] = None)

trait DocumentTypes {
  def get(name: String): Option[DocumentType[_ <: AnyRef]]
}

object UserStoreDocumentTypes extends DocumentTypes {
  case object MAIN extends DocumentType[Main]("MAIN", PrimaryIdentifierTypes.NsProfileId)
  case object SPORTS_PREFERENCES extends DocumentType[SportsPreferences]("SPORTS_PREFERENCES",
    PrimaryIdentifierTypes.NsProfileId,
    Seq(FootballTeamValidator),
    rabbitConfig = Some(DocumentRabbitConfig("SPORTS_PREFERENCES", keys => s"profile.${keys.head}.sports_prefs.${keys.tail.head}", List("rk-sports-prefs"), Some(2)))
  )
  case object ON_DEMAND extends DocumentType[OnDemandPreferences]("ON_DEMAND", PrimaryIdentifierTypes.NsProfileId)
  case object AUTHENTICATION extends DocumentType[Authentication]("AUTHENTICATION",
    PrimaryIdentifierTypes.NsProfileId,
    rabbitConfig = Some(DocumentRabbitConfig("AUTHENTICATION", keys => s"profile.${keys.head}.authentication.${keys.tail.head}", List("rk-auth"), Some(2))
    ))
  case object PUBLIC_SPORTS_PREFERENCES extends DocumentType[PublicSportsPreferences]("PUBLIC_SPORTS_PREFERENCES",
    PrimaryIdentifierTypes.NsProfileId,
    rabbitConfig = Some(DocumentRabbitConfig("PUBLIC_SPORTS_PREFERENCES", keys => s"profile.${keys.head}.sports_prefs.${keys.tail.head}", List("rk-sports-prefs"), Some(2)))
  )

  private val All: List[DocumentType[_ <: AnyRef]] = List(MAIN, SPORTS_PREFERENCES, ON_DEMAND, AUTHENTICATION, PUBLIC_SPORTS_PREFERENCES)

  def get(name: String): Option[DocumentType[_ <: AnyRef]] = All.find(_.name.equalsIgnoreCase(name))
}

case class Main(sports: Option[Map[String, SportsPreferences]], ondemand: Option[Map[String, OnDemandPreferences]])
case class SportsPreferences(favouritesTrackingOptOut: Boolean, favouriteFootballTeam: Option[String])
case class OnDemandPreferences(genres: Option[Array[String]])
case class Authentication(preferredAuthenticationMethod: String)
case class PublicSportsPreferences(favouritesTrackingOptOut: Boolean)

object FootballTeamValidator extends Validator {
  override def validate(data: AnyRef): Option[String] = {

    data match {
      case SportsPreferences(_, Some(team)) if team.length > 30 =>
        Some(s"'$team' name is too long")
      case SportsPreferences(_, _) => None
      case _ => Some("Not a valid SportsPreferences")
    }
  }
}


sealed trait PrimaryIdentifierType

object PrimaryIdentifierTypes {
  case object NsProfileId extends PrimaryIdentifierType
}