package node;

import tree.BlackBoard;
import tree.TreeNode;
import util.State;
import util.TreeNodeType;

/**
 * FindHomeNode.java
 * @author Kevin Gao on 2020-9-27
 *
 * Implementation of the Find Home Task TreeNode
 */
public class FindHomeNode extends TreeNode {

	/**
	 * Constructor for FindHomeNode
	 * @param descriptor - custom description of the purpose of this TreeNode
	 */
	public FindHomeNode(String descriptor, BlackBoard blackBoard) {
		super(descriptor, TreeNodeType.FIND_HOME, blackBoard);
	}

	/**
	 * Plan a path to 'home' i.e. the charging base and 
	 * saves it in the BlackBoard
	 * 
	 * Could fail in reality, but the focus of this program is BehaviorTrees,
	 * so we assume it works
	 * 
	 * @return State.SUCCEEDED on successful calculation
	 */
	public State run() {
		System.out.print("Running " + super.getDescriptor() + " NODE...");
		super.getBlackBoard().setHomePath(
				"Unbelievably Efficiently Calculated Optimal Path Home :)"
				);
		System.out.println(" SUCCEEDED!");
		BlackBoard blackBoard = super.getBlackBoard();
		blackBoard.setBatteryLevel(blackBoard.getBatteryLevel() - 1);
		return State.SUCCEEDED;
	}
	
}