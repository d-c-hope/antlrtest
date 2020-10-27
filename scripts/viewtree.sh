export CLASSPATH=".:./src/app:build/grammardefs:$ANTLOC:$CLASSPATH"
java -Xmx500M org.antlr.v4.gui.TestRig UserStoreConfig userstoredesc -gui $1
