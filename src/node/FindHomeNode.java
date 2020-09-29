package node;

import tree.BlackBoard;
import util.State;
import util.TreeNodeType;

/**
 * FindHomeNode.java
 * @author Kevin Gao on 2020-9-27
 *
 * Implementation of the Find Home Task TreeNode
 */
public class FindHomeNode extends TreeNode {

	/**
	 * Constructor for FindHomeNode
	 * @param descriptor - custom description of the purpose of this TreeNode
	 */
	public FindHomeNode(String descriptor, BlackBoard blackBoard) {
		super(descriptor, TreeNodeType.FIND_HOME, blackBoard);
	}

	// TODO: Implement Order
	public State run() {
		return null;
	}
	
}