package node;

import java.lang.reflect.Method;

import tree.BlackBoard;
import tree.TreeNode;
import util.State;
import util.TreeNodeType;

/**
 * LogicalNegationNode.java
 * @author Kevin Gao on 2020-9-27
 *
 * Implementation of the Logical Negation Decorator TreeNode
 */
public class LogicalNegationNode extends TreeNode {

	/**
	 * Constructor for LogicalNegationNode
	 * @param descriptor - custom description of the purpose of this TreeNode
	 */
	public LogicalNegationNode(String descriptor, BlackBoard blackBoard) {
		super(descriptor, TreeNodeType.LOGICAL_NEGATION, blackBoard);
	}

	/**
	 * Runs the singular child of this TreeNode and negates the return State
	 * @return the negated return State of the child
	 */
	public State run() {
		TreeNode child = super.getChildren().get(0);
		Method method;
		State state = null;
		try {
			method = child.getTreeNodeType().getClassType().getMethod("run");
			state = (State)(method.invoke(child));
		} catch (Exception e) {
			System.out.println("Error Running Logical Negation Node. "
					+ "Exiting...");
		}
		
		if (state.equals(State.SUCCEEDED)) {
			return State.FAILED;
		} else if (state.equals(State.FAILED)) {
			return State.SUCCEEDED;
		}
		
		System.out.println("Error: cannot negate value State.RUNNING");
		System.exit(1);
		return state;
	}
	
}