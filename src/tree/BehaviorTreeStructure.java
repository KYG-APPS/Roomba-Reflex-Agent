package tree;

import util.TreeNodeType;

/**
 * BehaviorTreeStructure.java
 * @author Kevin Gao on 2020-9-29
 *
 * Enum that holds the structure of the Roomba's Behavior Tree that
 * facilitates updates/changes to the nodes
 * 
 * Each individual BehaviorTreeStructure represents one TreeNode in the 
 * BehaviorTree - the entire BehaviorTree is thus represented by the ROOT
 */
public enum BehaviorTreeStructure {

	/** 
	 * Format:
	 * TreeNodeType nodeType 
	 * BehaviorTreeStructure[] children (null represents no children)
	 * String description
	 */
	
	/** Specify TreeNodes Bottom-Up (Leaf-First) */

	/** Return to Charging Base */
	BATTERY_CHECK_1(TreeNodeType.BATTERY_LESS_THAN,
			null, 
			"PRELIMINARY BATTERY CHECK CONDITION"),
	FIND_HOME(TreeNodeType.FIND_HOME, null, "FIND HOME TASK"),
	GO_HOME(TreeNodeType.GO_HOME, null, "GO HOME TASK"),
	DOCK(TreeNodeType.DOCK, null, "DOCK TASK"),
	
	ENSURE_SUFFICIENT_BATTERY(TreeNodeType.SEQUENCE, 
			new BehaviorTreeStructure[] {
					BATTERY_CHECK_1,
					FIND_HOME,
					GO_HOME,
					DOCK
			}, "PRELMINARY BATTERY SEQUENCE"),


	/** Spot Command */
	SPOT_CHECK(TreeNodeType.SPOT, null, "SPOT CONDITION"),
	CLEAN_SPOT(TreeNodeType.CLEAN_SPOT, null, "CLEAN SPOT TASK"),
	DONE_SPOT(TreeNodeType.DONE_SPOT, null, "DONE SPOT TASK"),
	
	CLEAN_SPOT_TIMER(TreeNodeType.TIMER, 
			new BehaviorTreeStructure[] {
					CLEAN_SPOT
			}, 
			"20-CYCLE CLEAN_SPOT TIMER"),
	
	SPOT_COMMAND(TreeNodeType.SEQUENCE, 
			new BehaviorTreeStructure[] {
					SPOT_CHECK,
					CLEAN_SPOT_TIMER,
					DONE_SPOT
			}, "SPOT COMMAND SEQUENCE"),


	/** General Cleaning Command */
	GENERAL_CHECK(TreeNodeType.GENERAL, null, "GENERAL CONDITION"),
	BATTERY_CHECK_2(TreeNodeType.BATTERY_LESS_THAN, 
			null, 
			"BATTERY CHECK CONDITION"),
	DUSTY_SPOT_CHECK(TreeNodeType.DUSTY_SPOT, null, "DUSTY SPOT CONDITION"),
	CLEAN_SPOT_2(TreeNodeType.CLEAN_SPOT_EXTENDED, null, "CLEAN SPOT 2 TASK"),
	CLEAN(TreeNodeType.CLEAN, null, "CLEAN"),
	DONE_GENERAL(TreeNodeType.DONE_GENERAL, null, "DONE GENERAL TASK"),
	
	CLEAN_SPOT_TIMER_2(TreeNodeType.TIMER, 
			new BehaviorTreeStructure[] {
					CLEAN_SPOT_2
			}, 
			"35-CYCLE CLEAN_SPOT_2 TIMER"),
	
	DUSTY_SPOT_SEQUENCE(TreeNodeType.SEQUENCE, 
			new BehaviorTreeStructure[] {
					DUSTY_SPOT_CHECK,
					CLEAN_SPOT_TIMER_2
			}, 
			"DUSTY SPOT SEQUENCE"),
	
	GENERAL_CLEAN_SELECTION(TreeNodeType.SELECTION, 
			new BehaviorTreeStructure[] {
					DUSTY_SPOT_SEQUENCE,
					CLEAN
			}, 
			"GENERAL CLEAN SELECTION"),
	
	BATTERY_NEGATION(TreeNodeType.LOGICAL_NEGATION, 
			new BehaviorTreeStructure[] {
					BATTERY_CHECK_2
			}, 
			"BATTERY CHECK NEGATION DECORATOR"),
			
	
	GENERAL_CLEAN_LOOP(TreeNodeType.SEQUENCE, 
			new BehaviorTreeStructure[] {
					BATTERY_NEGATION,
					GENERAL_CLEAN_SELECTION
			}, 
			"GENERAL CLEAN SEQUENCE"),
	
	GENERAL_CLEAN_UNTIL_FAIL(TreeNodeType.UNTIL_FAILS, 
			new BehaviorTreeStructure[] {
					GENERAL_CLEAN_LOOP
			}, 
			"GENERAL CLEAN UNTIL FAIL DECORATOR"),
	
	GENERAL_CLEAN_LOOP_AND_UPDATE(TreeNodeType.SEQUENCE, 
			new BehaviorTreeStructure[] {
					GENERAL_CLEAN_UNTIL_FAIL,
					DONE_GENERAL
			}, 
			"GENERAL CLEAN AND UPDATE SEQUENCE"),
	
	GENERAL_COMMAND(TreeNodeType.SEQUENCE, 
			new BehaviorTreeStructure[] {
					GENERAL_CHECK,
					GENERAL_CLEAN_LOOP_AND_UPDATE
			}, 
			"COMPLETE GENERAL COMMAND SEQUENCE"),
	
	CLEANING_COMMAND_SELECTION(TreeNodeType.SELECTION, 
			new BehaviorTreeStructure[] {
					SPOT_COMMAND,
					GENERAL_COMMAND
			}, 
			"ALL CLEANING COMMAND SELECTION"),


	/** Do Nothing Command */
	DO_NOTHING_COMMAND(TreeNodeType.DO_NOTHING, null, "DO NOTHING TASK"),
	
	/** ROOT of the BehaviorTreeStructure */
	ROOT(TreeNodeType.PRIORITY, 
			new BehaviorTreeStructure[] {
					ENSURE_SUFFICIENT_BATTERY,
					CLEANING_COMMAND_SELECTION,
					DO_NOTHING_COMMAND
			}, 
			"ROOT PRIORITY COMPOSITE");


	/** TreeNodeType of the TreeNode */
	private TreeNodeType nodeType;

	/** Children of the TreeNode */
	private BehaviorTreeStructure[] children;

	/** Description of the TreeNode */
	private String description;

	/**
	 * Constructor for BehaviorTreeStructure
	 * @param nodeType - TreeNodeType of the TreeNode
	 * @param children - children of the TreeNode
	 * @param description - description of the TreeNode
	 */
	BehaviorTreeStructure(TreeNodeType nodeType, 
			BehaviorTreeStructure[] children, String description) {
		this.nodeType = nodeType;
		this.children = children;
		this.description = description;
	}

	/**
	 * @return the root of this BehaviorTreeStrucutre
	 */
	public static BehaviorTreeStructure getRoot() {
		return BehaviorTreeStructure.ROOT;
	}
	
	/**
	 * @return the TreeNodeType of the TreeNode
	 */
	public TreeNodeType getTreeNodeType() {
		return this.nodeType;
	}

	/**
	 * @return the children of the TreeNode
	 */
	public BehaviorTreeStructure[] getChildren() {
		return this.children;
	}

	/**
	 * @return the description of the TreeNode
	 */
	public String getDescription() {
		return this.description;
	}

}