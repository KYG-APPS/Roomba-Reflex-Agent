package node;

import util.State;
import util.TreeNodeType;

/**
 * UntilSucceedsNode.java
 * @author Kevin Gao on 2020-9-27
 *
 * Implementation of the Until Succeeds Decorator TreeNode
 */
public class UntilSucceedsNode extends TreeNode{

	/**
	 * Constructor for UntilSucceedsNode
	 * @param descriptor - custom description of the purpose of this TreeNode
	 */
	public UntilSucceedsNode(String descriptor) {
		super(descriptor, TreeNodeType.UNTIL_SUCCEEDS);
	}

	// TODO: Implement Order
	public State run() {
		return null;
	}
	
}