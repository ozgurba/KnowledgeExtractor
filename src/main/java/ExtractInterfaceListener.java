import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.TerminalNode;

import knowext.KnowExtParser;
import knowext.KnowExtParser.ExprListContext;
import knowext.KnowExtParserBaseListener;

public class ExtractInterfaceListener extends KnowExtParserBaseListener {

	public KnowExtParser parser;
	public boolean isMainMethod;
	public KnowExtEngine knowExtengine;
	ParseTreeProperty<Object> values=new ParseTreeProperty<>();

	public void setValue(ParseTree node, int value) { values.put(node, value); }

	public Object getValue(ParseTree node) { return values.get(node); }

	public ExtractInterfaceListener(KnowExtParser pparser,KnowExtEngine pKnowExtengine) {
		this.parser=pparser;
		knowExtengine=pKnowExtengine;
	}

	@Override
	public void enterVarDecl(KnowExtParser.VarDeclContext ctx) {
		System.out.println("::::"+ctx.getText());
	}

	/**
	 * Enter a parse tree produced by {@link KnowExtParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	public void enterFunctionDecl(KnowExtParser.FunctionDeclContext ctx) {
		String methodName=ctx.IDENTIFIER().getText();
		switch(methodName) {
		case "main":
			System.out.println("Main Method Entrance");
			isMainMethod=true;
			break;
		default:
			System.out.println("Other Method Entrance:"+methodName);	
			break;
		}
	}
	/**
	 * Exit a parse tree produced by {@link KnowExtParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	public void exitFunctionDecl(KnowExtParser.FunctionDeclContext ctx){
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterExpr(KnowExtParser.ExprContext ctx) { 
		if(ctx.IDENTIFIER()!=null) {
			String methodName=ctx.IDENTIFIER().getText();
			switch(methodName) {
			case "open":
				System.out.println("open Method Entrance");
				break;
			default:
				System.out.println("Other Method Entrance:"+methodName);	
				break;

			}
		}


	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitExpr(KnowExtParser.ExprContext ctx) {
		if(ctx.IDENTIFIER()!=null) {
			String methodName=ctx.IDENTIFIER().getText();
			ExprListContext exprList = ctx.exprList();
			
			switch(methodName) {
			case "openFile":
				String fileNameToOpen=(String)values.get(exprList.expr(0).primary().literal().STRING_LITERAL());
				knowExtengine.openFile(fileNameToOpen);
				System.out.println("open Method Exit"+exprList.getText());
				break;
			case "saveUrl":
				String urlAddress=(String)values.get(exprList.expr(0).primary().literal().STRING_LITERAL());
				String fileNameToSave=(String)values.get(exprList.expr(1).primary().literal().STRING_LITERAL());
				
				knowExtengine.saveUrl(urlAddress,fileNameToSave);
				break;
			default:
				System.out.println("Other Method Exit:"+methodName);	
				break;

			}
		}
	}
	
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterLiteral(KnowExtParser.LiteralContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitLiteral(KnowExtParser.LiteralContext ctx) { 
		TerminalNode string_LITERAL = ctx.STRING_LITERAL();
		if(string_LITERAL!=null) {
			values.put(string_LITERAL, convertToStr(string_LITERAL.getText()));
			System.out.println("String literal:"+string_LITERAL);
		}
		else {
			System.out.println("Other Literal Values");
		}
		//TODO other literals
	}
	
	public static String convertToStr(String stringLiteral){
		return stringLiteral.substring(1, stringLiteral.length()-1);
	}




}