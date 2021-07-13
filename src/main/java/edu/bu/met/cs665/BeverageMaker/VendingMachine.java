package edu.bu.met.cs665.BeverageMaker;
import edu.bu.met.cs665.BeverageMaker.Condiment;

/**
 * This class is responsible for making the beverage 
 * in the vending machine.
 **/
/* the user must input money to use vending machine, hence the extend*/
public class VendingMachine extends MoneyInput { 
	private String beverage; /* beverage to be dispensed*/
	
	/* 
	 * This is the constructor for the class to initialize objects.
	 */
	public VendingMachine(int cash, Double coin, String beverage){
		/*
		 * This class has an aggregate relationship with money input
		 */
		super(cash, coin);
		
		/*
		 * Check if the user input the appropriate beverage choice selection.
		 * If the user inputs coffee or tea (upper or lower), initialize
		 * the object.
		 */
		if ((beverage.contains("Coffee"))||(beverage.contains("Tea"))||
				(beverage.contains("coffee"))||(beverage.contains("tea"))) {
			this.beverage = beverage;
		}
		
		/*
		 * If the user does not input the right answer, the object will not be
		 * initialized and the program will exit.
		 */
		else {
			String errorMessage = "This message appeared because user inputted a beverage not in Vending Machine";
			throw new RuntimeException (errorMessage);
		}
	}
	
	/*
	 * This is the getter and setter for the attributes
	 */
	
	/*
	 * This is the getter for beverage
	 */
	public String getBeverage() {
		return beverage;
	}

	/*
	 * This is the setter for beverage
	 */
	public void setBeverage(String beverage) {
		this.beverage = beverage;
	}

	
	/*
	 * This is the method to make desired beverage.
	 * based on customer's selections. The return
	 * value will be the beverage to indicate 
	 * the impact these selections will have on
	 * the beverage. The assumption is that the customer
	 * will already know the coffee types and tea
	 * types and their condiment amount/type.
	 */
	public String makeBeverage(String beverageType, Condiment condiment1, Condiment condiment2) {	
		/*
		 * The condiment counts will be converted to string to demonstrate side effect for 
		 * this method.The "side effect" (for unit testing) is that the beverage will 
		 * be changed.
		 */
		String condiment1String = Integer.toString(condiment1.getCondimentCount()); 
		String condiment2String = Integer.toString(condiment2.getCondimentCount());

		/*
		 * Check if coffee type beverage is selected 
		 */
		if((beverageType.contains("Americano"))||(beverageType.contains("americano"))||
				(beverageType.contains("Expresso"))||(beverageType.contains("expresso"))||
				(beverageType.contains("Latte"))||(beverageType.contains("latte"))||
				(beverageType.contains("Macchiato")||(beverageType.contains("macchiato")))){
			Coffee coffee = new Coffee(beverageType);
			
			/* change the beverage type to customized coffee */
			beverage = "The " +coffee.getCoffeeType() + " Coffee Beverage is made with "+
						condiment1String +" units of "+condiment1.getCondimentType()
						+ " and "+condiment2String+ " units of "+ condiment2.getCondimentType()+".";
				System.out.println(beverage);
			}
		
		/*
		 * Check if tea type beverage is selected.
		 */
		
		else if((beverageType.contains("Black"))||(beverageType.contains("black"))||
					(beverageType.contains("Green"))||(beverageType.contains("green"))||
					(beverageType.contains("Yellow"))||(beverageType.contains("yellow"))){
			Tea tea = new Tea(beverageType); /* create tea object */
				
			/*change the beverage type to the customized tea. */
			beverage = "The "+tea.getTeaType() + " Tea Beverage is made with "+
						condiment1String +" units of "+condiment1.getCondimentType()
					+ " and "+condiment2String+ " units of "+ condiment2.getCondimentType()+".";
				System.out.println(beverage); /* print out the customized tea beverage */
			}
		
		
		/*
		 * If user does not state the choices listed, print out the message and exit the program.
		 */
		else{
			String errorMessage = "This message appeared because user inputted a beverage not in Vending Machine";
			throw new RuntimeException (errorMessage);
		}
		return beverage; /*return the beverage */
	}
}
	
	
