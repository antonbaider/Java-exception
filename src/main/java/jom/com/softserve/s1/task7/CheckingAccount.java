package jom.com.softserve.s1.task7;

public class CheckingAccount {
	private double balance;
	private int number;

	public CheckingAccount(int number) {
		this.number = number;
	}

	public void deposit(double amount) {
		balance += amount;
	}

//	public void withdraw(double amount) throws InsufficientAmountException {
//		if (amount <= balance) {
//			balance -= amount;
//		} else {
//			double needs = amount - balance;
//			 new InsufficientAmountException(needs);
//		}
//	}
}