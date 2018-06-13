package entity;

import org.jsoup.nodes.Document;
//import com.scalified.tree.TreeNode;
//import com.scalified.tree.multinode.ArrayMultiTreeNode;

public class Tree {
	private Document doc;
	//TreeNode<String> n1 = new ArrayMultiTreeNode<>("n1");
	public Tree(Document doc) {
		setDoc(doc);
	}

	public Document getDoc() {
		return doc;
	}

	public void setDoc(Document doc) {
		this.doc = doc;
	}

	@Override
	public String toString() {
		return "Tree [doc=" + doc + "]";
	}
	//TODO implement 
	public boolean isCompatible(Tree otherTree) {
		return true;
	}

}
