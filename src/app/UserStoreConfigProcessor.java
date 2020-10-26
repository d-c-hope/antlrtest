import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.tree.TerminalNode;
import org.stringtemplate.v4.*;


public class UserStoreConfigProcessor extends UserStoreConfigBaseListener {

    List<String> uris;
    UserStoreConfigParser parser;
    Path currentPath;
    ConfigObject currentObject;
    List<Path> paths;
    List<ConfigObject> configObjects;
    Map<String, String> primaryIDsMap;

    public UserStoreConfigProcessor(UserStoreConfigParser parser) {
        this.parser = parser;
        uris = new LinkedList<>();
        paths = new LinkedList<>();
        configObjects = new LinkedList<>();
        currentPath = null;
        primaryIDsMap = new HashMap<>();
    }

    public List<String> getUris() {
        return uris;
    }

    @Override
    public void enterUserstoredesc(UserStoreConfigParser.UserstoredescContext ctx) {
    }

    @Override
    public void exitUserstoredesc(UserStoreConfigParser.UserstoredescContext ctx) {
        System.out.println("Exiting");
        System.out.println(uris);
        System.out.println(paths);
        System.out.println(configObjects);

        STGroup group = new STGroupFile("src/templates/ustemplate.stg", '£', '£');
        ST st = group.getInstanceOf("scalafile");
        st.add("paths", paths);
        System.out.println("Config objects length "+configObjects.size());
        st.add("cfgobjects", configObjects);
        st.add("priIDsMap", primaryIDsMap);
        String result = st.render(); // yields "int x = 0;"
        System.out.println(result);
    }

    @Override
    public void enterPath(UserStoreConfigParser.PathContext ctx) {
        System.out.println("In enter path");
        currentPath = new Path();
        uris.add(ctx.getText());
    }

    @Override
    public void exitPath(UserStoreConfigParser.PathContext uriContext) {
        System.out.println("In exit path");
        paths.add(currentPath);
        checkForPrimaryID(currentPath);
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
//        currentPath.doctype = new Path.DocType(label);
        currentPath.name = label;
    }

    @Override
    public void exitSINGLELABEL(UserStoreConfigParser.SINGLELABELContext ctx) {
        super.exitSINGLELABEL(ctx);
    }

    @Override
    public void enterMethods(UserStoreConfigParser.MethodsContext ctx) {
        super.enterMethods(ctx);
        List<TerminalNode> methods = ctx.HMETHOD();
        for (TerminalNode node: methods) {
            String method = node.getText();
            currentPath.methods.add(method);
        }
    }

    @Override
    public void exitMethods(UserStoreConfigParser.MethodsContext ctx) {
        super.exitMethods(ctx);
    }



    @Override
    public void enterDocref(UserStoreConfigParser.DocrefContext ctx) {
        super.enterDocref(ctx);
        String ref = ctx.getText();
        currentPath.doctype = new Path.DocType(ref);
    }

    @Override
    public void exitDocref(UserStoreConfigParser.DocrefContext ctx) {
        super.exitDocref(ctx);
    }

    @Override
    public void enterObject(UserStoreConfigParser.ObjectContext ctx) {
        super.enterObject(ctx);
        System.out.println("Enter object " + ctx.getText());
        currentObject = new ConfigObject(ctx.objname().getText());
    }

    @Override
    public void exitObject(UserStoreConfigParser.ObjectContext ctx) {
        super.exitObject(ctx);
        configObjects.add(currentObject);
    }

    @Override
    public void enterObjectproperties(UserStoreConfigParser.ObjectpropertiesContext ctx) {
        super.enterObjectproperties(ctx);
//        System.out.println("Enter object properties");
        if (ctx.name() != null) {
            ConfigObject.ConfigObjectProperty property = new ConfigObject.ConfigObjectProperty();
//        System.out.println("object name is" + ctx);
            System.out.println("property name is" + ctx.name().getText());
            property.name = ctx.name().getText();
//        System.out.println("object type is" + ctx.type().getText());
            property.type = ctx.type().getText();
            currentObject.properties.add(property);
        }
        else {

        }
    }

    @Override
    public void exitObjectproperties(UserStoreConfigParser.ObjectpropertiesContext ctx) {
        super.exitObjectproperties(ctx);
//        System.out.println("Exit object properties");
    }

    @Override
    public void enterMetasection(UserStoreConfigParser.MetasectionContext ctx) {
        super.enterMetasection(ctx);
        System.out.println("Enter meta");
        currentObject.metaProperties = new ConfigObject.ConfigObjectMetaProperties();
    }

    @Override
    public void exitMetasection(UserStoreConfigParser.MetasectionContext ctx) {
        super.exitMetasection(ctx);
        System.out.println("Exit meta");
    }

    @Override
    public void enterMetaproperties(UserStoreConfigParser.MetapropertiesContext ctx) {
        super.enterMetaproperties(ctx);
        String name = ctx.name().getText();
        String value = ctx.value().getText();

        if (name.equals("queue")) {
            System.out.println("got queue property");
            if (value.equals("true")) {
                currentObject.metaProperties.hasQueue = true;
            } else {
                currentObject.metaProperties.hasQueue = false;
            }
        }
        else if (name.equals("queuekey")){
            currentObject.metaProperties.queueName = value;
        }
    }

    @Override
    public void exitMetaproperties(UserStoreConfigParser.MetapropertiesContext ctx) {
        super.exitMetaproperties(ctx);
    }


    void checkForPrimaryID(Path currentPath) {
        if (currentPath.doctype != null) {
            String primaryID = currentPath.idPairs.get(0).idName;
            primaryIDsMap.put(currentPath.doctype.name, primaryID);
        }
    }

}
