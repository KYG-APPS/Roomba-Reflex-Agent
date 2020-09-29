package node;

import util.State;
import util.TreeNodeType;

/**
 * SpotNode.java
 * @author Kevin Gao on 2020-9-27
 *
 * Implementation of the Spot Condition TreeNode
 */
public class SpotNode extends TreeNode {

	/**
	 * Constructor for SpotNode
	 * @param descriptor - custom description of the purpose of this TreeNode
	 */
	public SpotNode(String descriptor) {
		super(descriptor, TreeNodeType.SPOT);
	}

	// TODO: Implement Order
	public State run() {
		return null;
	}
	
}