package parserimpl;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.apache.log4j.Logger;

import entity.NodeAttributes;
import entity.Tree;
import entity.enums.EnumValues;
import entity.enums.EnumValues.NodeType;
import entity.enums.EnumValues.ScopeType;
import exception.ParserException;
import parser.KnowExtParser;
import parser.KnowExtParser.ComplexTypeContext;
import parser.KnowExtParser.ExprContext;
import parser.KnowExtParser.ExprListContext;
import parser.KnowExtParser.PrimitiveTypeContext;
import parser.KnowExtParserBaseListener;

public class KnowExtParserBaseListenerImpl extends KnowExtParserBaseListener {

	final static Logger logger = Logger.getLogger(KnowExtParserBaseListenerImpl.class);

	public KnowExtParser parser;
	public boolean isMainMethod;
	public KnowExtEngine knowExtengine;
	Map<ParseTree, Object> globalSymbolTable = new HashMap<ParseTree, Object>();
	Set<NodeAttributes> globalObjectMemorySet = new HashSet<NodeAttributes>();

	// TODO Change Symbol Table to Maven...

	public void setValue(ParseTree node, int value) {
		globalSymbolTable.put(node, value);
	}

	public Object getValue(ParseTree node) {
		return globalSymbolTable.get(node);
	}

	public void writeMemory() {
		System.out.println("Program Symbol Table: size of " + globalSymbolTable.size());
		for (ParseTree key : globalSymbolTable.keySet()) {
			System.out.println(key.getText() + ":" + globalSymbolTable.get(key));
		}
		System.out.println("Program Object Memory:   size of " + globalObjectMemorySet.size());
		for (NodeAttributes nodeAttributes : globalObjectMemorySet)
			System.out.println(nodeAttributes.toString());
	}

	public KnowExtParserBaseListenerImpl(KnowExtParser pparser, KnowExtEngine pKnowExtengine) {
		this.parser = pparser;
		knowExtengine = pKnowExtengine;
	}

	@Override
	public void enterVarDecl(KnowExtParser.VarDeclContext ctx) {
		logger.info("::::" + ctx.getText());
	}

