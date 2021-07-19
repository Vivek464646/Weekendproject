package Weekend__Project1;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		System.out.println("Enter name");
        Scanner scanner2 = new Scanner(System.in);
        String cname=scanner2.nextLine();
        System.out.println("Enter cid");
        Scanner scanner3 = new Scanner(System.in);
        String cid=scanner3.nextLine();
        Account pass=new Account(cname,cid);
        
        
		char option='\0';
		Scanner scanner = new Scanner(System.in);
		System.out.println("A:Loans");
		System.out.println("B:Navigate the account");
		do {
			System.out.println();
			System.out.println("Enter an option: ");
			char option1 = scanner.next().charAt(0);
			option = Character.toUpperCase(option1);
			System.out.println();
			switch(option) {
			case 'A':
				pass.loans();
				
	            break;
			case 'B':
				pass.showMenu();
				break;
		}
		}
		while(option!='B');
			System.out.println("Thank you");
		}
			
		
		// TODO Auto-generated method stub

	}
