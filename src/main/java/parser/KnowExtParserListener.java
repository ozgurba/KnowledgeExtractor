// Generated from KnowExtParser.g4 by ANTLR 4.4
package parser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link KnowExtParser}.
 */
public interface KnowExtParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link KnowExtParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDecl(@NotNull KnowExtParser.FunctionDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnowExtParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDecl(@NotNull KnowExtParser.FunctionDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link KnowExtParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(@NotNull KnowExtParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnowExtParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(@NotNull KnowExtParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link KnowExtParser#typeTypeOrVoid}.
	 * @param ctx the parse tree
	 */
	void enterTypeTypeOrVoid(@NotNull KnowExtParser.TypeTypeOrVoidContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnowExtParser#typeTypeOrVoid}.
	 * @param ctx the parse tree
	 */
	void exitTypeTypeOrVoid(@NotNull KnowExtParser.TypeTypeOrVoidContext ctx);
	/**
	 * Enter a parse tree produced by {@link KnowExtParser#typeType}.
	 * @param ctx the parse tree
	 */
	void enterTypeType(@NotNull KnowExtParser.TypeTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnowExtParser#typeType}.
	 * @param ctx the parse tree
	 */
	void exitTypeType(@NotNull KnowExtParser.TypeTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link KnowExtParser#complexType}.
	 * @param ctx the parse tree
	 */
	void enterComplexType(@NotNull KnowExtParser.ComplexTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnowExtParser#complexType}.
	 * @param ctx the parse tree
	 */
	void exitComplexType(@NotNull KnowExtParser.ComplexTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link KnowExtParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(@NotNull KnowExtParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnowExtParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(@NotNull KnowExtParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link KnowExtParser#parExpr}.
	 * @param ctx the parse tree
	 */
	void enterParExpr(@NotNull KnowExtParser.ParExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnowExtParser#parExpr}.
	 * @param ctx the parse tree
	 */
	void exitParExpr(@NotNull KnowExtParser.ParExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link KnowExtParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(@NotNull KnowExtParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnowExtParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(@NotNull KnowExtParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link KnowExtParser#exprList}.
	 * @param ctx the parse tree
	 */
	void enterExprList(@NotNull KnowExtParser.ExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnowExtParser#exprList}.
	 * @param ctx the parse tree
	 */
	void exitExprList(@NotNull KnowExtParser.ExprListContext ctx);
	/**
	 * Enter a parse tree produced by {@link KnowExtParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(@NotNull KnowExtParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnowExtParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(@NotNull KnowExtParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link KnowExtParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull KnowExtParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnowExtParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull KnowExtParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link KnowExtParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull KnowExtParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnowExtParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull KnowExtParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link KnowExtParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(@NotNull KnowExtParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnowExtParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(@NotNull KnowExtParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link KnowExtParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(@NotNull KnowExtParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnowExtParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(@NotNull KnowExtParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link KnowExtParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(@NotNull KnowExtParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnowExtParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(@NotNull KnowExtParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link KnowExtParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(@NotNull KnowExtParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnowExtParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(@NotNull KnowExtParser.PrimaryContext ctx);
}