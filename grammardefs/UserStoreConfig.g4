grammar UserStoreConfig;

// /profile/<id>
// /profile/<id>/persona
// /profile/<id>/persona/<id>
// /profile/id/persona/<id>/optouts


userstoredesc: pathlines EOF;

pathlines
   : pathline more
   ;

more: pathlines
    |
    ;

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


//uri
//   : ('/' path?)? WS? NEWLINE
//   ;
//path
//   : string ('/' string)* '/'?
//   ;

//path
//   : '/' label ('/' string)*
//   | label
//   ;