package node;

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
	public DoneGeneralNode(String descriptor) {
		super(descriptor, TreeNodeType.DONE_GENERAL);
	}

	// TODO: Implement Order
	public State run() {
		return null;
	}
	
}