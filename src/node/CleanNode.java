package node;

import tree.BlackBoard;
import tree.TreeNode;
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

	/**
	 * Executes a normal clean
	 * 
	 * Could fail in reality, but the focus of this program is BehaviorTrees,
	 * so we assume it works
	 * 
	 * @return State.SUCCEEDED on successful cleaning
	 */
	public State run() {
		System.out.print("Running " + super.getDescriptor() + " NODE...");
		System.out.println(" SUCCEEDED!");
		BlackBoard blackBoard = super.getBlackBoard();
		blackBoard.setBatteryLevel(blackBoard.getBatteryLevel() - 1);
		return State.SUCCEEDED;
	}
	
}