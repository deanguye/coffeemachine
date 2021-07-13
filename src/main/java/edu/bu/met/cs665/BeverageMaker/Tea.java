package edu.bu.met.cs665.BeverageMaker;
/** 
 * The responsibility for this class is to handle the tea
 * beverage.
 */

public class Tea{
	private String teaType; /* get the type of tea such as black, green,etc. */

	/* 
	 * This is the constructor for the class to initialize objects.
	 */
	public Tea(String teaType){
		this.teaType = teaType;
	}
	
	
	/*
	 * This is the getter and setter for the attributes
	 */
	
	/*
	 * This is the getter for the tea type
	 */
	public String getTeaType() {
		return teaType;
	}

	/*
	 * This is the setter for the tea type
	 */
	public void setTeaType(String teaType) {
		this.teaType = teaType;
	}
}
