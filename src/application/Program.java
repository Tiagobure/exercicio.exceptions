package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		try {
		Account account = new Account();
		
		System.out.println("Enter account data:");
		System.out.print("number: ");
		int number = sc.nextInt();
	
	    System.out.print("Holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		
		System.out.print("Initia balance: ");
		Double balance = sc.nextDouble();
		
		System.out.print("Withdrawl Limit: ");
		Double limit = sc.nextDouble();
		
		account = new Account(number, holder,balance, limit);
		
		System.out.print("Enter amount for withdraw:");
		Double withdraw =sc.nextDouble();
		account.Withdraw(withdraw);
		}catch(DomainException e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}
		
		
	
		
		
		sc.close();
		
		
	}

}
