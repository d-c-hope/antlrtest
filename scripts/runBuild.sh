#!/bin/bash

#alias antlr43='java -Xmx500M -cp "$ANTLOC:$CLASSPATH" org.antlr.v4.Tool'
java -Xmx500M -cp "$ANTLOC:$CLASSPATH" org.antlr.v4.Tool grammardefs/UserStoreConfig.g4 -o src/generated

#alias grun='java -Xmx500M -cp "$ANTLOC:$CLASSPATH" org.antlr.v4.gui.TestRig'
#antlr43 grammardefs/UserStoreConfig.g4 -o src/generated
pushd src/generated/grammardefs
javac *.java -d ../../../build/grammardefs
popd
