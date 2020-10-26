// Generated from grammardefs/UserStoreConfig.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link UserStoreConfigParser}.
 */
public interface UserStoreConfigListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link UserStoreConfigParser#userstoredesc}.
	 * @param ctx the parse tree
	 */
	void enterUserstoredesc(UserStoreConfigParser.UserstoredescContext ctx);
	/**
	 * Exit a parse tree produced by {@link UserStoreConfigParser#userstoredesc}.
	 * @param ctx the parse tree
	 */
	void exitUserstoredesc(UserStoreConfigParser.UserstoredescContext ctx);
	/**
	 * Enter a parse tree produced by {@link UserStoreConfigParser#items}.
	 * @param ctx the parse tree
	 */
	void enterItems(UserStoreConfigParser.ItemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link UserStoreConfigParser#items}.
	 * @param ctx the parse tree
	 */
	void exitItems(UserStoreConfigParser.ItemsContext ctx);
	/**
	 * Enter a parse tree produced by {@link UserStoreConfigParser#pathline}.
	 * @param ctx the parse tree
	 */
	void enterPathline(UserStoreConfigParser.PathlineContext ctx);
	/**
	 * Exit a parse tree produced by {@link UserStoreConfigParser#pathline}.
	 * @param ctx the parse tree
	 */
	void exitPathline(UserStoreConfigParser.PathlineContext ctx);
	/**
	 * Enter a parse tree produced by {@link UserStoreConfigParser#path}.
	 * @param ctx the parse tree
	 */
	void enterPath(UserStoreConfigParser.PathContext ctx);
	/**
	 * Exit a parse tree produced by {@link UserStoreConfigParser#path}.
	 * @param ctx the parse tree
	 */
	void exitPath(UserStoreConfigParser.PathContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LABELIDPAIR}
	 * labeled alternative in {@link UserStoreConfigParser#pathsegments}.
	 * @param ctx the parse tree
	 */
	void enterLABELIDPAIR(UserStoreConfigParser.LABELIDPAIRContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LABELIDPAIR}
	 * labeled alternative in {@link UserStoreConfigParser#pathsegments}.
	 * @param ctx the parse tree
	 */
	void exitLABELIDPAIR(UserStoreConfigParser.LABELIDPAIRContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SINGLELABEL}
	 * labeled alternative in {@link UserStoreConfigParser#pathsegments}.
	 * @param ctx the parse tree
	 */
	void enterSINGLELABEL(UserStoreConfigParser.SINGLELABELContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SINGLELABEL}
	 * labeled alternative in {@link UserStoreConfigParser#pathsegments}.
	 * @param ctx the parse tree
	 */
	void exitSINGLELABEL(UserStoreConfigParser.SINGLELABELContext ctx);
	/**
	 * Enter a parse tree produced by {@link UserStoreConfigParser#labelid}.
	 * @param ctx the parse tree
	 */
	void enterLabelid(UserStoreConfigParser.LabelidContext ctx);
	/**
	 * Exit a parse tree produced by {@link UserStoreConfigParser#labelid}.
	 * @param ctx the parse tree
	 */
	void exitLabelid(UserStoreConfigParser.LabelidContext ctx);
	/**
	 * Enter a parse tree produced by {@link UserStoreConfigParser#methods}.
	 * @param ctx the parse tree
	 */
	void enterMethods(UserStoreConfigParser.MethodsContext ctx);
	/**
	 * Exit a parse tree produced by {@link UserStoreConfigParser#methods}.
	 * @param ctx the parse tree
	 */
	void exitMethods(UserStoreConfigParser.MethodsContext ctx);
	/**
	 * Enter a parse tree produced by {@link UserStoreConfigParser#docref}.
	 * @param ctx the parse tree
	 */
	void enterDocref(UserStoreConfigParser.DocrefContext ctx);
	/**
	 * Exit a parse tree produced by {@link UserStoreConfigParser#docref}.
	 * @param ctx the parse tree
	 */
	void exitDocref(UserStoreConfigParser.DocrefContext ctx);
	/**
	 * Enter a parse tree produced by {@link UserStoreConfigParser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(UserStoreConfigParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link UserStoreConfigParser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(UserStoreConfigParser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link UserStoreConfigParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(UserStoreConfigParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link UserStoreConfigParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(UserStoreConfigParser.ObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link UserStoreConfigParser#objectproperties}.
	 * @param ctx the parse tree
	 */
	void enterObjectproperties(UserStoreConfigParser.ObjectpropertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link UserStoreConfigParser#objectproperties}.
	 * @param ctx the parse tree
	 */
	void exitObjectproperties(UserStoreConfigParser.ObjectpropertiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link UserStoreConfigParser#objname}.
	 * @param ctx the parse tree
	 */
	void enterObjname(UserStoreConfigParser.ObjnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link UserStoreConfigParser#objname}.
	 * @param ctx the parse tree
	 */
	void exitObjname(UserStoreConfigParser.ObjnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link UserStoreConfigParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(UserStoreConfigParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link UserStoreConfigParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(UserStoreConfigParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link UserStoreConfigParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(UserStoreConfigParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link UserStoreConfigParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(UserStoreConfigParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link UserStoreConfigParser#validator}.
	 * @param ctx the parse tree
	 */
	void enterValidator(UserStoreConfigParser.ValidatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link UserStoreConfigParser#validator}.
	 * @param ctx the parse tree
	 */
	void exitValidator(UserStoreConfigParser.ValidatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link UserStoreConfigParser#metasection}.
	 * @param ctx the parse tree
	 */
	void enterMetasection(UserStoreConfigParser.MetasectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UserStoreConfigParser#metasection}.
	 * @param ctx the parse tree
	 */
	void exitMetasection(UserStoreConfigParser.MetasectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link UserStoreConfigParser#metaproperties}.
	 * @param ctx the parse tree
	 */
	void enterMetaproperties(UserStoreConfigParser.MetapropertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link UserStoreConfigParser#metaproperties}.
	 * @param ctx the parse tree
	 */
	void exitMetaproperties(UserStoreConfigParser.MetapropertiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link UserStoreConfigParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(UserStoreConfigParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link UserStoreConfigParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(UserStoreConfigParser.ValueContext ctx);
}