package node;

import tree.BlackBoard;
import util.State;
import util.TreeNodeType;

/**
 * GeneralNode.java
 * @author Kevin Gao on 2020-9-27
 *
 * Implementation of the General Condition TreeNode
 */
public class GeneralNode extends TreeNode {

	/**
	 * Constructor for GeneralNode
	 * @param descriptor - custom description of the purpose of this TreeNode
	 */
	public GeneralNode(String descriptor, BlackBoard blackBoard) {
		super(descriptor, TreeNodeType.GENERAL, blackBoard);
	}

	/**
	 * @return State.SUCCEEDED if 'general' is true;
	 * otherwise, returns State.FAILED
	 */
	public State run() {
		BlackBoard blackBoard = super.getBlackBoard();
		if (blackBoard.isGeneral()) {
			return State.SUCCEEDED;
		}
		return State.FAILED;
	}
	
}