import knowext.KnowExtParser;
import knowext.KnowExtParserBaseListener;

public class ExtractInterfaceListener extends KnowExtParserBaseListener {

	public KnowExtParser parser;
	public boolean isMainMethod;
	public KnowExtEngine knowExtengine;
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
		String methodName=ctx.IDENTIFIER().getText();
		switch(methodName) {
		case "main":
			System.out.println("Main Method Exit");
			isMainMethod=false;
			break;
		default:
			System.out.println("Other Method Exit:"+methodName);	
			break;

		}
	}
	
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterMethodCall(KnowExtParser.MethodCallContext ctx) {
		String methodName=ctx.IDENTIFIER().getText();
		switch(methodName) {
		case "open":
			System.out.println("Open Method Call Entrance");
			knowExtengine.open(ctx.expressionList(),isMainMethod);
			break;
		default:
			System.out.println("Other Method Call Entrance:"+methodName);	
			break;
		
			
		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitMethodCall(KnowExtParser.MethodCallContext ctx) {
		String methodName=ctx.IDENTIFIER().getText();
		switch(methodName) {
		case "open":
			System.out.println("Open Method Call Exit");
			knowExtengine.open(ctx.expressionList(),isMainMethod);
			break;
		default:
			System.out.println("Other Method Call Exit:"+methodName);	
			break;
		
			
		}
	}


}