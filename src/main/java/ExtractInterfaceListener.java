import knowext.KnowExtParser;
import knowext.KnowExtParserBaseListener;

public class ExtractInterfaceListener extends KnowExtParserBaseListener {

	public KnowExtParser parser;
	public boolean isMainMethod;
	public ExtractInterfaceListener(KnowExtParser pparser) {
		this.parser=pparser;
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
			System.out.println("Other Methods Entrance:"+methodName);	
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
			System.out.println("Other Methods Exit:"+methodName);	
			break;

		}
	}

}