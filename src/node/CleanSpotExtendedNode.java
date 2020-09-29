package node;

import tree.BlackBoard;
import util.State;
import util.TreeNodeType;

/**
 * CleanSpotExtendedNode.java
 * @author Kevin Gao on 2020-9-27
 *
 * Implementation of the Clean Spot Extended Task TreeNode
 */
public class CleanSpotExtendedNode extends TreeNode {

	/** Number of remaining 'runs' until State.SUCCEEDED is returned */
	private int remaining_cycles;
	
	/**
	 * Constructor for CleanSpotExtendedNode
	 * @param descriptor - custom description of the purpose of this TreeNode
	 */
	public CleanSpotExtendedNode(String descriptor, BlackBoard blackBoard) {
		super(descriptor, TreeNodeType.CLEAN_SPOT_EXTENDED, blackBoard);
		this.remaining_cycles = 35;
	}

	/**
	 * Runs one cycle of 'clean spot', decrementing remaining_cycles
	 * If remaining_cylces equals 0, resets remaining_cycles to default value
	 * 
	 * @return State.SUCCEEDED if remaining_cylces reached 0;
	 * otherwise, returns State.RUNNING
	 */
	public State run() {
		System.out.print("Running " + super.getDescriptor() + " NODE...");
		BlackBoard blackBoard = super.getBlackBoard();
		blackBoard.setBatteryLevel(blackBoard.getBatteryLevel() - 1);
		
		this.remaining_cycles--;
		if (this.remaining_cycles == 0) {
			this.remaining_cycles = 35;
			blackBoard.setDustySpot(false);
			System.out.println(" SUCCEEDED!");
			return State.SUCCEEDED;
		}
		System.out.println(" RUNNING");
		return State.RUNNING;
	}
	
}
