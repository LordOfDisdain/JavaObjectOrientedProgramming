import java.util.Scanner;
import java.lang.Math;

class CheckingAccount extends Account {
	private double balance;
	private int id;
	private double deposit;
	private double withdraw;

	public double overdraftLimit(){
		double amount = 0.0;
		// Lets say if the balance is zero and the userinput is taking more than the balance
		// Make the method return the userinput variable back to main
		if ((balance == 0) && (amount > balance)) {
			System.out.println("Invaild entry. Please try again.");
		} else {
			amount -= balance;
		}
		
		return amount;
	}
	
	public String toString(){
		String a = "Checking account: balance = " + balance + " account id = " 
		+ id + " withdrawal amount " 
		+ withdraw + " and amount depositied = " + deposit;
		
		return a;
	}
	// id, balance, despoited amount and withdrawal amount
} 

