package node;

import java.lang.reflect.Method;
import java.util.ArrayList;

import tree.BlackBoard;
import tree.TreeNode;
import util.State;
import util.TreeNodeType;

/**
 * SelectionNode.java
 * @author Kevin Gao on 2020-9-27
 *
 * Implementation of the Sequence Composite TreeNode
 */
public class SequenceNode extends TreeNode {

	/**
	 * Constructor for SequenceNode
	 * @param descriptor - custom description of the purpose of this TreeNode
	 */
	public SequenceNode(String descriptor, BlackBoard blackBoard) {
		super(descriptor, TreeNodeType.SEQUENCE, blackBoard);
	}

	/**
	 * Runs each child of this Sequence TreeNode, immediately returning as soon
	 * as one returns State.FAILED or State.RUNNING.
	 * @return State.FAILED if encountered first; STATE.RUNNING if encountered
	 * first; otherwise, returns State.SUCCEEDED
	 */
	public State run() {
		ArrayList<TreeNode> children = super.getChildren();

		for (TreeNode child: children) {
			Method method;
			State state = null;
			try {
				method = child.getTreeNodeType().getClassType().getMethod("run");
				state = (State)(method.invoke(child));
				if (state.equals(State.RUNNING)) {
					return State.RUNNING;
				} else if (state.equals(State.FAILED)) {
					return State.FAILED;
				}
			} catch (Exception e) {
				System.out.println("Error Running Child of Sequence Node. "
						+ "Exiting...");
			}
		}
		return State.SUCCEEDED;
	}

}