// import ANTLR's runtime libraries
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.util.LinkedList;
import java.util.List;

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


class UserStoreConfigProcessor extends UserStoreConfigBaseListener {

    List<String> uris;
    UserStoreConfigParser parser;

    public UserStoreConfigProcessor(UserStoreConfigParser parser) {
        this.parser = parser;
        uris = new LinkedList<>();
    }

//    public UserStoreConfigProcessor() {
//        super();
//        uris = new LinkedList<>();
//    }

    public List<String> getUris() {
        return uris;
    }

    @Override
    public void enterUserstoredesc(UserStoreConfigParser.UserstoredescContext userstoredescContext) {
//        TokenStream tokens = parser.getTokenStream();
    }

    @Override
    public void exitUserstoredesc(UserStoreConfigParser.UserstoredescContext userstoredescContext) {
        System.out.println("Exiting");
        System.out.println(uris);
    }

//    @Override
//    public void enterMuris(UserStoreConfigParser.MurisContext murisContext) {
//
//    }
//
//    @Override
//    public void exitMuris(UserStoreConfigParser.MurisContext murisContext) {
//
//    }

    @Override
    public void enterUri(UserStoreConfigParser.UriContext ctx) {
//        TerminalNode node = ctx.path().string();
//        uris.add(node.getText());
    }

    @Override
    public void exitUri(UserStoreConfigParser.UriContext uriContext) {

    }

//    @Override
//    public void enterMore(UserStoreConfigParser.MoreContext moreContext) {
//
//    }
//
//    @Override
//    public void exitMore(UserStoreConfigParser.MoreContext moreContext) {
//
//    }

    @Override
    public void enterPath(UserStoreConfigParser.PathContext ctx) {
        System.out.println(ctx.string().toString());
        TokenStream tokens = parser.getTokenStream();
        tokens.getText();
    }

    @Override
    public void exitPath(UserStoreConfigParser.PathContext ctx) {

    }

    @Override
    public void enterString(UserStoreConfigParser.StringContext stringContext) {

    }

    @Override
    public void exitString(UserStoreConfigParser.StringContext stringContext) {

    }
}

// import org.stringtemplate.v4.*;
// STGroup group = new STGroupFile("/tmp/test.stg");
// ST st = group.getInstanceOf("decl");
// st.add("type", "int");
// st.add("name", "x");
// st.add("value", 0);
// String result = st.render(); // yields "int x = 0;"