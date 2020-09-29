package node;

import util.State;
import util.TreeNodeType;

/**
 * UntilFailsNode.java
 * @author Kevin Gao on 2020-9-27
 *
 * Implementation of the Until Fails Decorator TreeNode
 */
public class UntilFailsNode extends TreeNode {

	/**
	 * Constructor for UntilFailsNode
	 * @param descriptor - custom description of the purpose of this TreeNode
	 */
	public UntilFailsNode(String descriptor) {
		super(descriptor, TreeNodeType.UNTIL_FAILS);
	}

	// TODO: Implement Order
	public State run() {
		return null;
	}
	
}