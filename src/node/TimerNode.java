package node;

import tree.BlackBoard;
import util.State;
import util.TreeNodeType;

/**
 * TimerNode.java
 * @author Kevin Gao on 2020-9-27
 *
 * Implementation of the Timer Decorator TreeNode
 */
public class TimerNode extends TreeNode {

	/**
	 * Constructor for TimerNode
	 * @param descriptor - custom description of the purpose of this TreeNode
	 */
	public TimerNode(String descriptor, BlackBoard blackBoard) {
		super(descriptor, TreeNodeType.TIMER, blackBoard);
	}

	// TODO: Implement Order
	public State run() {
		return null;
	}
	
}