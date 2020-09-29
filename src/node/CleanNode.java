package node;

import tree.BlackBoard;
import util.State;
import util.TreeNodeType;

/**
 * CleanNode.java
 * @author Kevin Gao on 2020-9-27
 *
 * Implementation of the Clean Task TreeNode
 */
public class CleanNode extends TreeNode {

	/**
	 * Constructor for CleanNode
	 * @param descriptor - custom description of the purpose of this TreeNode
	 */
	public CleanNode(String descriptor, BlackBoard blackBoard) {
		super(descriptor, TreeNodeType.CLEAN, blackBoard);
	}

	// TODO: Implement Order
	public State run() {
		return null;
	}
	
}