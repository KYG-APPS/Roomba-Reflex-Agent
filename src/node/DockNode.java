package node;

import tree.BlackBoard;
import tree.TreeNode;
import util.State;
import util.TreeNodeType;

/**
 * DockNode.java
 * @author Kevin Gao on 2020-9-27
 *
 * Implementation of the Dock Task TreeNode
 */
public class DockNode extends TreeNode {

	/**
	 * Constructor for DockNode
	 * @param descriptor - custom description of the purpose of this TreeNode
	 */
	public DockNode(String descriptor, BlackBoard blackBoard) {
		super(descriptor, TreeNodeType.DOCK, blackBoard);
	}

	/**
	 * Docks the Roomba at the charging station and resets the BlackBoard
	 * 
	 * Could fail in reality, but the focus of this program is BehaviorTrees,
	 * so we assume it works
	 * 
	 * @return State.SUCCEEDED on successful docking
	 */
	public State run() {
		System.out.print("Running " + super.getDescriptor() + " NODE...");
		BlackBoard blackBoard = super.getBlackBoard();
		System.out.println(" SUCCEEDED!");
		System.out.println("\nBlackBoard before Docking: " + blackBoard);
		blackBoard.setDustySpot(false);
		blackBoard.setGeneral(false);
		blackBoard.setSpot(false);
		blackBoard.setHomePath(null);
		blackBoard.setBatteryLevel(blackBoard.getBatteryLevel() - 1);
		System.out.println("\nBlackBoard after Docking: " + blackBoard);
		return State.SUCCEEDED;
	}

}