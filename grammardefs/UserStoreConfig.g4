grammar UserStoreConfig;

import Paths, Objects;
//import Objects;

userstoredesc
   : items EOF
   ;

items
   : pathline items
   | object items
   | NEWLINE items
   |
   ;
//
//item
//   : pathline
//   | object
//   ;



