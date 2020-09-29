package main;

import node.TreeNode;
import tree.BehaviorTree;
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
	public Roomba(TreeNode rootNode) {
		behaviorTree = new BehaviorTree(rootNode);
	}
	
	/**
	 * Runs a single cycle of this Roomba's BehaviorTree
	 */
	public State runCycle() {
		return behaviorTree.runCycle();
	}
	
	/**
	 * @return the Battery Level of the this Roomba instance
	 */
	public int getBatteryLevel() {
		return this.behaviorTree.getBlackBoard().getBatteryLevel();
	}
}