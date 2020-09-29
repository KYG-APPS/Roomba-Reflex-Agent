package node;

import util.State;
import util.TreeNodeType;

/**
 * LogicalNegationNode.java
 * @author Kevin Gao on 2020-9-27
 *
 * Implementation of the Logical Negation Decorator TreeNode
 */
public class LogicalNegationNode extends TreeNode {

	/**
	 * Constructor for LogicalNegationNode
	 * @param descriptor - custom description of the purpose of this TreeNode
	 */
	public LogicalNegationNode(String descriptor) {
		super(descriptor, TreeNodeType.LOGICAL_NEGATION);
	}

	// TODO: Implement Order
	public State run() {
		return null;
	}
	
}