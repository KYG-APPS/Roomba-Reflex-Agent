package node;

import java.lang.reflect.Method;
import java.util.ArrayList;

import tree.BlackBoard;
import tree.TreeNode;
import util.State;
import util.TreeNodeType;

/**
 * PriorityNode.java
 * @author Kevin Gao on 2020-9-27
 *
 * Implementation of the Priority Composite TreeNode
 */
public class PriorityNode extends TreeNode {

	/**
	 * Constructor for PriorityNode
	 * @param descriptor - custom description of the purpose of this TreeNode
	 */
	public PriorityNode(String descriptor, BlackBoard blackBoard) {
		super(descriptor, TreeNodeType.PRIORITY, blackBoard);
	}

	/**
	 * Runs each child of this Priority TreeNode in order of Priority, 
	 * immediately returning as soon as one returns State.SUCCEEDED or 
	 * State.RUNNING.
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