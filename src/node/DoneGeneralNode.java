package node;

import tree.BlackBoard;
import tree.TreeNode;
import util.State;
import util.TreeNodeType;

/**
 * DoneGeneralNode.java
 * @author Kevin Gao on 2020-9-27
 *
 * Implementation of the Done General Task TreeNode
 */
public class DoneGeneralNode extends TreeNode {

	/**
	 * Constructor for DoneGeneralNode
	 * @param descriptor - custom description of the purpose of this TreeNode
	 */
	public DoneGeneralNode(String descriptor, BlackBoard blackBoard) {
		super(descriptor, TreeNodeType.DONE_GENERAL, blackBoard);
	}

	/**
	 * Updates the BlackBoard 'general' key to 'false'
	 * @return State.SUCCEEDED after updating
	 */
	public State run() {
		System.out.print("Running " + super.getDescriptor() + " NODE...");
		BlackBoard blackBoard = super.getBlackBoard();
		blackBoard.setBatteryLevel(blackBoard.getBatteryLevel() - 1);
		super.getBlackBoard().setGeneral(false);
		System.out.println(" SUCCEEDED!");
		return State.SUCCEEDED;
	}
	
}