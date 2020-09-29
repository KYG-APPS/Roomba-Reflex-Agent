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

	/**
	 * Tests the Roomba in a randomized situation
	 */
	private static void testRoomba() {
		/** Create BehaviorTree from the predefined structure in the enum */
		TreeGenerator generator = new TreeGenerator();
		TreeNode root = generator.generateTree();

		/** Create a Roomba with the BehaviorTree */
		Roomba roomba = new Roomba(root);
		
		roomba.setSpot(true);
		roomba.setDustySpot(true);
		roomba.setGeneral(true);
		
		/** Run simulation cycles */
		int cycle = 1;
		while(roomba.getBatteryLevel() >= 28) {
			int batteryLevel = roomba.getBatteryLevel();
			System.out.println("---------- Running Cycle " + cycle + " ----------");
			System.out.println("Battery: " + batteryLevel);
			roomba.runCycle();
			cycle++;
			System.out.println();
		}
	}

}