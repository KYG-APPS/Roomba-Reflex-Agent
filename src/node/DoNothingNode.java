package node;

import util.State;
import util.TreeNodeType;

/**
 * DoNothingNode.java
 * @author Kevin Gao on 2020-9-27
 *
 * Implementation of the Do Nothing Task TreeNode
 */
public class DoNothingNode extends TreeNode {

	/**
	 * Constructor for DoNothingNode
	 * @param descriptor - custom description of the purpose of this TreeNode
	 */
	public DoNothingNode(String descriptor) {
		super(descriptor, TreeNodeType.DO_NOTHING);
	}

	// TODO: Implement Order
	public State run() {
		return null;
	}
	
}