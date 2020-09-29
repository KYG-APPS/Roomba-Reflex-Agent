package node;

import java.lang.reflect.Method;

import tree.BlackBoard;
import util.State;
import util.TreeNodeType;

/**
 * UntilFailsNode.java
 * @author Kevin Gao on 2020-9-27
 *
 * Implementation of the Until Fails Decorator TreeNode
 */
public class UntilFailsNode extends TreeNode {

	/**
	 * Constructor for UntilFailsNode
	 * @param descriptor - custom description of the purpose of this TreeNode
	 */
	public UntilFailsNode(String descriptor, BlackBoard blackBoard) {
		super(descriptor, TreeNodeType.UNTIL_FAILS, blackBoard);
	}

	/**
	 * Repeatedly run the singular child of this TreeNode until it returns
	 * State.FAILED
	 * @return State.SUCCEEDED when the child returns State.FAILED
	 */
	public State run() {
		TreeNode child = super.getChildren().get(0);
		Method method;
		State state;
		try {
			method = child.getTreeNodeType().getClassType().getMethod("run");
			do {
			state = (State)(method.invoke(child));
			} while(!state.equals(State.FAILED));
		} catch (Exception e) {
			System.out.println("Error Running Logical Negation Node. "
					+ "Exiting...");
		}
		return State.SUCCEEDED;
	}
	
}