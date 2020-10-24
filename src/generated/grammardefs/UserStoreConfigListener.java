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
	 * Enter a parse tree produced by {@link UserStoreConfigParser#pathlines}.
	 * @param ctx the parse tree
	 */
	void enterPathlines(UserStoreConfigParser.PathlinesContext ctx);
	/**
	 * Exit a parse tree produced by {@link UserStoreConfigParser#pathlines}.
	 * @param ctx the parse tree
	 */
	void exitPathlines(UserStoreConfigParser.PathlinesContext ctx);
	/**
	 * Enter a parse tree produced by {@link UserStoreConfigParser#more}.
	 * @param ctx the parse tree
	 */
	void enterMore(UserStoreConfigParser.MoreContext ctx);
	/**
	 * Exit a parse tree produced by {@link UserStoreConfigParser#more}.
	 * @param ctx the parse tree
	 */
	void exitMore(UserStoreConfigParser.MoreContext ctx);
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
	 * Enter a parse tree produced by {@link UserStoreConfigParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(UserStoreConfigParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link UserStoreConfigParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(UserStoreConfigParser.StringContext ctx);
}