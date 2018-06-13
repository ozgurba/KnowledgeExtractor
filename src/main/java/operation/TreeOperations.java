package operation;


import org.jsoup.nodes.Document;
import org.jsoup.nodes.Node;

import entity.Tree;

public class TreeOperations {
	
	public static Tree add(Tree t1,Tree t2) {
		Document doc1=t1.getDoc();
		Document doc2=t2.getDoc();
		Document doc=new Document(null);
		for(Node childNode:doc1.childNodes()) {
			doc.appendChild(childNode);
		}
		for(Node childNode:doc2.childNodes()) {
			doc.appendChild(childNode);
		}
		Tree resultingTree=new Tree(doc);
		return resultingTree;
	}

}
