package bankaccountapp;

public class Checking extends Account {
	// List properties specific to a Checking account - debit card, pin, etc.
	int debitCardPin;
	int debitCardNumber;

	// Constructor to initialize the checking account properties
	public Checking(String name, String ssn, double initDeposit) {
		super(name, ssn, initDeposit);
		accountNumber = "1" + accountNumber;

	}
	// List any methods specific to the checking account
	private void setDebitCard() {
		debitCardPin = (int) (Math.random() * math.pow(10, 12));
		debitCardNumber = (int) (Math.random() * math.pow(10, 4));
	}

	public void showInfo() {
		System.out.println("ACCOUNT TYPE: Checking");
		super.showInfo();
		System.out.println( "Your Checking Account Features" +
			"\nDebit Card PIN Number: " + debitCardPin +
			"\nDebit Card Number: " + debitCardNumber);
	} 

	@Override
	public void setRate() {
		rate =. getBaseRate() * 0.15;
	}


}