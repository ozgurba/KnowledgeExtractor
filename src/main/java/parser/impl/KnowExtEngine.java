package parser.impl;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import crawler.JSoupCrawler;
import entity.Tree;

public class KnowExtEngine {
	final static Logger logger = Logger.getLogger(KnowExtEngine.class);

	public String openFile(String fileName) {
		logger.info("openFile:" + fileName);

		return null;

	}

	public void saveUrl(String urlAddress, String fileNameToSave) {
		logger.info("openUrl:" + urlAddress);
		final Document crawledDoc = JSoupCrawler.crawlUrlPage(urlAddress);
		String xmlDocumentStr = JSoupCrawler.htmlToXML(crawledDoc.html());
		try {
			FileUtils.writeStringToFile(new File(fileNameToSave), xmlDocumentStr, "UTF-8");
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	public Tree openUrl(String url) {

		try {
			Document doc = Jsoup.connect(url).get();
			String title = doc.title();
			logger.info("openUrl:" + url + " title:" + title);
			Tree t = new Tree(doc);
			return t;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

	}
}
