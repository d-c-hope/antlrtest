grammar UserStoreConfig;

import Paths, Objects;

userstoredesc
   : items EOF
   ;

items
   : pathline items
   | object items
   | NEWLINE items
   |
   ;



