package node;

import java.lang.reflect.Method;

import tree.BlackBoard;
import tree.TreeNode;
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

	/**
	 * Executes the child TreeNode for the given number of cycles
	 * 
	 * @return State.SUCCEEDED if all cycles are finished; otherwise, returns
	 * State.RUNNING
	 */
	public State run() {
		TreeNode child = super.getChildren().get(0);
		Method method;
		State state = null;
		try {
			method = child.getTreeNodeType().getClassType().getMethod("run");
			state = (State)(method.invoke(child));
		} catch (Exception e) {
			System.out.println("Error running Timer Node. Exiting...");
			System.exit(1);
		}	
		return state;
	}
	
}