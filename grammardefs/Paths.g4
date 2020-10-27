grammar Paths;
import Lexer;

// /profile/<nsprofileid> (get) optouts
// /profile/<nsprofileid>/persona  (get, post) optouts
// /profile/<nsprofileid>/persona/<personaid>  (get) optouts
// /profile/<nsprofileid>/persona/<personaid>/optouts  (get) optouts


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
   :'<'labelidname'>'
   ;

labelidname
   : STRING
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

