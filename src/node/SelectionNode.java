package node;

import java.lang.reflect.Method;
import java.util.ArrayList;

import tree.BlackBoard;
import util.State;
import util.TreeNodeType;

/**
 * SelectionNode.java
 * @author Kevin Gao on 2020-9-27
 *
 * Implementation of the Selection Composite TreeNode
 */
public class SelectionNode extends TreeNode {

	/**
	 * Constructor for SelectionNode
	 * @param descriptor - custom description of the purpose of this TreeNode
	 */
	public SelectionNode(String descriptor, BlackBoard blackBoard) {
		super(descriptor, TreeNodeType.SELECTION, blackBoard);
	}
	
	/**
	 * Runs each child of this Selection TreeNode, immediately returning as soon
	 * as one returns State.SUCCEEDED or State.RUNNING.
	 * @return State.SUCCEEDED if encountered first; STATE.RUNNING if encountered
	 * first; otherwise, returns State.FAILED
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
				} else if (state.equals(State.SUCCEEDED)) {
					return State.SUCCEEDED;
				}
			} catch (Exception e) {
				System.out.println("Error Running Child of Selection Node. "
						+ "Exiting...");
			}
		}
		return State.FAILED;
	}
	
}