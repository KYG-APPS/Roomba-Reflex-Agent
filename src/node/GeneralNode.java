package node;

import tree.BlackBoard;
import util.State;
import util.TreeNodeType;

/**
 * GeneralNode.java
 * @author Kevin Gao on 2020-9-27
 *
 * Implementation of the General Condition TreeNode
 */
public class GeneralNode extends TreeNode {

	/**
	 * Constructor for GeneralNode
	 * @param descriptor - custom description of the purpose of this TreeNode
	 */
	public GeneralNode(String descriptor, BlackBoard blackBoard) {
		super(descriptor, TreeNodeType.GENERAL, blackBoard);
	}

	// TODO: Implement Order
	public State run() {
		return null;
	}
	
}