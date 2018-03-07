import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import knowext.KnowExtLexer;
import knowext.KnowExtParser;

public class TestKnowExtParser {
	
public static void main(String[] args) throws IOException {
	KnowExtLexer knowExtLexer=new KnowExtLexer(CharStreams.fromFileName("src/main/antlr/test.kext")); 
	CommonTokenStream tokens = new CommonTokenStream(knowExtLexer); 
	KnowExtParser parser = new KnowExtParser(tokens); 
    ParseTree tree = parser.blockStatement(); 
    ParseTreeWalker walker = new ParseTreeWalker(); // create standard walker
    ExtractInterfaceListener extractor = new ExtractInterfaceListener(parser);
    walker.walk(extractor, tree); // initiate walk of tree with listener
    System.out.println(tree.toStringTree(parser)); 
    walker.walk(extractor, tree);
    System.out.println(tree.toStringTree(parser)); 
    
	
}



}
