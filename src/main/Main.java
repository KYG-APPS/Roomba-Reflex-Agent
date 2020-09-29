package main;

import node.*;
import tree.TreeGenerator;

/**
 * main.java
 * @author Kevin Gao (kgao03) on 2020-9-27
 * 
 * Driver class for the Roomba Reflex Agent
 * Creates a Roomba instance and simulates cycles
 */
public class Main {

	/**
	 * Main function of the program
	 */
	public static void main(String[] args) {
		testRoomba();
	}

	private static void testRoomba() {
		/** Create BehaviorTree from the predefined structure in the enum */
		TreeGenerator generator = new TreeGenerator();
		TreeNode root = generator.generateTree();

		/** Create a Roomba with the BehaviorTree */
		Roomba roomba = new Roomba(root);
		
		roomba.setSpot(true);
		roomba.setDustySpot(true);
		roomba.setGeneral(true);

		int cycle = 1;
		/** Run simulation cycles */
		while(roomba.getBatteryLevel() >= 28) {
			System.out.println("---------- Running Cycle " + cycle + " ----------");
			roomba.runCycle();
			cycle++;
			System.out.println();
		}
	}

}