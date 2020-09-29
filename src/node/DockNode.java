package node;

import tree.BlackBoard;
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
		blackBoard.setDustySpot(false);
		blackBoard.setGeneral(false);
		blackBoard.setSpot(false);
		blackBoard.setHomePath(null);
		System.out.println(" SUCCEEDED!");
		
		System.out.println("BlackBoard after Docking: " + blackBoard);
		
		return State.SUCCEEDED;
	}

}