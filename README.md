# README

## Introduction
This is a small test project to try out ANTLR
The aim of the project is to read a config file in a domain specific language that I've defined and translate this into a Scala source file

See userstoredefs/testfile4.expr for the config file we want to translate into a scala file 
See target in the templates directory for an example of what we are trying to generate. 
The other files in the templates directory are the templates being filled in

Note that this isn't quite complete yet 

## How it works ##
A grammar definition has been written in the grammardefs directory.
You run ANTLR on this as a one time task to generate a load of Java files which implement a parser based on the grammar
The USTest app (user store test) app then uses this parser and it's listener implementation (that fires events on visiting nodes in the parse tree)
in order to build data structures that fill in the scala file templates 

## Setup

Note that ANTLR could also be used in a more automated way with Maven and Maven tasks in place of my shell commands below

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

## Build all and run
All 3 commands can be run by: 
```
./scripts/doAll.sh userstoredefs/testfile4.expr
```