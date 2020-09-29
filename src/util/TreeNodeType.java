package util;

import node.*;

/**
 * TreeNodeType.java
 * @author Kevin Gao on 2020-9-27
 * 
 * Enum for linking the different types of TreeNodes with their respective subclasses
 * Allows for efficient identification of TreeNode subclasses
 */
public enum TreeNodeType {
	
	/** Initialization of all TreeNodes with their corresponding descriptors */
	
	/** Composites */
	SELECTION("selection", SelectionNode.class),
	SEQUENCE("sequence", SequenceNode.class),
	PRIORITY("priority", PriorityNode.class),
	
	/** Decorators */
	LOGICAL_NEGATION("logical negation", LogicalNegationNode.class),
	UNTIL_SUCCEEDS("until succeeds", UntilSucceedsNode.class),
	UNTIL_FAILS("until fails", UntilFailsNode.class),
	TIMER("timer", TimerNode.class),
	
	/** Tasks */
	FIND_HOME("find home", FindHomeNode.class),
	GO_HOME("go home", GoHomeNode.class),
	DOCK("dock", DockNode.class),
	CLEAN_SPOT("clean_spot", CleanSpotNode.class),
	CLEAN_SPOT_EXTENDED("clean_spot_extended", CleanSpotExtendedNode.class),
	DONE_SPOT("done spot", DoneSpotNode.class),
	CLEAN("clean", CleanNode.class),
	DONE_GENERAL("done general", DoneGeneralNode.class),
	DO_NOTHING("do nothing", DoNothingNode.class),
	
	/** Conditions */
	BATTERY_LESS_THAN("battery less than", BatteryLessThanNode.class),
	SPOT("spot", SpotNode.class),
	GENERAL("general", GeneralNode.class),
	DUSTY_SPOT("dusty spot", DustySpotNode.class);
	
	/** Identifier String for the TreeNode */
	private final String identifier;
	
	/** Corresponding Class of the TreeNode */
	private final Class<?> classType;
	
	/**
	 * Constructor for TreeNodeType
	 * @param identifier - Identifier String for the TreeNode
	 * @param classType - Corresponding Class of the TreeNode
	 */
	TreeNodeType(String identifier, Class<?>  classType) {
		this.identifier = identifier;
		this.classType = classType;
	}
	
	/**
	 * @return the identifier string associated with this TreeNodeType
	 */
	public String getIdentifier() {
		return this.identifier;
	}
	
	/**
	 * @return the Class associated with this TreeNodeType
	 */
	public Class<?> getClassType() {
		return this.classType;
	}
	
}