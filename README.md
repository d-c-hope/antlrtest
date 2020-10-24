Download the antlr jar from:

Copy to where you want e.g. /usr/local/antlr
Also add a file you can source eg: /usr/local/antlr/setup:

export CLASSPATH=".:/usr/local/antlr/antlr-4.8-complete.jar:$CLASSPATH"
export ANTLOC="/usr/local/antlr/antlr-4.8-complete.jar"
alias antlr4='java -Xmx500M -cp "/usr/local/antlr/antlr-4.8-complete.jar:$CLASSPATH" org.antlr.v4.Tool'
alias grun='java -Xmx500M -cp "/usr/local/antlr/antlr-4.8-complete.jar:$CLASSPATH" org.antlr.v4.gui.TestRig'

Then source this:
. /usr/local/antlr/setup