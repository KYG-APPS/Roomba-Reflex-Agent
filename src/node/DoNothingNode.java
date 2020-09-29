package node;

import tree.BlackBoard;
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
	public DoNothingNode(String descriptor, BlackBoard blackBoard) {
		super(descriptor, TreeNodeType.DO_NOTHING, blackBoard);
	}

	// TODO: Implement Order
	public State run() {
		System.out.println("Doing Nothing... ");
		return State.SUCCEEDED;
	}
	
}