package service;

public class MyBank extends AccountInitialization implements Bank {
	public void transfer(int fromaccno, int toaccno, int amount) {
		if (accountcount != 0) {
			for (i = 0; i < 10; i++) {
				if (accounts[i].getaccno() == fromaccno) {
					for (int j = 0; j < 10; j++) {
						if (accounts[j].getaccno() == toaccno) {
							if (accounts[i].getamount() - amount > 500) {
								accounts[i].setamount(accounts[i].getamount() - amount);
								accounts[j].setamount(accounts[j].getamount() + amount);
								break;
							} else {
								System.out.println("Minimum balance 500 should be maintained.");
							}
						}
					}
					break;
				}
			}
		} else {
			System.out.println("Account is not created. Create Your account first");
		}
	}

	public void withdraw(int accno1, int amount1) {
		if (accountcount != 0) {
			for (int i = 0; i < 10; i++) {
				if (accounts[i].getaccno() == accno1) {
					if ((accounts[i].getamount() - amount1) > 500) {
						accounts[i].setamount(accounts[i].getamount() - amount1);
						System.out.println("Amount withdrawn successfully");
						break;
					} else {
						System.out.println("Minimum balance 500 should be maintained.");
					}
				}
			}
		} else {
			System.out.println("Account is not Created. Create your account first.");
		}
	}

	public void deposit(int accno1, int amount1) {
		if (accountcount != 0) {
			for (int i = 0; i < 10; i++) {
				if (accounts[i].getaccno() == accno1) {
					if (amount1 < 50000) {
						accounts[i].setamount(accounts[1].getamount() + amount1);
						System.out.println("Amount Deposited successfully.");
					} else {
						System.out.println("Amount is more than 50000. Pancard is compulsary.");
						break;
					}
				}
			}
		} else {
			System.out.println("Account is not created. create your account first.");
		}
	}

	public void checkbalance(int accno1) {
		if (accountcount != 0) {
			for (int i = 0; i < 10; i++) {
				if (accounts[i].getaccno() == accno1) {
					System.out.println("Available Balance:" + accounts[i].getamount());
					break;
				}
			}
		} else {
			System.out.println("Account is not Created. Create your account first.");
		}
	}
}
