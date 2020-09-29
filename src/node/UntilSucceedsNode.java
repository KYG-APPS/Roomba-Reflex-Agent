package node;

import java.lang.reflect.Method;

import tree.BlackBoard;
import tree.TreeNode;
import util.State;
import util.TreeNodeType;

/**
 * UntilSucceedsNode.java
 * @author Kevin Gao on 2020-9-27
 *
 * Implementation of the Until Succeeds Decorator TreeNode
 */
public class UntilSucceedsNode extends TreeNode{

	/**
	 * Constructor for UntilSucceedsNode
	 * @param descriptor - custom description of the purpose of this TreeNode
	 */
	public UntilSucceedsNode(String descriptor, BlackBoard blackBoard) {
		super(descriptor, TreeNodeType.UNTIL_SUCCEEDS, blackBoard);
	}

	/**
	 * Repeatedly run the singular child of this TreeNode until it returns
	 * State.SUCCEEDED
	 * @return State.SUCCEEDED when the child returns State.SUCCEEDED
	 */
	public State run() {
		TreeNode child = super.getChildren().get(0);
		Method method;
		State state;
		try {
			method = child.getTreeNodeType().getClassType().getMethod("run");
			state = (State)(method.invoke(child));
			if (state.equals(State.SUCCEEDED)) {
				return State.SUCCEEDED;
			}
		} catch (Exception e) {
			System.out.println("Error Running Logical Negation Node. "
					+ "Exiting...");
		}
		return State.RUNNING;
	}
	
}