// import ANTLR's runtime libraries
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.util.LinkedList;
import java.util.List;
import org.stringtemplate.v4.*;


public class USTest {
    public static void main(String[] args) throws Exception {
        
        
        String inputFile = null; 
        if ( args.length>0 ) inputFile = args[0];
        InputStream is = System.in;
        if ( inputFile!=null ) is = new FileInputStream(inputFile);
        
        ANTLRInputStream input = new ANTLRInputStream(is); 
        UserStoreConfigLexer lexer = new UserStoreConfigLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        UserStoreConfigParser parser = new UserStoreConfigParser(tokens);
        ParseTree tree = parser.userstoredesc();
        UserStoreConfigProcessor listener = new UserStoreConfigProcessor(parser);

        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(listener, tree);


//        System.out.println(tree.toStringTree(parser)); // print LISP-style tree
    }
}


//STGroup group = new STGroupFile("/tmp/test.stg");
// ST st = group.getInstanceOf("decl");
// st.add("type", "int");
// st.add("name", "x");
// st.add("value", 0);
// String result = st.render(); // yields "int x = 0;"