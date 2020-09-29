package node;

import tree.BlackBoard;
import tree.TreeNode;
import util.State;
import util.TreeNodeType;

/**
 * SpotNode.java
 * @author Kevin Gao on 2020-9-27
 *
 * Implementation of the Spot Condition TreeNode
 */
public class SpotNode extends TreeNode {

	/**
	 * Constructor for SpotNode
	 * @param descriptor - custom description of the purpose of this TreeNode
	 */
	public SpotNode(String descriptor, BlackBoard blackBoard) {
		super(descriptor, TreeNodeType.SPOT, blackBoard);
	}

	/**
	 * @return State.SUCCEEDED if 'spot' is true; 
	 * otherwise, returns State.FAILED
	 */
	public State run() {
		BlackBoard blackBoard = super.getBlackBoard();
		if (blackBoard.isSpot()) {
			return State.SUCCEEDED;
		}
		return State.FAILED;
	}
	
}