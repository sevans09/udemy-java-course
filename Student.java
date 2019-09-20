package studentdatabaseapp;

public class Student {
	private String firstName;
	private String lastName
	private String gradeYear;
	private int studentID;
	private String courses = NULL;
	private int  tuitionBalance = 0;
	private static int costOfCourse = 600;
	private static int id = 1001;

	// Generate ID
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter student's first name: ");
		this.firstName = in.nextLine(); 
		System.out.print("Enter student's last name: ");
		this.lastName = in.nextLine(); 
		System.out.print("Enter student's grade level:\n1 for freshman\n 2 for sophomore\n 3 for a junior\n  4 for a senior: ");
		this.gradeYear = in.nextLine(); 
		
		setStudentID();

		System.out.print(firstName + " " + lastName + " " + gradeYear + " " + studentID);
		
		
	}

	private void setID() {
		id++;
		this.studentID = gradeYear + "" + id;
	}

	// Enroll in courses
	public void enroll() {
		do {
			System.out.println("Enter course to enroll (0 to quit): ");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine;
			if (!course.equals("Q")) {
				courses = courses + "\n" + course;
				tuitionBalance = tuitionBalance + costOfCourse;
			}
			else { break }
		} while (1 != 0)
		System.out.println("ENROLLED IN: " + courses);
		System.out.println("TUITION BALANCE: " + tuitionBalance);
	}
	// View balance
	public void viewBalance() {
		System.out.println("Your balance is: $" + tuitionBalance);
	}

	// Pay tuition
	public void payTuition() {
		viewBalance();
		System.out.println("Enter your payment: ");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thank you for your payment of $" + payment)
		viewBalance();
	}
	
	// Show status
	public String toString() {
		return "Name: " + firstName + " " + lastName + "\nCourses Enrolled: " + courses + "\nBalance: $" + tuitionBalance;
	}
}