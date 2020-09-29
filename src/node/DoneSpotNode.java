package node;

import tree.BlackBoard;
import tree.TreeNode;
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

	/**
	 * Updates the BlackBoard 'spot' key to 'false'
	 * @return State.SUCCEEDED after updating
	 */
	public State run() {
		System.out.print("Running " + super.getDescriptor() + " NODE...");
		BlackBoard blackBoard = super.getBlackBoard();
		blackBoard.setBatteryLevel(blackBoard.getBatteryLevel() - 1);
		super.getBlackBoard().setSpot(false);
		System.out.println(" SUCCEEDED!");
		return State.SUCCEEDED;
	}
	
}