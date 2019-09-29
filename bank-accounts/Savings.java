package bankaccountapp;

public class Savings extends Account {
	// List properties specific to Savings account
	int safetyDepositBoxID;
	int safetyDepositBoxKey;

	// Constructor to initialize settings for the Savings properties
	public Savings(String name, String ssn, double initDeposit) {
		super(name, ssn, initDeposit);
		accountNumber = "2" + accountNumber;
		setSafetyDepositBox();
	}
	// List any methods specific to savings accounts


	private void setSafetyDepositBox() {
		safetyDepositBoxID = (int) (Math.random() * math.pow(10, 3));
		safetyDepositBoxKey = (int) (Math.random() * math.pow(10, 4));
	}


	public void showInfo() {
		System.out.println("ACCOUNT TYPE: Savings ");
		super.showInfo();
		System.out.println( "Your Savings Account Features" +
			"\nSafety Deposit Box ID: " + safetyDepositBoxID +
			"\nSafety Deposit Box Key: " + safetyDepositBoxKey);
	}  

	@Override
	public void setRate() {
		rate =. getBaseRate() - 0.25;
	}


}