
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.jsoup.nodes.Document;

import converter.Converter;


public class KnowExtEngine {
	Map <Object,Object> memory=new HashMap<Object,Object>();
	final static Logger logger = Logger.getLogger(KnowExtEngine.class);
	

	public String openFile(String fileName) {
		logger.info("openFile:" + fileName);
		return null;
		
	}
	
	public void openUrl(String url,String fileName) {
		
	}

	public void saveUrl(String urlAddress, String fileNameToSave) {
		logger.info("openUrl:" + urlAddress);
		final Document crawledDoc = Converter.crawlUrlPage(urlAddress);
		String xmlDocumentStr = Converter.htmlToXML(crawledDoc.html());
		try {
			FileUtils.writeStringToFile(new File(fileNameToSave),
					xmlDocumentStr, "UTF-8");
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}



	
	

}
