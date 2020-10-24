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
	 * Enter a parse tree produced by {@link UserStoreConfigParser#muris}.
	 * @param ctx the parse tree
	 */
	void enterMuris(UserStoreConfigParser.MurisContext ctx);
	/**
	 * Exit a parse tree produced by {@link UserStoreConfigParser#muris}.
	 * @param ctx the parse tree
	 */
	void exitMuris(UserStoreConfigParser.MurisContext ctx);
	/**
	 * Enter a parse tree produced by {@link UserStoreConfigParser#uri}.
	 * @param ctx the parse tree
	 */
	void enterUri(UserStoreConfigParser.UriContext ctx);
	/**
	 * Exit a parse tree produced by {@link UserStoreConfigParser#uri}.
	 * @param ctx the parse tree
	 */
	void exitUri(UserStoreConfigParser.UriContext ctx);
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