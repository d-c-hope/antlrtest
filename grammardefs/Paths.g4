grammar Paths;
import Lexer;

// /profile/<id> (get) optouts
// /profile/<id>/persona  (get, post) optouts
// /profile/<id>/persona/<id>  (get) optouts
// /profile/id/persona/<id>/optouts  (get) optouts


pathline
   : path methods docref WS? NEWLINE
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

methods
   : '(' (HMETHOD ','?)+ ')'
   ;

docref
   : STRING
   ;

label
   : STRING
   ;

