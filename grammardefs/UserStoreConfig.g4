grammar UserStoreConfig;

userstoredesc: muris EOF;

muris
   : uri more
   ;

uri 
   : ('/' path?)? WS? NEWLINE
   ;

more: muris
    | 
    ;

path
   : string ('/' string)* '/'?
   ;

string: STRING
   ;


DIGITS
   : [0-9] +
   ;

STRING
   : [a-zA-Z~0-9] [a-zA-Z0-9.+-]*
   ;

WS: [ \t]+ -> skip;

NEWLINE: [\r\n] +;