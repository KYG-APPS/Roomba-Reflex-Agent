package node;

import util.State;
import util.TreeNodeType;

/**
 * SelectionNode.java
 * @author Kevin Gao on 2020-9-27
 *
 * Implementation of the Sequence Composite TreeNode
 */
public class SequenceNode extends TreeNode {

	/**
	 * Constructor for SequenceNode
	 * @param descriptor - custom description of the purpose of this TreeNode
	 */
	public SequenceNode(String descriptor) {
		super(descriptor, TreeNodeType.SEQUENCE);
	}

	// TODO: Implement Order
	public State run() {
		return null;
	}

}