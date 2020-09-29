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
	BATTERY_CHECK_1(TreeNodeType.BATTERY_LESS_THAN, null, "1st Battery Check"),
	FIND_HOME(TreeNodeType.FIND_HOME, null, "Find Path Home"),
	GO_HOME(TreeNodeType.GO_HOME, null, "Follow Path Home"),
	DOCK(TreeNodeType.DOCK, null, "Dock at Charging Station"),
	
	ENSURE_SUFFICIENT_BATTERY(TreeNodeType.SEQUENCE, 
			new BehaviorTreeStructure[] {
					BATTERY_CHECK_1,
					FIND_HOME,
					GO_HOME,
					DOCK
			}, "Ensure Sufficient Battery"),


	/** Spot Command */
	SPOT_CHECK(TreeNodeType.SPOT, null, "Check Spot Value"),
	CLEAN_SPOT(TreeNodeType.CLEAN_SPOT, null, "Clean Spot"),
	DONE_SPOT(TreeNodeType.DONE_SPOT, null, "Update Spot Value"),
	
	CLEAN_SPOT_TIMER(TreeNodeType.TIMER, 
			new BehaviorTreeStructure[] {
					CLEAN_SPOT
			}, 
			"20-cycle timer for CLEAN_SPOT"),
	
	SPOT_COMMAND(TreeNodeType.SEQUENCE, 
			new BehaviorTreeStructure[] {
					SPOT_CHECK,
					CLEAN_SPOT_TIMER,
					DONE_SPOT
			}, "Run Spot Command"),


	/** General Cleaning Command */
	GENERAL_CHECK(TreeNodeType.GENERAL, null, "Check General Value"),
	BATTERY_CHECK_2(TreeNodeType.BATTERY_LESS_THAN, null, "2nd Battery Check"),
	DUSTY_SPOT_CHECK(TreeNodeType.DUSTY_SPOT, null, "Check Dusty Spot Value"),
	CLEAN_SPOT_2(TreeNodeType.CLEAN_SPOT, null, "Clean Spot"),
	CLEAN(TreeNodeType.CLEAN, null, "Clean"),
	DONE_GENERAL(TreeNodeType.DONE_GENERAL, null, "Update General Value"),
	
	CLEAN_SPOT_TIMER_2(TreeNodeType.TIMER, 
			new BehaviorTreeStructure[] {
					CLEAN_SPOT_2
			}, 
			"35-cycle timer for CLEAN_SPOT_2"),
	
	DUSTY_SPOT_SEQUENCE(TreeNodeType.SEQUENCE, 
			new BehaviorTreeStructure[] {
					DUSTY_SPOT_CHECK,
					CLEAN_SPOT_TIMER_2
			}, 
			"Complete Dusty Spot"),
	
	GENERAL_CLEAN_SELECTION(TreeNodeType.SELECTION, 
			new BehaviorTreeStructure[] {
					DUSTY_SPOT_SEQUENCE,
					CLEAN
			}, 
			"Dusty Spot Selection"),
	
	BATTERY_NEGATION(TreeNodeType.LOGICAL_NEGATION, 
			new BehaviorTreeStructure[] {
					BATTERY_CHECK_2
			}, 
			"Negate Battery Check Value"),
			
	
	GENERAL_CLEAN_LOOP(TreeNodeType.SEQUENCE, 
			new BehaviorTreeStructure[] {
					BATTERY_NEGATION,
					GENERAL_CLEAN_SELECTION
			}, 
			"Loop of General Clean"),
	
	GENERAL_CLEAN_UNTIL_FAIL(TreeNodeType.UNTIL_FAILS, 
			new BehaviorTreeStructure[] {
					GENERAL_CLEAN_LOOP
			}, 
			"Loop General Clean until Battery < 30"),
	
	GENERAL_CLEAN_LOOP_AND_UPDATE(TreeNodeType.SEQUENCE, 
			new BehaviorTreeStructure[] {
					GENERAL_CLEAN_UNTIL_FAIL,
					DONE_GENERAL
			}, 
			"General Clean and BlackBoard Update"),
	
	GENERAL_COMMAND(TreeNodeType.SEQUENCE, 
			new BehaviorTreeStructure[] {
					GENERAL_CHECK,
					GENERAL_CLEAN_LOOP_AND_UPDATE
			}, 
			"Complete Sequence for the General Command"),
	
	CLEANING_COMMAND_SELECTION(TreeNodeType.SELECTION, 
			new BehaviorTreeStructure[] {
					SPOT_COMMAND,
					GENERAL_COMMAND
			}, 
			"Executes All Cleaning Commands"),


	/** Do Nothing Command */
	DO_NOTHING_COMMAND(TreeNodeType.DO_NOTHING, null, "Do Absolutely Nothing"),
	
	/** ROOT of the BehaviorTreeStructure */
	ROOT(TreeNodeType.PRIORITY, 
			new BehaviorTreeStructure[] {
					ENSURE_SUFFICIENT_BATTERY,
					CLEANING_COMMAND_SELECTION,
					DO_NOTHING_COMMAND
			}, 
			"Root Priority Composite TreeNode");


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