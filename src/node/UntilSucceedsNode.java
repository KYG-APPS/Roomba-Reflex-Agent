package node;

import tree.BlackBoard;
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
	public UntilSucceedsNode(String descriptor, BlackBoard blackBoard) {
		super(descriptor, TreeNodeType.UNTIL_SUCCEEDS, blackBoard);
	}

	// TODO: Implement Order
	public State run() {
		return null;
	}
	
}