import knowext.KnowExtParser;
import knowext.KnowExtParserBaseListener;

public class ExtractInterfaceListener extends KnowExtParserBaseListener {

	public KnowExtParser parser;
	public ExtractInterfaceListener(KnowExtParser pparser) {
		this.parser=pparser;
	}
	
	@Override
	public void enterVarDecl(KnowExtParser.VarDeclContext ctx) {
		System.out.println("::::"+ctx.getText());
	}
	
	
}