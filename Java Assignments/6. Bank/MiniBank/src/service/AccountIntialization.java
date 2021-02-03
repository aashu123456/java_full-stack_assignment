package service;

import Bean.Account;

abstract class AccountInitialization {
	public static int accountcount = 0, accountcount1 = 0, i = 0, j = 0;
	public static int accno = 100;
	public static int accno1 = 100;
	public String name;
	public int amount;
	public Account accounts[] = new Account[10];

	public void accountcreate() {
		if (accountcount < 10) {
			name = "Unknown";
			amount = 500;
			accounts[i] = new Account(accno, name, amount);
			accno++;
			i++;
			accountcount++;
		} else {
			accountcount1 = 1;
			System.out.println("Account Limit exceed.");
		}
	}

	public void accountcreate(String name, int amount) {
		if (accountcount1 < 10) {
			if (amount > 500) {
				this.name = name;
				this.amount = amount;
				accounts[j].setaccno(AccountInitialization.accno1);
				accounts[j].setname(this.name);
				accounts[j].setamount(this.amount);
				System.out.println("Name=" + accounts[j].getname());
				System.out.println("Account Number=" + accounts[j].getaccno());
				System.out.println("Amount=" + accounts[j].getamount());
				accountcount1++;
				accno1++;
				j++;
			} else {
				System.out.println("Amount should be greater than 500.");
			}
		} else {
			System.out.println("Account Limit exceed.");
		}
	}

	abstract void transfer(int fromaccno, int toaccno, int amount);
}
