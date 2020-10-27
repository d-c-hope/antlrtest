#!/bin/bash

java -Xmx500M -cp "$ANTLOC:$CLASSPATH" org.antlr.v4.Tool grammardefs/UserStoreConfig.g4 -o src/generated
pushd src/generated/grammardefs
javac *.java -d ../../../build/grammardefs
popd
