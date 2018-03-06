import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import knowext.KnowExtLexer;
import knowext.KnowExtParser;

public class TestKnowExtParser {
	
public static void main(String[] args) throws IOException {
	String dataspec="";
	// CharStream stream = new ANTLRInputStream(dataspec);
	KnowExtLexer knowExtLexer=new KnowExtLexer(CharStreams.fromFileName("src/main/antlr/test.kext")); 
	InputStream stream = new ByteArrayInputStream(dataspec.getBytes(StandardCharsets.UTF_8));
	CommonTokenStream tokens = new CommonTokenStream(knowExtLexer); 
	KnowExtParser parser = new KnowExtParser(tokens); 
    ParseTree tree = parser.blockStatement(); // parse; start at prog <label id="code.tour.main.6"/>
    System.out.println(tree.toStringTree(parser)); // print tree as text <label id="code.tour.main.7"/>
	
}

}
