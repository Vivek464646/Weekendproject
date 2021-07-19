package Weekend__Project1;

import java.util.Scanner;

public class Account {
	
		int balance;
		int previousTrans;
		String customerName;
		String customerID;
		static double lastamount=0;
		
		
		
		
		Account(String cname,String cid){
			customerName = cname;
		    customerID = cid;
		    
			
			
		}
	
		
		
		void deposit(int amount) {
			if (amount != 0) {
				balance = balance + amount;
				previousTrans = amount;
			}
		}
		
		
		void withdraw(int amount) {
			if (amount != 0) {
				balance = balance - amount;
				previousTrans = -amount;
			}
		}
		
		
		void getPreviousTransaction() {
			if (previousTrans > 0) {
				System.out.println("Deposited: " + previousTrans);
			} else if (previousTrans < 0) {
				System.out.println("Withdrawn: " + Math.abs(previousTrans));
			} else {
				System.out.println("No transaction occurred");
			}
		}
		
		
		void calculateInterest(int years) {
			double interestRate = .0185;
			double newBalance = (balance * interestRate * years) + balance;
			System.out.println("The current interest rate is " + (100 * interestRate) + "%");
			System.out.println("After " + years + " years, you balance will be: " + newBalance);
		}
		
		
		void showMenu() {
			char option = '\0';
			Scanner scanner = new Scanner(System.in);
			System.out.println("Welcome, " + customerName + "!");
			System.out.println("Your ID is: " + customerID);
			System.out.println();
			System.out.println("What would you like to do?");
			System.out.println();
			System.out.println("A. Check your balance");
			System.out.println("B. Make a deposit");
			System.out.println("C. Make a withdrawal");
			System.out.println("D. View previous transaction");
			System.out.println("E. Calculate interest");
			System.out.println("F. Exit");
			
			do {
				System.out.println();
				System.out.println("Enter an option: ");
				char option1 = scanner.next().charAt(0);
				option = Character.toUpperCase(option1);
				System.out.println();
				
				switch(option) {
				
				case 'A':
					System.out.println("====================================");
					System.out.println("Balance =Rs" + balance);
					System.out.println("====================================");
					System.out.println();
					break;
				
				case 'B':
					System.out.println("Enter an amount to deposit: ");
					int amount = scanner.nextInt();
					deposit(amount);
					System.out.println();
					System.out.println("The amount is added to your Account");
					break;
				
				case 'C':
					System.out.println("Enter an amount to withdraw: ");
					int amount2 = scanner.nextInt();
					withdraw(amount2);
					System.out.println();
					System.out.println("Please collect your cash");
					break;
				
				case 'D':
					System.out.println("====================================");
					getPreviousTransaction();
					System.out.println("====================================");
					System.out.println();
					break;
				
				case 'E':
					System.out.println("Enter how many years of accrued interest: ");
					int years = scanner.nextInt();
					calculateInterest(years);
					break;
				
				case 'F':
					System.out.println("====================================");
					break;
				
				default:
					System.out.println("Error: invalid option. Please enter A, B, C, D, or E or access services.");
					break;
				}
			} while(option != 'F');
			System.out.println("Thank you for banking with us!");

}
		void loans() {
			char option = '\0';
			Scanner scanner = new Scanner(System.in);
			System.out.println("Welcome, " + customerName + "!");
			System.out.println("Your ID is: " + customerID);
			System.out.println();
			System.out.println("Available Loans?");
			System.out.println();
			System.out.println("A. Agriculture");
			System.out.println("B. Home");
			System.out.println("C. Vehicle");
			System.out.println("D. Industrial");
			System.out.println("E. Exit");
			
			do {
				System.out.println();
				System.out.println("Enter an option: ");
				char option1 = scanner.next().charAt(0);
				option = Character.toUpperCase(option1);
				System.out.println();
				
                switch(option) {
                case 'A':
                
					System.out.println("====================================");
					System.out.println("The Intrest rate for Agricultural loans is 3%");
					System.out.println("====================================");
					System.out.println("Enter the amount required: ");
					int amount2 = scanner.nextInt();
					Agriloan(amount2);
					System.out.println("====================================");
					System.out.println("The term of repayment is 3 years");
					System.out.println();
					break;
                case 'B':
                    
					System.out.println("====================================");
					System.out.println("The Intrest rate for Home loans is 5%");
					System.out.println("====================================");
					System.out.println("Enter the amount required: ");
					int amount3 = scanner.nextInt();
					Homeloan(amount3);
					System.out.println("====================================");
					System.out.println("The term of repayment is 5 years");
					System.out.println();
					break;
                case 'C':
                    
					System.out.println("====================================");
					System.out.println("The Intrest rate for Vehicle loans is 7%");
					System.out.println("====================================");
					System.out.println("Enter the amount required: ");
					int amount4 = scanner.nextInt();
					Vehiloan(amount4);
					System.out.println("====================================");
					System.out.println("The term of repayment is 5 years");
					System.out.println();
					break;
                case 'D':
                    
					System.out.println("====================================");
					System.out.println("The Intrest rate for Industrial loans is 10%");
					System.out.println("====================================");
					System.out.println("Enter the amount required: ");
					int amount5 = scanner.nextInt();
					Indusloan(amount5);
					System.out.println("====================================");
					System.out.println("The term of repayment is 10 years");
					System.out.println();
					break;
            	case 'E':
					System.out.println("====================================");
					break;
				
			
		}} while(option != 'E');
		System.out.println("Thank you for banking with us!");
		
}
		double Agriloan(int amount) {
			double intrestr=0.03;
			int years=3;
			double last1=(amount*intrestr*years);
			double last=last1+amount;
			System.out.print("Amount to pay after 3 years " + last + "rs");
			return last;
			
		}
		void Homeloan(int amount) {
			double intrestr=0.05;
			int years=5;
			double last1=(amount*intrestr*years);
			double last=last1+amount;
			System.out.print("Amount to pay after 5 years " + last + "rs");
			
		}
		void Vehiloan(int amount) {
			double intrestr=0.07;
			int years=5;
			double last1=(amount*intrestr*years);
			double last=last1+amount;
			System.out.print("Amount to pay after 5 years " + last + "rs");
		}
		void Indusloan(int amount) {
			double intrestr=0.10;
			int years=7;
			double last1=(amount*intrestr*years);
			double last=last1+amount;
			System.out.print("Amount to pay after 7 years " + last + "rs");
		}
		}