package util;

//TODO: Fix placeholder
import main.Main;

/**
 * TreeNodeType.java
 * @author Kevin Gao on 2020-9-27
 * 
 * Enum for linking the different types of TreeNodes with their subclasses
 * e.g. Selection, Sequence, Until Fail, etc.
 */
public enum TreeNodeType {
	
	/** Initialization of all TreeNodes with their corresponding descriptors */
	PLACEHOLDER("Test", Main.class);
	
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