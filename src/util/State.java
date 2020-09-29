package util;

/**
 * State.java
 * @author Kevin Gao on 2020-9-27
 * 
 * Enum that standardizes the return values of TreeNodes
 */
public enum State {
	
	SUCCEEDED("SUCCEEDED"),
	FAILED("FAILED"),
	RUNNING("RUNNING");
	
	/** text description of this State */
	private String description;
	
	/**
	 * Constructor for State
	 * @param description - text description of this state
	 */
	State(String description) {
		this.description = description;
	}
	
	/**
	 * @return text description of this state
	 */
	public String getDescription() {
		return this.description;
	}
	
}