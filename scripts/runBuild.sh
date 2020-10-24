alias antlr4='java -Xmx500M -cp "$ANTLOC:$CLASSPATH" org.antlr.v4.Tool'
alias grun='java -Xmx500M -cp "$ANTLOC:$CLASSPATH" org.antlr.v4.gui.TestRig'
antlr4 grammardefs/UserStoreConfig.g4 -o src/generated
pushd src/generated/grammardefs
javac *.java -d ../../../build/grammardefs
popd
