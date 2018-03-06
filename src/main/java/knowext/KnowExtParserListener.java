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
	 * Enter a parse tree produced by {@link KnowExtParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(KnowExtParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnowExtParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(KnowExtParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KnowExtParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(KnowExtParser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnowExtParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(KnowExtParser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link KnowExtParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarators(KnowExtParser.VariableDeclaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnowExtParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarators(KnowExtParser.VariableDeclaratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link KnowExtParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(KnowExtParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnowExtParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(KnowExtParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link KnowExtParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(KnowExtParser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnowExtParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(KnowExtParser.VariableDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link KnowExtParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(KnowExtParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnowExtParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(KnowExtParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link KnowExtParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(KnowExtParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnowExtParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(KnowExtParser.ArrayInitializerContext ctx);
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
	 * Enter a parse tree produced by {@link KnowExtParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(KnowExtParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnowExtParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(KnowExtParser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link KnowExtParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(KnowExtParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnowExtParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(KnowExtParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KnowExtParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlockStatementGroup(KnowExtParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnowExtParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlockStatementGroup(KnowExtParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link KnowExtParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabel(KnowExtParser.SwitchLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnowExtParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabel(KnowExtParser.SwitchLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link KnowExtParser#forControl}.
	 * @param ctx the parse tree
	 */
	void enterForControl(KnowExtParser.ForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnowExtParser#forControl}.
	 * @param ctx the parse tree
	 */
	void exitForControl(KnowExtParser.ForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link KnowExtParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(KnowExtParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnowExtParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(KnowExtParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link KnowExtParser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForControl(KnowExtParser.EnhancedForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnowExtParser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForControl(KnowExtParser.EnhancedForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link KnowExtParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void enterParExpression(KnowExtParser.ParExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnowExtParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void exitParExpression(KnowExtParser.ParExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KnowExtParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(KnowExtParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnowExtParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(KnowExtParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link KnowExtParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(KnowExtParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnowExtParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(KnowExtParser.ExpressionContext ctx);
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
	 * Enter a parse tree produced by {@link KnowExtParser#creator}.
	 * @param ctx the parse tree
	 */
	void enterCreator(KnowExtParser.CreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnowExtParser#creator}.
	 * @param ctx the parse tree
	 */
	void exitCreator(KnowExtParser.CreatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link KnowExtParser#createdName}.
	 * @param ctx the parse tree
	 */
	void enterCreatedName(KnowExtParser.CreatedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnowExtParser#createdName}.
	 * @param ctx the parse tree
	 */
	void exitCreatedName(KnowExtParser.CreatedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link KnowExtParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreatorRest(KnowExtParser.ArrayCreatorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnowExtParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreatorRest(KnowExtParser.ArrayCreatorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link KnowExtParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 */
	void enterNonWildcardTypeArguments(KnowExtParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnowExtParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 */
	void exitNonWildcardTypeArguments(KnowExtParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link KnowExtParser#typeList}.
	 * @param ctx the parse tree
	 */
	void enterTypeList(KnowExtParser.TypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnowExtParser#typeList}.
	 * @param ctx the parse tree
	 */
	void exitTypeList(KnowExtParser.TypeListContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link KnowExtParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(KnowExtParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnowExtParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(KnowExtParser.ArgumentsContext ctx);
}