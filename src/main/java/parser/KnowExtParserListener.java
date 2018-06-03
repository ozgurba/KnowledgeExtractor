// Generated from KnowExtParser.g4 by ANTLR 4.7.1
package knowext;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link KnowExtParser}.
 */
public interface KnowExtParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link KnowExtParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(KnowExtParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnowExtParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(KnowExtParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link KnowExtParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(KnowExtParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnowExtParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(KnowExtParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link KnowExtParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDecl(KnowExtParser.FunctionDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnowExtParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDecl(KnowExtParser.FunctionDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link KnowExtParser#typeTypeOrVoid}.
	 * @param ctx the parse tree
	 */
	void enterTypeTypeOrVoid(KnowExtParser.TypeTypeOrVoidContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnowExtParser#typeTypeOrVoid}.
	 * @param ctx the parse tree
	 */
	void exitTypeTypeOrVoid(KnowExtParser.TypeTypeOrVoidContext ctx);
	/**
	 * Enter a parse tree produced by {@link KnowExtParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(KnowExtParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnowExtParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(KnowExtParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link KnowExtParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(KnowExtParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnowExtParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(KnowExtParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link KnowExtParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(KnowExtParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnowExtParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(KnowExtParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link KnowExtParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(KnowExtParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnowExtParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(KnowExtParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link KnowExtParser#parExpr}.
	 * @param ctx the parse tree
	 */
	void enterParExpr(KnowExtParser.ParExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnowExtParser#parExpr}.
	 * @param ctx the parse tree
	 */
	void exitParExpr(KnowExtParser.ParExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link KnowExtParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(KnowExtParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnowExtParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(KnowExtParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link KnowExtParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(KnowExtParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnowExtParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(KnowExtParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link KnowExtParser#exprList}.
	 * @param ctx the parse tree
	 */
	void enterExprList(KnowExtParser.ExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnowExtParser#exprList}.
	 * @param ctx the parse tree
	 */
	void exitExprList(KnowExtParser.ExprListContext ctx);
	/**
	 * Enter a parse tree produced by {@link KnowExtParser#typeType}.
	 * @param ctx the parse tree
	 */
	void enterTypeType(KnowExtParser.TypeTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnowExtParser#typeType}.
	 * @param ctx the parse tree
	 */
	void exitTypeType(KnowExtParser.TypeTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link KnowExtParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(KnowExtParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnowExtParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(KnowExtParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link KnowExtParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(KnowExtParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnowExtParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(KnowExtParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link KnowExtParser#complexType}.
	 * @param ctx the parse tree
	 */
	void enterComplexType(KnowExtParser.ComplexTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnowExtParser#complexType}.
	 * @param ctx the parse tree
	 */
	void exitComplexType(KnowExtParser.ComplexTypeContext ctx);
}