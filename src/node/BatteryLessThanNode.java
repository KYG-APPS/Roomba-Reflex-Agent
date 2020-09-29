package node;

import tree.BlackBoard;
import util.State;
import util.TreeNodeType;

/**
 * BatteryLessThanNode.java
 * @author Kevin Gao on 2020-9-27
 *
 * Implementation of the Battery Less Than Condition TreeNode
 */
public class BatteryLessThanNode extends TreeNode {

	/**
	 * Constructor for BatteryLessThanNode
	 * @param descriptor - custom description of the purpose of this TreeNode
	 */
	public BatteryLessThanNode(String descriptor, BlackBoard blackBoard) {
		super(descriptor, TreeNodeType.BATTERY_LESS_THAN, blackBoard);
	}

	// TODO: Implement Order
	public State run() {
		return null;
	}
	
}