	/**
	 * Enter a parse tree produced by {@link KnowExtParser#functionDecl}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	@Override
	public void enterFunctionDecl(KnowExtParser.FunctionDeclContext ctx) {
		String methodName = ctx.IDENTIFIER().getText();
		switch (methodName) {
		case "main":
			logger.info("Main Method Entrance");
			isMainMethod = true;
			break;
		default:
			logger.info("Other Method Entrance:" + methodName);
			break;
		}
	}

	/**
	 * Exit a parse tree produced by {@link KnowExtParser#functionDecl}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	@Override
	public void exitFunctionDecl(KnowExtParser.FunctionDeclContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterExpr(KnowExtParser.ExprContext ctx) {

	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitExpr(KnowExtParser.ExprContext ctx) {
		if (ctx.IDENTIFIER() != null) {
			String methodName = ctx.IDENTIFIER().getText();
			ExprListContext exprList = ctx.exprList();

			NodeAttributes nodeAttributes = new NodeAttributes();
			switch (methodName) {
			case "openFile":
				NodeAttributes fileStrAttribute = (NodeAttributes) globalSymbolTable
						.get(exprList.expr(0).primary().literal());
				Tree tree = knowExtengine.openFile(fileStrAttribute.getValue().toString());
				nodeAttributes.value(tree).scope(ScopeType.GLOBAL).type(NodeType.TREE);
				globalSymbolTable.put(ctx, nodeAttributes);
				logger.info("openFile Method Exit" + exprList.getText());
				break;
			case "saveUrl":
				NodeAttributes urlAddress = (NodeAttributes) globalSymbolTable
						.get(exprList.expr(0).primary().literal());
				NodeAttributes fileNameToSave = (NodeAttributes) globalSymbolTable
						.get(exprList.expr(1).primary().literal());

				knowExtengine.saveUrl(urlAddress.getValue().toString(), fileNameToSave.getValue().toString());
				break;
			case "openUrl":
				NodeAttributes fileNameToOpenUrl = (NodeAttributes) globalSymbolTable
						.get(exprList.expr(0).primary().literal());
				Tree t = knowExtengine.openUrl(fileNameToOpenUrl.getValue().toString());
				nodeAttributes.value(t).scope(ScopeType.GLOBAL).type(EnumValues.NodeType.TREE);
				globalSymbolTable.put(ctx, nodeAttributes);
				logger.info("openUrl Method Exit" + exprList.getText());
				break;
			default:
				logger.info("Other Method Exit:" + methodName);
				break;

			}
		} else if (ctx.ASSIGN() != null) {
			ExprContext expr1 = ctx.expr(0);
			ExprContext expr2 = ctx.expr(1);
			logger.info("Assign Operation:" + expr1.getText() + " :=: " + expr2.getText());
			globalSymbolTable.put(expr1, globalSymbolTable.get(expr2));
		} else if (ctx.ADD() != null || ctx.SUB() != null || ctx.MUL() != null || ctx.DIV() != null) {
			ExprContext expr1 = ctx.expr(0);
			ExprContext expr2 = ctx.expr(1);
			if (globalSymbolTable.get(expr1) != null && globalSymbolTable.get(expr2) != null) {
				EnumValues.NodeType expr1Type = ((NodeAttributes) globalSymbolTable.get(expr1)).getType();
				EnumValues.NodeType expr2Type = ((NodeAttributes) globalSymbolTable.get(expr2)).getType();
				EnumValues.NodeType resultType = null;
				if ((resultType = isCompatible(expr1Type, expr2Type)) != null) {
					Object expr1Value = ((NodeAttributes) globalSymbolTable.get(expr1)).getValue();
					Object expr2Value = ((NodeAttributes) globalSymbolTable.get(expr2)).getValue();
					Object resultValue = null;
					if (ctx.ADD() != null)
						resultValue = add(expr1Value, expr2Value, resultType);
					else if (ctx.SUB() != null)
						resultValue = substract(expr1Value, expr2Value, resultType);
					else if (ctx.MUL() != null)
						resultValue = multiply(expr1Value, expr2Value, resultType);
					else if (ctx.DIV() != null)
						resultValue = divide(expr1Value, expr2Value, resultType);
					NodeAttributes nodeAttributes = new NodeAttributes();
					nodeAttributes.value(resultValue).type(resultType);
					globalSymbolTable.put(ctx, nodeAttributes);
					logger.info("Adding/Substract/Multiply/Divide Operation:" + expr1.getText() + ":OP:"
							+ expr2.getText() + "=" + resultValue);
				} else {
					logger.error("Incompatible Types:" + ctx.getText());
					throw new UnsupportedOperationException();
				}
			}
		} else if (ctx.EQUAL() != null) {
			ExprContext expr1 = ctx.expr(0);
			ExprContext expr2 = ctx.expr(1);
			EnumValues.NodeType expr1Type = ((NodeAttributes) globalSymbolTable.get(expr1)).getType();
			EnumValues.NodeType expr2Type = ((NodeAttributes) globalSymbolTable.get(expr2)).getType();
			Object expr1Value = ((NodeAttributes) globalSymbolTable.get(expr1)).getValue();
			Object expr2Value = ((NodeAttributes) globalSymbolTable.get(expr2)).getValue();
			NodeAttributes nodeAttributes = new NodeAttributes();
			if (expr1Type == expr2Type && expr1Value != null && expr1Value.equals(expr2Value)) {
				nodeAttributes.value(Boolean.TRUE).type(NodeType.BOOL);
			} else {
				nodeAttributes.value(Boolean.FALSE).type(NodeType.BOOL);
			}
			globalSymbolTable.put(ctx, nodeAttributes);
		} else if (ctx.primary() != null) {
			globalSymbolTable.put(ctx, globalSymbolTable.get(ctx.primary()));
		}

	}

	private Object divide(Object expr1Value, Object expr2Value, NodeType resultType) {
		if (NodeType.INT.equals(resultType)) {
			Integer result = ((Integer) expr1Value).intValue() / ((Integer) expr2Value).intValue();
			return result;
		} else if (NodeType.STRING.equals(resultType)) {
			return new UnsupportedOperationException();
		} else if (NodeType.DOUBLE.equals(resultType)) {
			Double result = ((Double) expr1Value).doubleValue() / ((Double) expr2Value).doubleValue();
			return result;
		} else if (NodeType.TREE.equals(resultType)) {
			return new UnsupportedOperationException();
		}
		return null;
	}

	private Object multiply(Object expr1Value, Object expr2Value, NodeType resultType) {
		if (NodeType.INT.equals(resultType)) {
			Integer result = ((Integer) expr1Value).intValue() * ((Integer) expr2Value).intValue();
			return result;
		} else if (NodeType.STRING.equals(resultType)) {
			return new UnsupportedOperationException();
		} else if (NodeType.DOUBLE.equals(resultType)) {
			Double result = ((Double) expr1Value).doubleValue() * ((Double) expr2Value).doubleValue();
			return result;
		} else if (NodeType.TREE.equals(resultType)) {
			return new UnsupportedOperationException();
		}
		return null;
	}

	private Object add(Object expr1Value, Object expr2Value, NodeType resultType) {
		if (NodeType.INT.equals(resultType)) {
			Integer result = ((Integer) expr1Value).intValue() + ((Integer) expr2Value).intValue();
			return result;
		} else if (NodeType.STRING.equals(resultType)) {
			String result = ((String) expr1Value) + (expr2Value.toString());
			return result;
		} else if (NodeType.DOUBLE.equals(resultType)) {
			Double result = ((Double) expr1Value).doubleValue() + ((Double) expr2Value).doubleValue();
			return result;
		} else if (NodeType.TREE.equals(resultType)) {
			Tree result = addTree((Tree) expr1Value, (Tree) expr2Value);
			return result;
		}
		return null;

	}

	private Object substract(Object expr1Value, Object expr2Value, NodeType resultType) {
		if (NodeType.INT.equals(resultType)) {
			Integer result = ((Integer) expr1Value).intValue() - ((Integer) expr2Value).intValue();
			return result;
		} else if (NodeType.STRING.equals(resultType)) {
			return new UnsupportedOperationException();
		} else if (NodeType.DOUBLE.equals(resultType)) {
			Double result = ((Double) expr1Value).doubleValue() - ((Double) expr2Value).doubleValue();
			return result;
		} else if (NodeType.TREE.equals(resultType)) {
			Tree result = substractTree((Tree) expr1Value, (Tree) expr2Value);
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
		if (expr1Type.equals(expr2Type)) {
			return expr1Type;
		} else if (NodeType.STRING.equals(expr1Type)
				&& (NodeType.INT.equals(expr2Type) || NodeType.DOUBLE.equals(expr2Type))) {
			return NodeType.STRING;
		} else if ((NodeType.INT.equals(expr1Type) && NodeType.DOUBLE.equals(expr2Type))
				|| (NodeType.INT.equals(expr2Type) && NodeType.DOUBLE.equals(expr1Type))) {
			return NodeType.DOUBLE;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterLiteral(KnowExtParser.LiteralContext ctx) {
		logger.info("literalText:" + ctx.getText());
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitLiteral(KnowExtParser.LiteralContext ctx) {
		TerminalNode stringLiteral = ctx.STRING_LITERAL();
		TerminalNode decimalLiteral = ctx.DECIMAL_LITERAL();
		TerminalNode boolLiteral = ctx.BOOL_LITERAL();

		if (stringLiteral != null) {
			NodeAttributes nodeAttributes = new NodeAttributes();
			nodeAttributes.value(convertToStr(stringLiteral.getText())).type(EnumValues.NodeType.STRING);
			globalSymbolTable.put(ctx, nodeAttributes);
			logger.info("String literal:" + stringLiteral);
		} else if (decimalLiteral != null) {
			NodeAttributes nodeAttributes = new NodeAttributes();
			nodeAttributes.value(Integer.parseInt(decimalLiteral.getText())).type(EnumValues.NodeType.INT);
			globalSymbolTable.put(ctx, nodeAttributes);
			logger.info("Decimal literal:" + decimalLiteral);
		} else if (boolLiteral != null) {
			NodeAttributes nodeAttributes = new NodeAttributes();
			nodeAttributes.value(Boolean.parseBoolean(boolLiteral.getText())).type(EnumValues.NodeType.BOOL);
			globalSymbolTable.put(ctx, nodeAttributes);
			logger.info("Decimal literal:" + decimalLiteral);
		} else {
			logger.info("Other Literal Values");
		}
		// TODO other literals
	}

	public static String convertToStr(String stringLiteral) {
		return stringLiteral.substring(1, stringLiteral.length() - 1);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void visitTerminal(TerminalNode node) {

	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitPrimary(KnowExtParser.PrimaryContext ctx) {
		if (ctx.literal() != null) {
			globalSymbolTable.put(ctx, globalSymbolTable.get(ctx.literal()));
		} else if (ctx.LPAREN() != null) {
			globalSymbolTable.put(ctx, globalSymbolTable.get(ctx.expr()));
		}
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitVarDecl(KnowExtParser.VarDeclContext ctx) {
		if (ctx.typeType() != null) {
			TerminalNode identifier = ctx.IDENTIFIER();
			if (ctx.typeType().complexType() != null) {
				ComplexTypeContext complexType = ctx.typeType().complexType();
				if (complexType.TREE() != null) {
					extractType(ctx, identifier, NodeType.TREE);
				} else if (complexType.LIST() != null) {
					extractType(ctx, identifier, NodeType.LIST);
				} else if (complexType.SET() != null) {
					extractType(ctx, identifier, NodeType.SET);
				}
			} else {
				PrimitiveTypeContext primitiveType = ctx.typeType().primitiveType();

				if (primitiveType != null) {
					if (primitiveType.INT() != null) {
						extractType(ctx, identifier, NodeType.INT);
					} else if (primitiveType.CHAR() != null) {
						extractType(ctx, identifier, NodeType.CHAR);
					} else if (primitiveType.BOOLEAN() != null) {
						extractType(ctx, identifier, NodeType.BOOL);
					} else if (primitiveType.LONG() != null) {
						extractType(ctx, identifier, NodeType.LONG);
					} else if (primitiveType.DOUBLE() != null) {
						extractType(ctx, identifier, NodeType.DOUBLE);
					} else if (primitiveType.FLOAT() != null) {
						extractType(ctx, identifier, NodeType.FLOAT);
					} else if (primitiveType.SHORT() != null) {
						extractType(ctx, identifier, NodeType.SHORT);
					} else if (primitiveType.BYTE() != null) {
						extractType(ctx, identifier, NodeType.BYTE);
					} else {
						try {
							throw new ParserException("Unsupported Primitive Type:" + primitiveType);
						} catch (ParserException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}

				} else {
					// TODO typetype: ('[' ']');

				}
			}
		}
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 * 
	 * @throws ParserException
	 */

	private void extractType(KnowExtParser.VarDeclContext ctx, TerminalNode identifier, NodeType type) {
		NodeAttributes nodeAttributes = new NodeAttributes();
		nodeAttributes.type(type).scope(ScopeType.GLOBAL).name(identifier.getText());
		if (ctx.expr() != null) {
			Object value = globalSymbolTable.get(ctx.expr());
			if ((type.equals(NodeType.TREE) && value != null
					&& !((NodeAttributes) value).getValue().getClass().equals(Tree.class))) {
				try {
					throw new ParserException("Invalid type assignment: " + value.getClass() + " is assigned to "
							+ NodeType.TREE + " type");
				} catch (ParserException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				nodeAttributes.setValue(value);
			}
		}
		if (!globalObjectMemorySet.add(nodeAttributes)) {
			try {
				throw new ParserException("Duplicate field:" + nodeAttributes);
			} catch (ParserException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}