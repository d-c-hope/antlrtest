# README

## Introduction
This is a small test project to try out ANTLR
The aim of the project is to read a config file in a domain specific language that I've defined and translate this into a Scala source file

## Setup

Download the ANTLR jar from:

Copy to where you want e.g. /usr/local/antlr
Also add a file you can source eg: /usr/local/antlr/setup:

```
export CLASSPATH=".:/usr/local/antlr/antlr-4.8-complete.jar:$CLASSPATH"
export ANTLOC="/usr/local/antlr/antlr-4.8-complete.jar"
alias antlr4='java -Xmx500M -cp "/usr/local/antlr/antlr-4.8-complete.jar:$CLASSPATH" org.antlr.v4.Tool'
alias grun='java -Xmx500M -cp "/usr/local/antlr/antlr-4.8-complete.jar:$CLASSPATH" org.antlr.v4.gui.TestRig'
```
Then source this:
```
. /usr/local/antlr/setup
```


## Intellij
Add the antlr jar to the module jars.
Set both app and generated/grammardefs as source roots  

## Generating and building the parser
To create the generated files from the grammar:
```
./scripts/runBuild.sh 
```

## Building and running the application
Build and run as follows where testfile.expr has the config file we want to translate
```
./scripts/runAppBuild.sh
./scripts/runApp.sh userstoredefs/testfile.expr
```
