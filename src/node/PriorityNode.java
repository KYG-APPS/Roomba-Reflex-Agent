package node;

import util.State;
import util.TreeNodeType;

/**
 * PriorityNode.java
 * @author Kevin Gao on 2020-9-27
 *
 * Implementation of the Priority Composite TreeNode
 */
public class PriorityNode extends TreeNode {

	/**
	 * Constructor for PriorityNode
	 * @param descriptor - custom description of the purpose of this TreeNode
	 */
	public PriorityNode(String descriptor) {
		super(descriptor, TreeNodeType.PRIORITY);
	}

	// TODO: Implement Order
	public State run() {
		return null;
	}
	
}