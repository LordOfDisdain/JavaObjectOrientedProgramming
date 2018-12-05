/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rmazorow
 */
import java.io.*;
import java.util.Scanner;
import java.io.ObjectInputStream;

public class Exercise17_07 extends Loan{
    
    Scanner reading = new Scanner(System.in);
    public static void main(String[] args) throws FileNotFoundException {
        Loan loan1 = new Loan();
        Loan loan2 = new Loan(1.8, 10, 10000);
        
        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("Exercise17_07.dat"));
        ) {
            output.writeObject(loan1);
            output.writeObject(loan2);
            outputData();
        } 
        catch (IOException ex) {
            System.out.println("File could not be opened");
        }
    }
    
    public static void outputData() throws EOFException{
        
        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream("Exercise17_07.dat"));
        ){
            Loan pay = new Loan();
           
            System.out.println(pay.getLoanAmount());
            
        } catch (EOFException eg) {
            System.out.println("File does not work");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
















