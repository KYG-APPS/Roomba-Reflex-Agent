package main;

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
		TreeGenerator generator = new TreeGenerator();
		generator.generateTree();
	}
	
}