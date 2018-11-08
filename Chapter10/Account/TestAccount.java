/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
import java.util.*;

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
        
        int d = 1;
        Account[] people = new Account[10];
        Scanner input = new Scanner(System.in);
        
//      Creating object for program
        Account primaryAccount = new Account();

        
        for (int i = 0; i < people.length; i++) {
            System.out.println("Enter an account number: ");
            people[i] = new Account();
            String numbers = input.next();
            
             // While loop
               while (d != 4) {
                    
                    System.out.println("Enter a choice: ");
                    d = input.nextInt();
                    
                    if (d == 1) {
                        System.out.println("Your current balance is " + primaryAccount.newAccountsBalance());
                    } else if (d == 2) {
                        System.out.println("Input an amount to withdraw ");
                        double dollar = input.nextDouble();
                        
                        System.out.println("Your new balance is: " + primaryAccount.newWithdraw(dollar));
                    } else if (d == 3) {
                        System.out.println("Input an amount to deposit " );
                        double dollar = input.nextDouble();
                        
                        System.out.println("Your new balance is " + primaryAccount.newDeposit(dollar));


                    } else {
                        

                    }
                    
                }
                d--;
        }
    }
}
































