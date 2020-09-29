package node;

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
	public CleanNode(String descriptor) {
		super(descriptor, TreeNodeType.CLEAN);
	}

	// TODO: Implement Order
	public State run() {
		return null;
	}
	
}