package edu.bu.met.cs665.BeverageMaker;
import edu.bu.met.cs665.BeverageMaker.VendingMachine;
/** 
 * The responsibility for this class is to handle money input 
 * for the beverages.
 */

public class MoneyInput {
	int cash; /* Dollar bill amount. */
	double coin; /*Coin amount. */
	
	/* 
	 * This will initialize the constructor 
	 * for the money input class.
	 */
	public MoneyInput(int cash,double coin) {
		this.cash = cash;
		this.coin = coin;
	}

	/*
	 * This is the getter and setter for the attributes.
	 */
	
	/*
	 * This is the getter for the cash amount.
	 */
	public int getCash() {
		return cash;
	}

	/*
	 * This is the setter for the cash amount
	 */
	public void setCash(int cash) {
		this.cash = cash;
	}

	/*
	 * This is the getter for the coin amount
	 */
	public double getCoin() {
		return coin;
	}

	/*
	 * This is the setter for the coin amount
	 */
	public void setCoin(double coin) {
		this.coin = coin;
	}
	
	public void inputMoney(int dollar, double cents) {
		if((dollar >= 0) & (cents >= 0.00)){
			System.out.println("The correct amount of money is inputted. The vending machine will start.");
			/*
			 * Change the cash value and coin value to the amount the user input.
			 */
			cash = dollar;
			coin = cents;
		}
		
		else {
			System.out.println("The incorrect amount of money is inputted. The vending machine will not start.");
		}
	}
}

