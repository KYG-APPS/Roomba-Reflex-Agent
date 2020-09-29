package tree;

import java.lang.reflect.Constructor;
import java.util.ArrayList;

import node.*;
/**
 * TreeGenerator.java
 * @author Kevin Gao on 2020-9-29
 *
 * Generates a BehaviorTree as specified by BehaviorTreeStructure
 */
public class TreeGenerator {

	/**
	 * Constructor for TreeGenerator
	 */
	public TreeGenerator(){}
	
	/** 
	 * @return a an instance of a BehaviorTree as specified by 
	 * BehaviorTreeStructure
	 */
	public TreeNode generateTree() {
		BlackBoard blackBoard = new BlackBoard();
		return createNode(BehaviorTreeStructure.getRoot(), blackBoard);
	}
	
	/**
	 * Recursive function that generates the children of a TreeNode and
	 * then the TreeNode itself
	 * @param node - the node to create
	 * @return - the node, along with all its subtrees
	 */
	private TreeNode createNode(BehaviorTreeStructure node, 
			BlackBoard blackBoard) {

		System.out.println("Created " + node.getDescription() + " .\n");
		
		/** Retrieve Children */
		BehaviorTreeStructure[] children = node.getChildren();
		
		/** Create Children */
		ArrayList<TreeNode> createdChildren = new ArrayList<TreeNode>();
		if (children != null) {
			for (BehaviorTreeStructure t: children) {
				createdChildren.add(createNode(t, blackBoard));
			}
		}
		
		/** Make Node */
		TreeNode newNode = null;
		Class<?> nodeClass = node.getTreeNodeType().getClassType();
		Constructor<?> constructor;
		
		try {
			constructor = nodeClass.getConstructor(String.class, BlackBoard.class);
			newNode = (TreeNode) constructor.newInstance(
					node.getDescription(),
					blackBoard
					);
			newNode.setChildren(createdChildren);
		} catch (Exception e) {
			System.out.println("Error Creating Node. Exiting...");
			System.exit(1);
		}
		
		return newNode;
	}
	
}