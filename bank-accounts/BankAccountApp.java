package bankaccountapp;

public abstract class BankAccountApp implements IRate {

	public static void main(String[] args) {
		List<Account> accounts = new LinkedList<Accounts>();
		// Read CSV file and create accounts based on data
		List<String[]> newAccountHolders = utilities.CSV.read("NewBankAccounts.csv");
		for (String[] accountHolder : newAccountHolders) {
			System.out.println("NEW ACCOUNT");
			String name = accountHolder[0];
			String ssn = accountHolder[1];
			String accountType = accountHolder[2];
			double initDeposit = accountHolder[3];
			System.out.println(name + " " + ssn + " " + accountType + " $" + initiDeposit})
		
			if (accountType.equals("Savings")) {
				System.out.println("OPEN A SAVINGS ACCOUNT");
				accounts.add(new Savings(name, ssn, initDeposit));
			}
			else if (accountType.equals("Checking")) {
				System.out.println("OPEN A CHECKING ACCOUNT");
				accounts.add(new Checking(name, ssn, initDeposit));
			}
			else {
				System.out.println("ERROR READING ACCOUNT TYPE");
			}
		}

		for (Account acc : accounts) {
			acc.showInfo();
		}
	}
	
}