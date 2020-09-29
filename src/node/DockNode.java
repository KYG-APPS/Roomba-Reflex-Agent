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

	// TODO: Implement Order
	public State run() {
		return null;
	}
	
}