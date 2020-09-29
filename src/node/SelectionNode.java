package node;

import util.State;
import util.TreeNodeType;

/**
 * SelectionNode.java
 * @author Kevin Gao on 2020-9-27
 *
 * Implementation of the Selection Composite TreeNode
 */
public class SelectionNode extends TreeNode {

	/**
	 * Constructor for SelectionNode
	 * @param descriptor - custom description of the purpose of this TreeNode
	 */
	public SelectionNode(String descriptor) {
		super(descriptor, TreeNodeType.SELECTION);
	}
	
	// TODO: Implement Order
	public State run() {
		return null;
	}
	
	public static void test() {
		
	}
	
}