package node;

import tree.BlackBoard;
import util.State;
import util.TreeNodeType;

/**
 * DustySpotNode.java
 * @author Kevin Gao on 2020-9-27
 *
 * Implementation of the DustySpot Condition TreeNode
 */
public class DustySpotNode extends TreeNode {

	/**
	 * Constructor for DustySpotNode
	 * @param descriptor - custom description of the purpose of this TreeNode
	 */
	public DustySpotNode(String descriptor, BlackBoard blackBoard) {
		super(descriptor, TreeNodeType.DUSTY_SPOT, blackBoard);
	}

	/**
	 * @return State.SUCCEEDED if 'dusty spot' is true;
	 * otherwise, returns State.FAILED
	 */
	public State run() {
		BlackBoard blackBoard = super.getBlackBoard();
		if (blackBoard.isDustySpot()) {
			return State.SUCCEEDED;
		}
		return State.FAILED;
	}
	
}