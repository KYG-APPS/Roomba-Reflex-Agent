package main;

import tree.BehaviorTree;
import tree.TreeNode;
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

	/**
	 * Sets whether or not the 'spot' command was requested
	 * @param spot - the new value of spot
	 */
	public void setSpot(boolean spot) {
		this.behaviorTree.getBlackBoard().setSpot(spot);
	}

	/**
	 * Sets whether or not the 'general' command was requested
	 * @param general - the new value of general
	 */
	public void setGeneral(boolean general) {
		this.behaviorTree.getBlackBoard().setGeneral(general);
	}

	/**
	 * Sets whether or not a 'dusty spot' was detected
	 * @param dustySpot - the new value of dustySpot
	 */
	public void setDustySpot(boolean dustySpot) {
		this.behaviorTree.getBlackBoard().setDustySpot(dustySpot);
	}
}