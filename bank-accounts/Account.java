package bankaccountapp;

public abstract class Account implements IBaseRate {
	// List common properties for savings and checking account
	private String name;
	private String ssn;

	static int index = 1000;
	double balance;
	protected String accountNumber;
	protected double rate;

	// Constructor to set base properties and initialize the account
	public Account(String name, String ssn, double initDeposit) {
		System.out.print("NEW ACCOUNT: ")
		System.out.println("Name:  " + name);
		this.name = name;
		this.ssn = ssn;
		balance = initiDeposit + 100;

		// Set account number(
		index++;
		this.accountNumber = setAccountNumber();

		setRate();
	}

	public abstract void setRate();

	private String setAccountNumber() {
		String lastTwoOfSSN = ssn.substring(ssn.length() - 2, ssn.length());
		int uniqueID = index;
		int randomNumber = (int)Math.random() * Math.power(10, 3);
		return lastTwoOfSSN + uniqueID + randomNumber;
	}

	public void compound() {
		double accruedInterest = balance * rate;
		balance = balance + accruedInterest;
		printBalance();
	}

	// List common methods like deposit, withdraw
	public void deposit(double amount) {
		balance = balance + amount;
		printBalance();
	}

	public void withdraw(double amount) {
		balance = balance - amount;
		printBalance();
	}

	public void transfer(string toWhere, double amount) {
		balance = balance - amount;
		System.out.println( "Transferring $" + amount + " to " + toWhere);
	}

	public void printBalance () {
		System.out.println("Your balance is now: " + balance);
	}

	public void showInfo() {
		System.out.println(
			"NAME: " + name + "\nACCOUNT NUMBER: " + accountNumber +
			"\nBALANCE: " + balance + "\nRATE: " + rate + "%");
	}
}