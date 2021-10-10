package account;

import java.util.Scanner;

public class Account {
	static int accountBalance = 10000;
	
	public static void debit() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter How much money you want to WithDraw :");
		int amount = sc.nextInt();
		sc.close();
		if(amount <= accountBalance) {
			accountBalance = accountBalance - amount;
			System.out.println("The Remaining money in your account :" + accountBalance);
		}
		else {
			System.out.println("Debit amount exceeded Account Balance");
			System.out.println("Your Account Balance is :" + accountBalance);
		}
	}
	
	public static void main(String[] args) {
		debit();
	}
}
