package tree;

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
	
	// TODO: Implement
	public State runCycle() {
		root.getClass();
		blackBoard.getClass();
		return null;
	}
	
}