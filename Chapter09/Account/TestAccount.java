/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */
public class TestAccount {
    
    public static void main(String[] args){
        // Creating object for program
        Account primaryAccount = new Account(1122, 20000, 0.045);
        
        // Setting up the account ID
        System.out.println("Your account ID is " + primaryAccount.setID());
        
        // Seting up balance
        System.out.println("Your account balance is " + primaryAccount.setBalance());
        
        //Setting up the interest rate
        System.out.println("Your monthly interest rate is " + primaryAccount.getMonthlyInterestRate());
        
        // Setting up the monthly interest
        System.out.println("The monthly interest is " + primaryAccount.getMonthlyInterest());
        
        // Setting up the date
        System.out.println("The day the account opened was " + primaryAccount.getdateCreated());
        
        // Setting up deposit
        System.out.println("You  have desposited " + primaryAccount.deposit());
        
        // Setting up the withdrawal
        System.out.println("You have withdrawn " + primaryAccount.withdraw());
        
    }
    
}