lexer grammar Lexer;

DEF
   : 'def'
   ;

ENDDEF
   : 'enddef'
   ;

META
   : 'meta'
   ;

ENDMETA
   : 'endmeta'
   ;

HMETHOD
   : 'get' | 'put' | 'post' | 'del'
   ;

DIGITS
   : [0-9] +
   ;

STRING
   : [a-zA-Z~0-9] [a-zA-Z0-9.+-]*
   ;

WS: [ \t]+ -> skip;

NEWLINE: [\r\n] +;
