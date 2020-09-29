package tree;

import java.lang.reflect.Method;

import node.TreeNode;
import util.State;

/**
 * BehaviorTree.java
 * @author Kevin Gao on 2020-9-29
 *
 * Representation of a Roomba's BehaviorTree
 */
public class BehaviorTree {
	
	/** The root TreeNode of this BehaviorTree */
	private TreeNode root;
	
	/** The BlackBoard of this BehaviorTree */
	private BlackBoard blackBoard;

	/**
	 * Constructor for BehaviorTree
	 * @param root - the root TreeNode of this BehaviorTree
	 * @param blackBoard - the BlackBoard of this BehaviorTree
	 */
	public BehaviorTree(TreeNode root, BlackBoard blackBoard) {
		this.root = root;
		this.blackBoard = blackBoard;
	}
	
	/**
	 * Runs one full cycle of this BehaviorTree
	 * @return the final State after execution
	 */
	public State runCycle() {
		Class<?> nodeClass = root.getTreeNodeType().getClassType();
		Method method;
		
		try {
			method = nodeClass.getMethod("run");
			return (State) method.invoke(root);
		} catch (Exception e) {
			System.out.println("Error in runCycle of BehaviorTree.java. "
					+ "Exiting...");
			System.exit(1);
		}
		
		return State.FAILED;
	}
	
	/**
	 * @return the BlackBoard object associated with this BehaviorTree
	 */
	public BlackBoard getBlackBoard() {
		return this.blackBoard;
	}
	
}