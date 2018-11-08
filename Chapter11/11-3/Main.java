import java.util.Scanner;
import java.lang.Math;


class TestBanks extends Account {
	public static void main(String[] args) {
		
		Account savings = new Account();
		Account	checking = new Account();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an an account number:");
		
		int id = input.nextInt();
		
		System.out.println("Choose which bank account you are using.");
		System.out.println("Press one for checking.");
		System.out.println("Press two for savings.");
		
		int choice = input.nextInt();
		
		// If statement for selection of accounts
		if (choice == 1) {
			// implementation of the checking account
			
			System.out.println("Enter an amount to deposit to your checking account: ");
			
			double deposit = input.nextDouble();
			
			checking.deposit(deposit);
			
			System.out.println("You have Deposited " + checking.getBalance());
			
			System.out.println("Enter an amount to withdraw from your checking account: ");
			
			// make an if statement to let the user know if they are taking the wrong amount of money
			// Or they can proceed with their transcation.
			double withdraw = input.nextDouble();
			
			if ((checking.getBalance() == 0) && (withdraw > checking.getBalance())) {
				System.out.println("You have enterted an invalid amount. Please try again.");
			} else {
				checking.withdraw(withdraw);
				System.out.println("You have taken out " + withdraw + " dollars.");
				System.out.println(checking.toString());
			}
		} else if (choice == 2) {
			// implementation of the checking account
			
			System.out.println("Enter an amount to deposit to your checking account: ");
			
			double deposit = input.nextDouble();
			
			savings.deposit(deposit);
			
			System.out.println("You have Deposited " + savings.getBalance());
			
			System.out.println("Enter an amount to withdraw from your checking account: ");
			
			// make an if statement to let the user know if they are taking the wrong amount of money
			// Or they can proceed with their transcation.
			double withdraw = input.nextDouble();
			
			if ((savings.getBalance() == 0) && (withdraw > savings.getBalance())) {
				System.out.println("You have enterted an invalid amount. Please try again.");
			} else {
				checking.withdraw(withdraw);
				System.out.println("You have taken out " + withdraw + " dollars.");
				System.out.println(savings.toString());
			}
		} else {
			System.out.println("Invalid entry, please try again.");
		}
		
	}
}