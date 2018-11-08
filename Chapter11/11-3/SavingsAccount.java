import java.util.Scanner;
import java.lang.Math;

class SavingsAccount extends Account {
	
	private double balance;
	private int id;
	private double deposit;
	private double withdraw;
	
	public double overdraftLimit(){
		double userinput = 0.0;
		// Lets say if the balance is zero and the userinput is taking more than the balance
		if ((balance == 0) && (userinput > balance)) {
			System.out.println("Invaild entry. Please try again.");
		} else {
			userinput -= balance;
		}		
		return userinput;
	}
	
	public String toString(){
		String a = "Checking account: balance = " + balance + " account id = " 
		+ id + " withdrawal amount " 
		+ withdraw + " and amount depositied = " + deposit;
			
		return a;
	}
	
// overdraft limit
// all same info plus one more argument
}











