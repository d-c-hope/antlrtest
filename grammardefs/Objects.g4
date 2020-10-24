grammar Objects;
import Lexer;

//def optouts
//    marketing
//    pushnotification
//end def

object
   : DEF objname NEWLINE objectproperties+ ENDDEF
   ;

objectproperties
   : name type validator NEWLINE
   | name type NEWLINE
   | name NEWLINE
   ;

objname: STRING
   ;

name: STRING
   ;

type: STRING
   ;

validator: STRING
   ;
