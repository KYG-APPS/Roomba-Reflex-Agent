package node;

import tree.BlackBoard;
import util.State;
import util.TreeNodeType;

/**
 * CleanSpotNode.java
 * @author Kevin Gao on 2020-9-27
 *
 * Implementation of the Clean Spot Task TreeNode
 */
public class CleanSpotNode extends TreeNode {

	/**
	 * Constructor for CleanSpotNode
	 * @param descriptor - custom description of the purpose of this TreeNode
	 */
	public CleanSpotNode(String descriptor, BlackBoard blackBoard) {
		super(descriptor, TreeNodeType.CLEAN_SPOT, blackBoard);
	}

	// TODO: Implement Order
	public State run() {
		return null;
	}
	
}