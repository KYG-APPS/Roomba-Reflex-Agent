package tree;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import node.*;
import util.TreeNodeType;
/**
 * TreeGenerator.java
 * @author Kevin Gao on 2020-9-29
 *
 * Generates a BehaviorTree as specified by RoombaBehaviorTree
 */
public class TreeGenerator {

	
	public TreeGenerator() {
		
	}
	
	public void testMethod() {
		
		TreeNode node;
		Method method;
		Constructor<?> constructor;
		
		try {
			constructor = TreeNodeType.DO_NOTHING.getClassType().getConstructor(String.class, BlackBoard.class);
			node = (TreeNode) constructor.newInstance("yey", null);
			method = TreeNodeType.DO_NOTHING.getClassType().getMethod("run");
			method.invoke(node);
			System.out.println("Success!");
		} catch (Exception e) {
			System.out.println("Error executing retrieved method in TreeGenerator.java. Exiting...");
			System.exit(1);
		}
	}
}