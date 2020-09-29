package node;

import tree.BlackBoard;
import util.State;
import util.TreeNodeType;

/**
 * DoNothingNode.java
 * @author Kevin Gao on 2020-9-27
 *
 * Implementation of the Do Nothing Task TreeNode
 */
public class DoNothingNode extends TreeNode {

	/**
	 * Constructor for DoNothingNode
	 * @param descriptor - custom description of the purpose of this TreeNode
	 */
	public DoNothingNode(String descriptor, BlackBoard blackBoard) {
		super(descriptor, TreeNodeType.DO_NOTHING, blackBoard);
	}

	/**
	 * Executes the DO NOTHING command according to the spec
	 * @return State.SUCCEEDED after successful execution
	 */
	public State run() {
		System.out.print("Running " + super.getDescriptor() + " NODE...");
		System.out.println(" SUCCEEDED!");
		BlackBoard blackBoard = super.getBlackBoard();
		blackBoard.setBatteryLevel(blackBoard.getBatteryLevel() - 1);
		return State.SUCCEEDED;
	}
	
}