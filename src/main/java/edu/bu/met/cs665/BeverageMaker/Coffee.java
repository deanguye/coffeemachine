package edu.bu.met.cs665.BeverageMaker;

/**
 * The responsibility of this class is to obtain the
 * different types of Coffee.
 **/

public class Coffee{
	private String coffeeType; /*Type of coffee such as expresso etc. */

	/* 
	 * This is the constructor for the class to initialize objects.
	 */
	public Coffee(String coffeeType){
		this.coffeeType = coffeeType;
	}
	
	
	/*
	 * This is the getter and setter for the attributes,
	 */
	
	/*
	 * This is the getter for the coffee type.
	 */
	public String getCoffeeType() {
		return coffeeType;
	}

	/*
	 * This is the setter for the coffee type.
	 */
	public void setCoffeeType(String coffeeType) {
		this.coffeeType = coffeeType;
	}
}





