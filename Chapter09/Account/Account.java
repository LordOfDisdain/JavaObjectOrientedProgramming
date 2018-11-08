/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import java.util.Date;
import java.sql.*;

/**
 *
 * @author student
 */
public class Account {

    
    
    private int ID = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    java.util.Date dateCreated; 
    
    
    public static void main(String[] args){
    }

    
    public Account(){
        dateCreated = new java.util.Date();
    }
    
    public Account(int ID, double balance, double annualInterestRate) {
        this.ID = ID;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        dateCreated = new java.util.Date();
    }
    
    public java.util.Date getdateCreated(){
        return dateCreated;
    }
    
    Date setdateCreated(){
        return dateCreated;
    }
    
    int getID(){
        return ID;
    }
    
    double getBalance(){
        return balance;
    }
    
    double getAnnualInterestRate(){
        return annualInterestRate;
    }
    
    int setID(){
        return ID;
    }
    
    double setBalance(){
        return balance;
    }
    
    double setAnnualInterestRate(){
        
        return annualInterestRate;
    }
    
    double getMonthlyInterestRate(){

        return (annualInterestRate / 12);
    }
    
    double getMonthlyInterest(){
        double monthlyInterestRate;
        return balance * (annualInterestRate / 12);
    }
    
    double withdraw() {
        double moneySubtracted = 2500;
        double moneyLeft;
        
        moneyLeft = balance - moneySubtracted;
        return moneyLeft;
    }
    
    double deposit(){
        double moneyAdded = 3000;
        double moneyResult;
        moneyResult = balance + moneyAdded;
        return moneyResult;
    }
    
}