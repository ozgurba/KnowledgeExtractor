import java.io.IOException;
import java.util.Properties;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import knowext.KnowExtLexer;
import knowext.KnowExtParser;

public class TestKnowExtParser {
	
public static void main(String[] args) throws IOException {
	initializeLog4J();
	CharStream charStream = CharStreams.fromFileName("src/main/antlr/test.kext");
	KnowExtLexer knowExtLexer=new KnowExtLexer(charStream); 
	CommonTokenStream tokens = new CommonTokenStream(knowExtLexer); 
	KnowExtParser parser = new KnowExtParser(tokens); 
    ParseTree tree = parser.file(); 
    System.out.println("1:"+tree.toStringTree(parser)); 
    
    ParseTreeWalker walker = new ParseTreeWalker(); // create standard walker
    KnowExtEngine knowExtEngine=new KnowExtEngine();
    ExtractInterfaceListener extractor = new ExtractInterfaceListener(parser, knowExtEngine);
    walker.walk(extractor, tree); // initiate walk of tree with listener
    System.out.println(tree.toStringTree(parser)); 
    
	
}



public static void initializeLog4J() {
	Properties properties=new Properties();
    properties.setProperty("log4j.rootLogger","TRACE,stdout,MyFile");
    properties.setProperty("log4j.rootCategory","TRACE");
    properties.setProperty("log4j.appender.stdout",     "org.apache.log4j.ConsoleAppender");
    properties.setProperty("log4j.appender.stdout.layout",  "org.apache.log4j.PatternLayout");
    properties.setProperty("log4j.appender.stdout.layout.ConversionPattern","%d{yyyy/MM/dd HH:mm:ss.SSS} [%5p] %t (%F) - %m%n");

    properties.setProperty("log4j.appender.MyFile", "org.apache.log4j.RollingFileAppender");
    properties.setProperty("log4j.appender.MyFile.File", "my_example.log");
    properties.setProperty("log4j.appender.MyFile.MaxFileSize", "100KB");
    properties.setProperty("log4j.appender.MyFile.MaxBackupIndex", "1");
    properties.setProperty("log4j.appender.MyFile.layout",  "org.apache.log4j.PatternLayout");
    properties.setProperty("log4j.appender.MyFile.layout.ConversionPattern","%d{yyyy/MM/dd HH:mm:ss.SSS} [%5p] %t (%F) - %m%n");

    PropertyConfigurator.configure(properties);

    Logger logger = Logger.getLogger("MyFile");
/*
    logger.fatal("This is a FATAL message.");
    logger.error("This is an ERROR message.");
    logger.warn("This is a WARN message.");
    logger.info("This is an INFO message.");
    logger.debug("This is a DEBUG message.");
    logger.trace("This is a TRACE message.");*/
}



}
