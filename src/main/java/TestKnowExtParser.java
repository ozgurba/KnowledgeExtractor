import java.io.IOException;


import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import knowext.KnowExtLexer;
import knowext.KnowExtParser;

public class TestKnowExtParser {
	
public static void main(String[] args) throws IOException {
	CharStream charStream = CharStreams.fromFileName("src/main/antlr/test.kext");
	KnowExtLexer knowExtLexer=new KnowExtLexer(charStream); 
	CommonTokenStream tokens = new CommonTokenStream(knowExtLexer); 
	KnowExtParser parser = new KnowExtParser(tokens); 
    ParseTree tree = parser.file(); 
    System.out.println(tree.toStringTree(parser)); 
    
    ParseTreeWalker walker = new ParseTreeWalker(); // create standard walker
    KnowExtEngine knowExtEngine=new KnowExtEngine();
    ExtractInterfaceListener extractor = new ExtractInterfaceListener(parser, knowExtEngine);
    walker.walk(extractor, tree); // initiate walk of tree with listener
    System.out.println(tree.toStringTree(parser)); 
    walker.walk(extractor, tree);
    System.out.println(tree.toStringTree(parser)); 
    
	
}



}
