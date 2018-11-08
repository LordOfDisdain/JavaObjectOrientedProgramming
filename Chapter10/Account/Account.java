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
public class Account {
    
    public static void main(String[] args){
        
    }
    
    private int ID = 0;
    private double balance = 100;
    private double annualInterestRate = 0;
    private double moneySubtracted = 0;
    private double moneyAdded = 0;
    private Date dateCreated;
    
    void defaultAccount(){
        
    }
    
    void zakAccount() {
        ID = 2121;
        balance = 14000;
    }
    
    double getdateCreated(){
        return 0;
    }
    
    public double newAccountsBalance(){
        double balance;
        balance = 100;
        this.balance = balance;
        
        return balance;
    }
    
    public double newWithdraw(double amount) {
        balance = balance - amount;
        return balance;
    }

    
    public double newDeposit(double amount){
        balance = balance + amount;
        return balance;
    }
    
}














