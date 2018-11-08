import java.util.Scanner;

public class Calculator {
  /** Main method */
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String num1   = "";
    String num2   = "";
    String op     = "";
    
    int number1 = 0;
    int number2 = 0;
    
    // The result of the operation
    double result = 0.0;
    
    // Prompt user
    System.out.print("Enter the operation: ");
    num1 = input.next();
    op   = input.next();
    num2 = input.next();
    
    // Try catch statement to catch error
    try {
      number1 = Integer.parseInt(num1);
    } catch (NumberFormatException ex) {
      System.out.println("Wrong entry. Please try again. " + num1);
      return;
    }
    
    try {
      number2 = Integer.parseInt(num2);
    } catch (NumberFormatException ex) {
      System.out.println("Wrong entry. Please try again. " + num2);
      return;
    }

    // Determine the operator
    switch (op.charAt(0)) { 
      case '+': result = number1 + number2;
                break;
      case '-': result = number1 - number2;
                break;
      case '*': result = number1 * number2;
                break;
      case '/': result = number1 / number2;
    }

    // Display result
    System.out.println(num1 + ' ' + op + ' ' + num2
      + " = " + result);
  }
}
