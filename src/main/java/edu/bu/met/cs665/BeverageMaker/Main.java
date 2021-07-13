package edu.bu.met.cs665.BeverageMaker;

/**
 * This main program is responsible for demonstrating the functionality
 * of the Vending Machine. The program will run without prompting 
 * for user input (based on Michael's recording for week 1).
**/
public class Main {
	public static void main(String[] args) {
		/*
	         * This section will demonstrate money being input into the 
		 * vending machine to start program.
		 */
			
		 /*Initialize money input object with 0 balance. */
		 MoneyInput inputMoney = new MoneyInput(0,0.00);
		 /*Money is input into vending machine */
		 inputMoney.inputMoney(2,0.00);
			  
		  /*Create vending machine object to contain user selection. The user already
		  * paid the correct amount of money and decided on coffee).
		  */
	          VendingMachine drink = new VendingMachine(2,0.0,"Coffee");
	       
	          /*The condiment is created an initialized to a count of 0 */
	          Condiment milk = new Condiment("Milk",0);
	          /* The user wants to add 3 units of milk. This can be done by
	          * setting the count to 3 (using set count). */
	          milk.setCondimentCount(3);
	       
	          /*The condiment is created an initialized to a count of 0 */
	          Condiment sugar = new Condiment("Sugar",0);
	          /* The user wants to add 1 units of sugar. This can be done by
	          * setting the count to 1 (using set count). */
	          sugar.setCondimentCount(1);
	       
	          /* User has decided on the latte beverage(prior knowledge of selection
	          * and knows the amount of milk and sugar they desire.
	          */
	          drink.makeBeverage("latte", milk, sugar);
	}
}
