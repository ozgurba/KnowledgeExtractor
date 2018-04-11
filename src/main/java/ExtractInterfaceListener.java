import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.apache.log4j.Logger;
import org.antlr.v4.runtime.tree.ParseTree;

import enums.EnumValues;
import enums.EnumValues.NodeType;
import knowext.KnowExtParser;
import knowext.KnowExtParser.ExprContext;
import knowext.KnowExtParser.ExprListContext;
import knowext.KnowExtParserBaseListener;

public class ExtractInterfaceListener extends KnowExtParserBaseListener {

	final static Logger logger = Logger.getLogger(ExtractInterfaceListener.class);


	public KnowExtParser parser;
	public boolean isMainMethod;
	public KnowExtEngine knowExtengine;
	Map<ParseTree,Object> values=new HashMap<ParseTree,Object>();

	public void setValue(ParseTree node, int value) { values.put(node, value); }

	public Object getValue(ParseTree node) { return values.get(node); }

	public void writeMemory() {
		System.out.println("Program Memory");
		for (ParseTree key : values.keySet()) {
			System.out.println(key.getText()+":"+values.get(key));
		}
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
			ExprContext expr2 = ctx.expr(1);
			logger.info("Assign Operation:"+expr1.getText()+" :=: "+expr2.getText());
			values.put(expr1, values.get(expr2));
		} else if(ctx.ADD()!=null||ctx.SUB()!=null||ctx.MUL()!=null||ctx.DIV()!=null) {
			ExprContext expr1 = ctx.expr(0);
			ExprContext expr2 = ctx.expr(1);
			if(values.get(expr1)!=null&&values.get(expr2)!=null) {
				EnumValues.NodeType expr1Type=((NodeAttributes)values.get(expr1)).getType();
				EnumValues.NodeType expr2Type=((NodeAttributes)values.get(expr2)).getType();
				EnumValues.NodeType resultType=null;
				if((resultType=isCompatible(expr1Type,expr2Type))!=null) {
					Object expr1Value=((NodeAttributes)values.get(expr1)).getValue();
					Object expr2Value=((NodeAttributes)values.get(expr2)).getValue();
					Object resultValue=null;
					if(ctx.ADD()!=null)
						resultValue=add(expr1Value,expr2Value,resultType);
					else if(ctx.SUB()!=null)
						resultValue=substract(expr1Value,expr2Value,resultType);
					else if(ctx.MUL()!=null)
						resultValue=multiply(expr1Value,expr2Value,resultType);
					else if(ctx.DIV()!=null)
						resultValue=divide(expr1Value,expr2Value,resultType);
					NodeAttributes nodeAttributes=new NodeAttributes();
					nodeAttributes.value(resultValue).type(resultType);
					values.put(ctx, nodeAttributes);
					logger.info("Adding/Substract/Multiply/Divide Operation:"+expr1.getText()+":OP:"+expr2.getText()+"="+resultValue);
				}
			}
		} else if(ctx.primary()!=null) {
			values.put(ctx, values.get(ctx.primary()));
		}

	}

	private Object divide(Object expr1Value, Object expr2Value, NodeType resultType) {
		if(NodeType.INT.equals(resultType)) {
			Integer result=((Integer)expr1Value).intValue()/((Integer)expr2Value).intValue();
			return result;
		} else if(NodeType.STRING.equals(resultType)) {
			return new UnsupportedOperationException();
		} else if(NodeType.DOUBLE.equals(resultType)) {
			Double result=((Double)expr1Value).doubleValue()/((Double)expr2Value).doubleValue();
			return result;
		} else if(NodeType.TREE.equals(resultType)) {
			return new UnsupportedOperationException();
		} 
		return null;
	}

	private Object multiply(Object expr1Value, Object expr2Value, NodeType resultType) {
		if(NodeType.INT.equals(resultType)) {
			Integer result=((Integer)expr1Value).intValue()*((Integer)expr2Value).intValue();
			return result;
		} else if(NodeType.STRING.equals(resultType)) {
			return new UnsupportedOperationException();
		} else if(NodeType.DOUBLE.equals(resultType)) {
			Double result=((Double)expr1Value).doubleValue()*((Double)expr2Value).doubleValue();
			return result;
		} else if(NodeType.TREE.equals(resultType)) {
			return new UnsupportedOperationException();
		} 
		return null;
	}

	private Object add(Object expr1Value, Object expr2Value, NodeType resultType) {
		if(NodeType.INT.equals(resultType)) {
			Integer result=((Integer)expr1Value).intValue()+((Integer)expr2Value).intValue();
			return result;
		} else if(NodeType.STRING.equals(resultType)) {
			String result=((String)expr1Value)+(expr2Value.toString());
			return result;
		} else if(NodeType.DOUBLE.equals(resultType)) {
			Double result=((Double)expr1Value).doubleValue()+((Double)expr2Value).doubleValue();
			return result;
		} else if(NodeType.TREE.equals(resultType)) {
			Tree result=addTree((Tree)expr1Value,(Tree)expr2Value);
			return result;
		} 
		return null;
		
	}
	
	private Object substract(Object expr1Value, Object expr2Value, NodeType resultType) {
		if(NodeType.INT.equals(resultType)) {
			Integer result=((Integer)expr1Value).intValue()-((Integer)expr2Value).intValue();
			return result;
		} else if(NodeType.STRING.equals(resultType)) {
			return new UnsupportedOperationException();
		} else if(NodeType.DOUBLE.equals(resultType)) {
			Double result=((Double)expr1Value).doubleValue()-((Double)expr2Value).doubleValue();
			return result;
		} else if(NodeType.TREE.equals(resultType)) {
			Tree result=substractTree((Tree)expr1Value,(Tree)expr2Value);
			return result;
		} 
		return null;
		
	}

	private Tree substractTree(Tree expr1Value, Tree expr2Value) {
		// TODO Auto-generated method stub
		return null;
	}

	private Tree addTree(Tree expr1Value, Tree expr2Value) {
		// TODO Auto-generated method stub
		return null;
	}

	private NodeType isCompatible(NodeType expr1Type, NodeType expr2Type) {
		if(expr1Type.equals(expr2Type)) {
			return expr1Type;
		} else if(NodeType.STRING.equals(expr1Type)&&(NodeType.INT.equals(expr2Type)||NodeType.DOUBLE.equals(expr2Type))) {
			return NodeType.STRING;
		} else if((NodeType.INT.equals(expr1Type)&&NodeType.DOUBLE.equals(expr2Type))||(NodeType.INT.equals(expr2Type)&&NodeType.DOUBLE.equals(expr1Type))) {
			return NodeType.DOUBLE;
		}
		return null;
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
			NodeAttributes nodeAttributes=new NodeAttributes();
			nodeAttributes.value(convertToStr(stringLiteral.getText())).type(EnumValues.NodeType.STRING);
			values.put(ctx,nodeAttributes );
			logger.info("String literal:"+stringLiteral);
		}
		else if(decimalLiteral!=null){
			NodeAttributes nodeAttributes=new NodeAttributes();
			nodeAttributes.value(Integer.parseInt(decimalLiteral.getText())).type(EnumValues.NodeType.INT);
			values.put(ctx, nodeAttributes);
			logger.info("Decimal literal:"+decimalLiteral);
		} else if(boolLiteral!=null){
			NodeAttributes nodeAttributes=new NodeAttributes();
			nodeAttributes.value(Boolean.parseBoolean(boolLiteral.getText())).type(EnumValues.NodeType.BOOL);
			values.put(ctx, nodeAttributes);
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

	}
	
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitPrimary(KnowExtParser.PrimaryContext ctx) { 
		if(ctx.literal()!=null) {	
			values.put(ctx, values.get(ctx.literal()));
		} else if(ctx.LPAREN()!=null) {
			values.put(ctx, values.get(ctx.expr()));
		}
	}
	
	
}