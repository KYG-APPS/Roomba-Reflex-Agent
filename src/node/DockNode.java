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
	 * Docks the Roomba at the charging station
	 * 
	 * Could fail in reality, but the focus of this program is BehaviorTrees,
	 * so we assume it works
	 * 
	 * @return State.SUCCEEDED on successful docking
	 */
	public State run() {
		System.out.print("Running " + super.getDescriptor() + " NODE...");
		System.out.println(" SUCCEEDED!");
		return State.SUCCEEDED;
	}

}