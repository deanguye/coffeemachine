package edu.bu.met.cs665.BeverageMaker;

/** 
 * The responsibility for this class is to handle the condiment
 * types such as sugar and milk.
 */

public class Condiment {
	private String condimentType; /*type of condiment such as sugar */
	private int condimentCount; /* count how many units of condiment */
	
	/* 
	 * This is the constructor for the class to initialize objects.
	 */
	public Condiment(String condimentType, int condimentCount){
		this.condimentType = condimentType;
		this.condimentCount = condimentCount;
	}

	/*
	 * This is the getter and setter for the attributes.
	 */
	
	/*
	 * This is the getter for the condiment type.
	 */
	public String getCondimentType() {
		return condimentType;
	}

	/*
	 * This is the setter for the condiment type.
	 */
	public void setCondimentType(String condimentType) {
		this.condimentType = condimentType;
	}

	/*
	 * This is the getter for the condiment count.
	 */
	public int getCondimentCount() {
		return condimentCount;
	}

	/*
	 * This is the setter for the condiment count if the user wants to 
	 * add a certain amount of condiment.The setter method has a check 
	 * in place to prevent setting the condiment count less than 0 or
	 * more than 3.
	 */
	public void setCondimentCount(int condimentCount) {
		if((condimentCount<0)||(condimentCount>3)){ /*Check for the count input. */
			/*Print out message to notify user of bad input. */
			System.out.println("This program does not allow setting less than 0 units and more than 3 units. "
					+ "\nThe condiment count will be set to 0 by default unless the user"
					+ "\ntries again between the numbers 0 and 3.");
			/*
			 * Set the condiment count to 0 by default.
			 */
			this.condimentCount = 0;
		}
		
		else {
			/*The condiment value will be set to the desired count.*/
			this.condimentCount = condimentCount;
		}
	}
}
