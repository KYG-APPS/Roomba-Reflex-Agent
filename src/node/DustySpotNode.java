package node;

import util.State;
import util.TreeNodeType;

/**
 * DustySpotNode.java
 * @author Kevin Gao on 2020-9-27
 *
 * Implementation of the DustySpot Condition TreeNode
 */
public class DustySpotNode extends TreeNode {

	/**
	 * Constructor for DustySpotNode
	 * @param descriptor - custom description of the purpose of this TreeNode
	 */
	public DustySpotNode(String descriptor) {
		super(descriptor, TreeNodeType.DUSTY_SPOT);
	}

	// TODO: Implement Order
	public State run() {
		return null;
	}
	
}