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

	/**
	 * Attempts to follow the 'home path' stored in the BlackBoard 
	 * back to the charging station
	 * 
	 * @return State.SUCCEEDED if a valid path was found and executed;
	 * otherwise, returns State.FAILED
	 */
	public State run() {
		System.out.print("Running " + super.getDescriptor() + " NODE...");
		BlackBoard blackBoard = super.getBlackBoard();
		blackBoard.setBatteryLevel(blackBoard.getBatteryLevel() - 1);
		String path = super.getBlackBoard().getHomePath();
		if (path != null) {
			System.out.print(" PATH: " + path + "...");
			System.out.println(" SUCCEEDED!");
			return State.SUCCEEDED;
		}
		System.out.println(" FAILED.");
		return State.FAILED;
	}
	
}