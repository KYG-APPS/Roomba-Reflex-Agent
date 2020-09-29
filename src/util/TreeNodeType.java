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
	SELECTION("selection", SelectionNode.class),
	SEQUENCE("sequence", SequenceNode.class),
	PRIORITY("priority", PriorityNode.class),
	LOGICAL_NEGATION("logical negation", LogicalNegationNode.class),
	UNTIL_SUCCEEDS("until succeeds", UntilSucceedsNode.class),
	UNTIL_FAILS("until fails", UntilFailsNode.class),
	TIMER("timer", TimerNode.class);
	
	/** Identifier String for the TreeNode */
	private final String identifier;
	
	/** Corresponding Class of the TreeNode */
	private final Class<?> classType;
	
	/**
	 * Constructor for TreeNodeType
	 * @param identifier - Identifier String for the TreeNode
	 * @param classType - Corresponding Class of the TreeNode
	 */
	TreeNodeType(String identifier, Class<?>  classType){
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
	public Class<?> getClassType(){
		return this.classType;
	}
}