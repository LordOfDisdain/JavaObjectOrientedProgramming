/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import java.util.Date;
/**
 *
 * @author student
 */
public class TestAccount {
	
	public static void main(String[] args){
		// Creating object for program
		Account primaryAccount = new Account();
		Account myAccount = new Account(1122, 20000);
		Date date = new Date();
		
		// Setting up the account ID
		System.out.println("Your account ID is " + myAccount.getId());
		
		// Seting up balance
		System.out.println("Your account balance is " + myAccount.getBalance());
		
		// Setting up deposit
		myAccount.deposit(3000);
		
		// Setting up the withdrawal
		myAccount.withdraw(2500);
		
		// Balance
		System.out.println("Your account balance is " + myAccount.getBalance());
		
		//Setting up the interest rate
		myAccount.setAnnualInterestRate(0.045);
		
		// Setting up the monthly interest
		System.out.println("The monthly interest is " + myAccount.getMonthlyInterest());
		
		// Setting up the date
		System.out.println("The day the account opened was " + date.toGMTString());
		
	}
	
}