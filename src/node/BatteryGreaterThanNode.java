package node;

import util.State;
import util.TreeNodeType;

/**
 * BatteryGreaterThanNode.java
 * @author Kevin Gao on 2020-9-27
 *
 * Implementation of the Battery Greater Than Condition TreeNode
 */
public class BatteryGreaterThanNode extends TreeNode {

	/**
	 * Constructor for BatteryGreaterThanNode
	 * @param descriptor - custom description of the purpose of this TreeNode
	 */
	public BatteryGreaterThanNode(String descriptor) {
		super(descriptor, TreeNodeType.BATTERY_GREATER_THAN);
	}

	// TODO: Implement Order
	public State run() {
		return null;
	}
	
}