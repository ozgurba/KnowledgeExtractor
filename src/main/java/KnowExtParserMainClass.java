import java.io.IOException;
import java.util.Arrays;
import java.util.Properties;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import parser.KnowExtLexer;
import parser.KnowExtParser;
import parserimpl.KnowExtEngine;
import parserimpl.KnowExtParserBaseListenerImpl;

public class KnowExtParserMainClass {

	private static final String SRC_MAIN_ANTLR_TEST_KEXT = "src/main/antlr/test.kext";

	public static void main(String[] args) throws IOException {
		initializeLog4J();
		CharStream charStream = CharStreams.fromFileName(SRC_MAIN_ANTLR_TEST_KEXT);
		KnowExtLexer knowExtLexer = new KnowExtLexer(charStream);
		CommonTokenStream tokens = new CommonTokenStream(knowExtLexer);
		KnowExtParser parser = new KnowExtParser(tokens);
		ParseTree tree = parser.file();
		showAst(parser, tree);
		System.out.println("Parse Tree of File("+SRC_MAIN_ANTLR_TEST_KEXT+"):" + tree.toStringTree(parser));

		ParseTreeWalker walker = new ParseTreeWalker(); // create standard walker
		KnowExtEngine knowExtEngine = new KnowExtEngine();
		KnowExtParserBaseListenerImpl extractor = new KnowExtParserBaseListenerImpl(parser, knowExtEngine);
		walker.walk(extractor, tree); // initiate walk of tree with listener
		System.out.println(tree.toStringTree(parser));
		extractor.writeMemoryToFile();

	}

	private static void showAst(KnowExtParser parser, ParseTree tree) {
		//show AST in GUI
        JFrame frame = new JFrame("Antlr AST");
        JPanel panel = new JPanel();
        TreeViewer viewr = new TreeViewer(Arrays.asList(
                parser.getRuleNames()),tree);
        viewr.setScale(0.8);//scale a little
        panel.add(viewr);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000,1000);
        
        frame.setVisible(true);
	}

	public static void initializeLog4J() {
		Properties properties = new Properties();
		properties.setProperty("log4j.rootLogger", "TRACE,stdout,MyFile");
		properties.setProperty("log4j.rootCategory", "TRACE");
		properties.setProperty("log4j.appender.stdout", "org.apache.log4j.ConsoleAppender");
		properties.setProperty("log4j.appender.stdout.layout", "org.apache.log4j.PatternLayout");
		properties.setProperty("log4j.appender.stdout.layout.ConversionPattern",
				"%d{yyyy/MM/dd HH:mm:ss.SSS} [%5p] %t (%F) - %m%n");

		properties.setProperty("log4j.appender.MyFile", "org.apache.log4j.RollingFileAppender");
		properties.setProperty("log4j.appender.MyFile.File", "my_example.log");
		properties.setProperty("log4j.appender.MyFile.MaxFileSize", "100KB");
		properties.setProperty("log4j.appender.MyFile.MaxBackupIndex", "1");
		properties.setProperty("log4j.appender.MyFile.layout", "org.apache.log4j.PatternLayout");
		properties.setProperty("log4j.appender.MyFile.layout.ConversionPattern",
				"%d{yyyy/MM/dd HH:mm:ss.SSS} [%5p] %t (%F) - %m%n");

		PropertyConfigurator.configure(properties);

		Logger logger = Logger.getLogger("MyFile");
		/*
		 * logger.fatal("This is a FATAL message.");
		 * logger.error("This is an ERROR message.");
		 * logger.warn("This is a WARN message.");
		 * logger.info("This is an INFO message.");
		 * logger.debug("This is a DEBUG message.");
		 * logger.trace("This is a TRACE message.");
		 */
	}

}
