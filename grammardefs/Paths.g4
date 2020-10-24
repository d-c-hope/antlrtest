grammar Paths;
import Lexer;

// /profile/<id>
// /profile/<id>/persona
// /profile/<id>/persona/<id>
// /profile/id/persona/<id>/optouts

//pathlines
//   : pathline more
//   ;
//
//more
//   : pathlines
//    |
//    ;

pathline
   : path WS? NEWLINE
   ;

path
   : pathsegments
   ;

pathsegments
   : '/' label '/' labelid pathsegments? #LABELIDPAIR
   | '/' label                   #SINGLELABEL
   ;

labelid
   :'<id>'
   ;

label: STRING
   ;

