grammar Objects;
import Lexer;

//def optouts
//    marketing
//    pushnotification
//    meta
//       queue: true
//       queuekey: profile.id.optouts
//    endmeta
//end def

object
   : DEF objname NEWLINE objectproperties+ ENDDEF
   ;

objectproperties
   : metasection NEWLINE
   | name type validator NEWLINE
   | name type NEWLINE
   ;

objname: STRING
   ;

name: STRING
   ;

type: STRING
   ;

validator: STRING
   ;

metasection
   : META NEWLINE metaproperties+ ENDMETA
   ;

metaproperties
   : name ':' value NEWLINE
   ;

value: STRING
   ;
