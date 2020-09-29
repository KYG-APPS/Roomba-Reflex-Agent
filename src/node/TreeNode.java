package node;

import java.util.ArrayList;

import tree.BlackBoard;
import util.State;
import util.TreeNodeType;

/**
 * TreeNode.java
 * @author Kevin Gao on 2020-9-27
 *
 * Abstract class that serves as the superclass of all Nodes
 */
public abstract class TreeNode {
	
	/** ArrayList of of this TreeNode's children, stored in order */
	private ArrayList<TreeNode> children;

	/** Custom descriptor of this specific TreeNode instance */
	private String descriptor;
	
	/** The TreeNodeType of this Node */
	private TreeNodeType type;
	
	/** The BlackBoard of the BehaviorTree this TreeNode is a part of */
	private BlackBoard blackBoard;
	
	/**
	 * Constructor for TreeNode
	 * @param descriptor - custom description of the purpose of this TreeNode
	 * @param type - TreeNodeType of this TreeNode
	 */
	public TreeNode(String descriptor, TreeNodeType type, BlackBoard blackBoard) {
		children = new ArrayList<TreeNode>();
		this.descriptor = descriptor;
		this.type = type;
		this.blackBoard = blackBoard;
	}
	
	/**
	 * @return the number of children this TreeNode has
	 */
	public int numChildren() {
		return this.children.size();
	}
	
	/**
	 * @param index the index of the child to retrieve
	 * @return the child of this TreeNode at the specified index
	 */
	public TreeNode getChild(int index) {
		return this.children.get(index);
	}
	
	/**
	 * @return description of the purpose of this TreeNode
	 */
	public String getDescriptor() {
		return this.descriptor;
	}
	
	/**
	 * @return TreeNodeType of this TreeNode
	 */
	public TreeNodeType getTreeNodeType() {
		return this.type;
	}
	
	/**
	 * @return The BlackBoard of the BehaviorTree this TreeNode is a part of
	 */
	public BlackBoard getBlackBoard() {
		return this.blackBoard;
	}
	
	/**
	 * To be implemented for each subclass of TreeNode
	 * Executes the instructions as specified by the behavior of the subclass
	 * 
	 * @return the resulting State (success/failure/running) of the TreeNode
	 */
	public abstract State run();
	
}