package memory;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.antlr.v4.runtime.tree.ParseTree;
import org.apache.log4j.Logger;

import entity.NodeAttributes;

public class GlobalSymbolTable{
	final static Logger logger = Logger.getLogger(GlobalSymbolTable.class);
	Map<ParseTree, NodeAttributes> globalSymbolTable = new HashMap<ParseTree, NodeAttributes>();

	public int size() {
		// TODO Auto-generated method stub
		return globalSymbolTable.size();
	}

	public Set<ParseTree> keySet() {
		// TODO Auto-generated method stub
		return ( Set<ParseTree>) globalSymbolTable.keySet();
	}

	public NodeAttributes get(ParseTree key) {
		// TODO Auto-generated method stub
		return globalSymbolTable.get(key);
	}

	public void put(ParseTree ctx, NodeAttributes nodeAttributes) {
		globalSymbolTable.put(ctx,nodeAttributes);
		logger.info("put operation:"+ ctx+"--"+nodeAttributes);
		
	}
	
	public NodeAttributes remove(ParseTree ctx) {
		NodeAttributes remove = globalSymbolTable.remove(ctx);
		logger.info("remove operation:"+ ctx+"--"+remove);
		return remove;
		
	}
	
	
	
	

}
