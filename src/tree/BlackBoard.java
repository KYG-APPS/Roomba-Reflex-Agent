package tree;

/**
 * BlackBoard.java
 * @author Kevin Gao on 2020-9-29
 *
 * Implementation of the inter-node communication mechanism, one per tree
 *  
 * Necessary because Java does not support non-homegenous pairs
 * (Sorry! I will use Python next time :) )
 */
public class BlackBoard {

	/** The battery level of the Roomba */
	private int batteryLevel;

	/** Whether or not the 'spot' command was requested */
	private boolean spot;

	/** Whether or not the 'general' command was requested */
	private boolean general;

	/** Whether or not a 'dusty spot' was detected */
	private boolean dustySpot;

	/** Path to the docking station */
	private String homePath;

	/**
	 * Constructor for BlackBoard
	 * @param batteryLevel - the battery level of the Roomba
	 * @param spot - whether or not the 'spot' command was requested
	 * @param general - whether or not the 'general' command was requested
	 * @param dustySpot - whether or not a 'dusty spot' was detected
	 * @param homePath - path to the docking station
	 */
	public BlackBoard(int batteryLevel, boolean spot, 
			boolean general, boolean dustySpot, String homePath) {
		this.setBatteryLevel(batteryLevel);
		this.setSpot(spot);
		this.setGeneral(general);
		this.setDustySpot(dustySpot);
		this.setHomePath(homePath);
	}
	
	/**
	 * No-Args Constructor for Blackboard
	 * Initializes a BlackBoard with default values
	 */
	public BlackBoard() {
		this(100, false, false, false, null);
	}

	/**
	 * @return the battery level of the Roomba
	 */
	public int getBatteryLevel() {
		return batteryLevel;
	}
	
	/**
	 * Sets the battery level
	 * @param batteryLevel - the new battery level
	 */
	public void setBatteryLevel(int batteryLevel) {
		this.batteryLevel = batteryLevel;
	}

	/**
	 * @return true if the 'spot' command was requested;
	 * otherwise, returns false
	 */
	public boolean isSpot() {
		return spot;
	}

	/**
	 * Sets whether or not the 'spot' command was requested
	 * @param spot - the new value of spot
	 */
	public void setSpot(boolean spot) {
		this.spot = spot;
	}

	/**
	 * @return true if the 'general' command was requested;
	 * otherwise, returns false
	 */
	public boolean isGeneral() {
		return general;
	}

	/**
	 * Sets whether or not the 'general' command was requested
	 * @param spot - the new value of general
	 */
	public void setGeneral(boolean general) {
		this.general = general;
	}

	/**
	 * @return true if the sensor detected a 'dusty spot';
	 * otherwise, returns false
	 */
	public boolean isDustySpot() {
		return dustySpot;
	}

	/**
	 * Sets whether or not a 'dusty spot' was detected
	 * @param dustySpot - the new value of dustySpot
	 */
	public void setDustySpot(boolean dustySpot) {
		this.dustySpot = dustySpot;
	}

	/**
	 * @return the 'home path' of the Roomba if there is one;
	 * otherwise, returns null
	 */
	public String getHomePath() {
		return homePath;
	}

	/**
	 * Sets the 'home path' of the Roomba
	 * @param homePath - the new value of homePath
	 */
	public void setHomePath(String homePath) {
		this.homePath = homePath;
	}

}