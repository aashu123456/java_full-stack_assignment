package main;

import java.util.Scanner;

import service.MyBank;

public class BankTest {

	public static void main(String args[]) {
		System.out.println("Welcome to Bank Application");
		Scanner sc = new Scanner(System.in);
		String name;
		boolean value = true;
		int accno, toaccno, amount;
		MyBank mybank = new MyBank();
		do {
			System.out.println(
					"Choose\n1 for Create Account\n2 for check Account Balance\n3 for withdraw the amount\n4 for Deposit\n5 for Transfer\n6 for exit the Application: ");
			int choose = sc.nextInt();

			switch (choose) {
			case 1:
				System.out.println("Press 1 for Default details\nPress 2 for name and Amount pass:");
				int ch = sc.nextInt();
				switch (ch) {
				case 1:
					mybank.accountcreate();
					break;
				case 2:
					System.out.println("Enter Name:");
					name = sc.next();
					System.out.println("Enter amount:");
					amount = sc.nextInt();
					mybank.accountcreate(name, amount);
					break;
				default:
					System.out.println("Invalid choice.");
				}
			case 2:
				System.out.println("For Check Balance");
				System.out.println("Enter Account Number:");
				accno = sc.nextInt();
				mybank.checkbalance(accno);
				break;
			case 3:
				System.out.println("Withdraw Money");
				System.out.println("Enter Account Number:");
				accno = sc.nextInt();
				System.out.println("Enter Amount:");
				amount = sc.nextInt();
				mybank.withdraw(accno, amount);
				break;
			case 4:
				System.out.println("Deposit Money");
				System.out.println("Enter Account Number:");
				accno = sc.nextInt();
				System.out.println("Enter Amount:");
				amount = sc.nextInt();
				mybank.deposit(accno, amount);
				break;
			case 5:
				System.out.println("Transfer Money");
				System.out.println("Enter Your Account Number:");
				accno = sc.nextInt();
				System.out.println("Enter Account Number to be transfered:");
				toaccno = sc.nextInt();
				System.out.println("Enter Amount to be transfered:");
				amount = sc.nextInt();
				mybank.transfer(accno, toaccno, amount);
				break;
			case 6:
				System.out.println("Thank you for using this bank");
				value = false;
				break;
			default:
				System.out.println("invalid choice.");
			}
		} while (value);
	}

}
