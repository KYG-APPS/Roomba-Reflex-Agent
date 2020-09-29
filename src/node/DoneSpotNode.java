package node;

import tree.BlackBoard;
import util.State;
import util.TreeNodeType;

/**
 * DoneSpotNode.java
 * @author Kevin Gao on 2020-9-27
 *
 * Implementation of the Done Spot Task TreeNode
 */
public class DoneSpotNode extends TreeNode {

	/**
	 * Constructor for DoneSpotNode
	 * @param descriptor - custom description of the purpose of this TreeNode
	 */
	public DoneSpotNode(String descriptor, BlackBoard blackBoard) {
		super(descriptor, TreeNodeType.DONE_SPOT, blackBoard);
	}

	// TODO: Implement Order
	public State run() {
		return null;
	}
	
}