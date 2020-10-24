import java.util.LinkedList;
import java.util.List;


class Path {
    public Path() {
        this.idPairs = new LinkedList<>();
    }

    static class LabelIDPair {
        String name;
        String idName;

        public LabelIDPair(String name, String idName) {
            this.name = name;
            this.idName = idName;
        }

        @Override
        public String toString() {
            return "LabelIDPair{" +
                    "name='" + name + '\'' +
                    ", idName='" + idName + '\'' +
                    '}';
        }
    }

    static class DocType {
        String name;

        public DocType(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "DocType{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

    List<LabelIDPair> idPairs;
    DocType doctype;

    @Override
    public String toString() {
        return "Path{" +
                "idPairs=" + idPairs +
                ", doctype=" + doctype +
                '}';
    }
}

public class UserStoreConfigProcessor extends UserStoreConfigBaseListener {

    List<String> uris;
    UserStoreConfigParser parser;
    Path currentPath;
    List<Path> paths;

    public UserStoreConfigProcessor(UserStoreConfigParser parser) {
        this.parser = parser;
        uris = new LinkedList<>();
        paths = new LinkedList<>();
        currentPath = null;
    }

    public List<String> getUris() {
        return uris;
    }

    @Override
    public void enterUserstoredesc(UserStoreConfigParser.UserstoredescContext ctx) {
//        TokenStream tokens = parser.getTokenStream();
    }

    @Override
    public void exitUserstoredesc(UserStoreConfigParser.UserstoredescContext ctx) {
        System.out.println("Exiting");
        System.out.println(uris);
        System.out.println(paths);
    }

    @Override
    public void enterPath(UserStoreConfigParser.PathContext ctx) {
//        System.out.println(ctx.getText());
//        TerminalNode node = ctx.path().string();
        System.out.println("In enter path");
        currentPath = new Path();
        uris.add(ctx.getText());
    }

    @Override
    public void exitPath(UserStoreConfigParser.PathContext uriContext) {
        System.out.println("In exit path");
        paths.add(currentPath);
    }

    @Override
    public void enterLABELIDPAIR(UserStoreConfigParser.LABELIDPAIRContext ctx) {
        super.enterLABELIDPAIR(ctx);
        String label = ctx.label().getText();
        String id = ctx.labelid().getText();
        currentPath.idPairs.add(new Path.LabelIDPair(label, id));
    }

    @Override
    public void exitLABELIDPAIR(UserStoreConfigParser.LABELIDPAIRContext ctx) {
        super.exitLABELIDPAIR(ctx);
    }

    @Override
    public void enterSINGLELABEL(UserStoreConfigParser.SINGLELABELContext ctx) {
        super.enterSINGLELABEL(ctx);
        String label = ctx.label().getText();
        currentPath.doctype = new Path.DocType(label);
    }

    @Override
    public void exitSINGLELABEL(UserStoreConfigParser.SINGLELABELContext ctx) {
        super.exitSINGLELABEL(ctx);
    }

//    @Override
//    public void enterPath(UserStoreConfigParser.PathContext ctx) {
//    }
//
//    @Override
//    public void exitPath(UserStoreConfigParser.PathContext ctx) {
//
//    }
//
//    @Override
//    public void enterString(UserStoreConfigParser.StringContext stringContext) {
//
//    }
//
//    @Override
//    public void exitString(UserStoreConfigParser.StringContext stringContext) {
//
//    }
}
