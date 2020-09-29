package main;

import node.TreeNode;
import tree.BehaviorTree;
import tree.BlackBoard;
import util.State;

/**
 * Roomba.java
 * @author Kevin Gao on 2020-9-29
 *
 * Representation of a Roomba, complete with its Behavior Tree
 */
public class Roomba {

	/** BehaviorTree for this Roomba */
	private BehaviorTree behaviorTree;
	
	/**
	 * Constructor for Roomba
	 * @param rootNode - the root TreeNode of its BehaviorTree
	 * @param blackBoard - the BlackBoard of its Behavior Tree
	 */
	public Roomba(TreeNode rootNode, BlackBoard blackBoard) {
		behaviorTree = new BehaviorTree(rootNode, blackBoard);
	}
	
	/**
	 * Runs a single cycle of this Roomba's BehaviorTree
	 */
	public State runCycle() {
		return behaviorTree.runCycle();
	}
}