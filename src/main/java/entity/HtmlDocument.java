package entity;
import org.jsoup.nodes.Document;

public class HtmlDocument {
	//import com.scalified.tree.TreeNode;
	//import com.scalified.tree.multinode.ArrayMultiTreeNode;

		private Document doc;
		//TreeNode<String> n1 = new ArrayMultiTreeNode<>("n1");
		public HtmlDocument(Document doc) {
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

	

}
