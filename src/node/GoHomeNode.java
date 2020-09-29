package node;

import tree.BlackBoard;
import util.State;
import util.TreeNodeType;

/**
 * GoHomeNode.java
 * @author Kevin Gao on 2020-9-27
 *
 * Implementation of the Go Home Task TreeNode
 */
public class GoHomeNode extends TreeNode {

	/**
	 * Constructor for GoHomeNode
	 * @param descriptor - custom description of the purpose of this TreeNode
	 */
	public GoHomeNode(String descriptor, BlackBoard blackBoard) {
		super(descriptor, TreeNodeType.GO_HOME, blackBoard);
	}

	// TODO: Implement Order
	public State run() {
		return null;
	}
	
}