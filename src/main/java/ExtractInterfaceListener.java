import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.apache.log4j.Logger;

import enums.EnumValues;
import knowext.KnowExtParser;
import knowext.KnowExtParser.ExprContext;
import knowext.KnowExtParser.ExprListContext;
import knowext.KnowExtParserBaseListener;

public class ExtractInterfaceListener extends KnowExtParserBaseListener {

	final static Logger logger = Logger.getLogger(ExtractInterfaceListener.class);


	public KnowExtParser parser;
	public boolean isMainMethod;
	public KnowExtEngine knowExtengine;
	ParseTreeProperty<Object> values=new ParseTreeProperty<>();

	public void setValue(ParseTree node, int value) { values.put(node, value); }

	public Object getValue(ParseTree node) { return values.get(node); }

	public void writeMemory() {
		values.toString();
	}


	public ExtractInterfaceListener(KnowExtParser pparser,KnowExtEngine pKnowExtengine) {
		this.parser=pparser;
		knowExtengine=pKnowExtengine;
	}

	@Override
	public void enterVarDecl(KnowExtParser.VarDeclContext ctx) {
		logger.info("::::"+ctx.getText());
	}

	/**
	 * Enter a parse tree produced by {@link KnowExtParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	public void enterFunctionDecl(KnowExtParser.FunctionDeclContext ctx) {
		String methodName=ctx.IDENTIFIER().getText();
		switch(methodName) {
		case "main":
			logger.info("Main Method Entrance");
			isMainMethod=true;
			break;
		default:
			logger.info("Other Method Entrance:"+methodName);	
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
				logger.info("openFile Method Exit"+exprList.getText());
				break;
			case "saveUrl":
				String urlAddress=(String)values.get(exprList.expr(0).primary().literal().STRING_LITERAL());
				String fileNameToSave=(String)values.get(exprList.expr(1).primary().literal().STRING_LITERAL());

				knowExtengine.saveUrl(urlAddress,fileNameToSave);
				break;
			case "openUrl":
				String fileNameToOpenUrl=(String)values.get(exprList.expr(0).primary().literal().STRING_LITERAL());
				Tree t=knowExtengine.openUrl(fileNameToOpenUrl);
				NodeAttributes nodeAttributes= new NodeAttributes();
				nodeAttributes.value(t).type(EnumValues.NodeType.TREE);
				values.put(ctx, nodeAttributes);
				logger.info("openUrl Method Exit"+exprList.getText());
				break;

			default:
				logger.info("Other Method Exit:"+methodName);	
				break;

			}
		} else if(ctx.ASSIGN()!=null){
			
			ExprContext expr1 = ctx.expr(0);
			ExprContext op = ctx.expr(1);
			ExprContext expr2 = ctx.expr(2);
			if(op!=null)
			logger.info("::"+ctx.getText()+"::"+op.getText());
			if(expr1!=null&&expr2!=null) {
				logger.info("Yupp!!");
			}
		} else if(ctx.ADD()!=null) {
			
		}

	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterLiteral(KnowExtParser.LiteralContext ctx) {
		logger.info("literalText:"+ctx.getText());
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitLiteral(KnowExtParser.LiteralContext ctx) { 
		TerminalNode stringLiteral = ctx.STRING_LITERAL();
		TerminalNode decimalLiteral=ctx.DECIMAL_LITERAL();
		TerminalNode boolLiteral=ctx.BOOL_LITERAL();

		if(stringLiteral!=null) {
			values.put(stringLiteral, convertToStr(stringLiteral.getText()));
			logger.info("String literal:"+stringLiteral);
		}
		else if(decimalLiteral!=null){
			NodeAttributes nodeAttributes=new NodeAttributes();
			nodeAttributes.value(Integer.parseInt(decimalLiteral.getText())).type(EnumValues.NodeType.INT);
			values.put(decimalLiteral, nodeAttributes);
			logger.info("Decimal literal:"+decimalLiteral);
		} else if(boolLiteral!=null){
			NodeAttributes nodeAttributes=new NodeAttributes();
			nodeAttributes.value(Boolean.parseBoolean(boolLiteral.getText())).type(EnumValues.NodeType.BOOL);
			values.put(decimalLiteral, nodeAttributes);
			logger.info("Decimal literal:"+decimalLiteral);
		} else {
			logger.info("Other Literal Values");
		}
		//TODO other literals
	}

	public static String convertToStr(String stringLiteral){
		return stringLiteral.substring(1, stringLiteral.length()-1);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitTerminal(TerminalNode node) {
		//logger.info("Terminal Node:"+node);

	}




}