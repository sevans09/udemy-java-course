package emailapp;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String alternateEmail;
	private String email;
	private String companySuffix = "koisRus.com";
	private int mailboxCapacity;
	private int defaultPasswordLength = 10;

	// Constructor: takes first and last name, dept
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;

	 	// Call method to ask for department that returns it as well	
		this.department = setDepartment();
		this.password = randomPassword(defaultPasswordLength);

		// Combine to generate email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
		System.out.println("Your email is: " + email);
	}

	// Ask for department
	private String setDepartment() {
		System.out.print("Enter the department\n1 for Sales\n2 for Development\n3 for Account\n0 for none");
		Scanner in = new Scanner(System.in);
		int dept = in.nextInt();
		if (dept == 1) { return "sales"; }
		else if (dept == 2) { return "development"; }
		else if (dept == 3) { return "accounting"; }
		else { return ""; }
	}

	// Generate random password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String (password);
	}
	
	// Set mailbox capacity
	private void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}

	// Set alternate email
	private void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}

	// Change password
	public void changePassword(String password) {
		this.password = password;
	}

	// Public getter methods for properties
	public int getMailboxCapacity() { return mailboxCapacity; }
	public String getAlternateEmail() { return alternateEmail; }
	public String getPassword() { return password; }

	public String showInfo() {
		return "DISPLAY NAME: " + firstName + " " + lastName + 
			"\nCOMPANY EMAIL: " + email + 
			"\nMAILBOX CAPACITY: " + mailboxCapacity + " mb";
 	}
}
