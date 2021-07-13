package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import edu.bu.met.cs665.BeverageMaker.Condiment;
import edu.bu.met.cs665.BeverageMaker.MoneyInput;
import edu.bu.met.cs665.BeverageMaker.VendingMachine;

/**
 * The responsibility of this test is to walk through the process
 * of making a beverage. The first test will verify the money
 * has been input. The second test will verify a Vending Machine
 * drink is created to take in user's preferences (tea/coffee). 
 * The third test will verify that the user can modify the condiment
 * count. The fourth test will verify the beverage can be made based
 * on user's preferences.
 */
public class TestMakeBeverage {
	/* 
	 * This section will test the input money method. The 
	 * expected outcome will be that the cash variable and 
	 * coin variables will be changed based on user input.
	 */
	
	/*Initialize money input object with 0 balance. */
	  MoneyInput testInputMoney = new MoneyInput(0,0.00);
	 	
	  /*
	   * This will test the money is inside the vending machine
	   * and that the cash and coin variables are modified. 
	   */
	  @Test
	  public void testInputMoney() {
		  testInputMoney.inputMoney(2,0.00); /*Input money into machine. */
		  assertEquals(2,testInputMoney.getCash());/*Check the cash value is changed. */
	  }
	
	  
	/*
	 * This section will test the creation of a VendingMachine drink.
	 * The underlying assumption is that the user has already input
	 * 2 dollars and 0.00 cents into the machine. Hence, the machine
	 * will process making the tea.
	 */
	  
	/*Create vending machine object. */
	VendingMachine testDrink = new VendingMachine(2,0.00,"Tea");

	/*
	 * Test that the Tea beverage is created. The "get beverage"
	 * method will be used to verify.
	 */
	@Test
	public void testGetBeverage() {
		/*Check that the beverage type is 'Tea'. */
		assertEquals("Tea",testDrink.getBeverage());
	}

	
	/* 
	 * This section will test that the Condiment count
	 * can be modified.
	 */
	
	/*The condiment is created an initialized to a count of 0. */
    Condiment milk = new Condiment("Milk",0);
    Condiment sugar = new Condiment("Sugar",0);
    
    /* Test the condiment count is modified for milk and sugar.*/
    @Test
    public void testSetCondimentCount(){ 
    	milk.setCondimentCount(3);/*set milk count to 3 units */
		  sugar.setCondimentCount(5);/*set sugar count to 5 units */
		  /* verify both condiments have been modified*/
		  assertEquals(3,milk.getCondimentCount());
		  /* 
		   * The expected value set to 0 because the condiment count is greater 
		   * than 3. A message will print out stating that the condiment count will
		   * be reset.
		   */
		  assertEquals(0,sugar.getCondimentCount());
    }
    
    
    /* 
	 * This section will verify the beverage has been 
	 * made based on user preference. Note, the 
	 * "setCondimentCount" method is called again because 
	 * the default condiment count of the object, 
	 * "testDrink" is 0. 
	 */
	@Test
	public void testMakeBeverage() {
		 /* Modify condiment counts for milk and sugar based on user input */
		 milk.setCondimentCount(3); 
		 sugar.setCondimentCount(3);
		 /* Make the beverage based on user preferences. */
		 testDrink.makeBeverage("Black",sugar, milk);
		 /* Assert the beverage has been made successfully. The statement will print
		  * out state "The Black Tea Beverage is made with 3 units of Sugar and 3 units of
		  * Milk.
		  */
		 assertEquals("The Black Tea Beverage is made with 3 units of Sugar and 3 units of Milk.",testDrink.getBeverage());
	}

}
