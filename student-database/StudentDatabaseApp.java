package studentdatabaseapp;

public class StudentDatabaseApp {
	public static void main(String[] args) {
		System.out.print("Enter number of new students to enroll: ");
		Scanner in = new Scanner(System.in);
		int numOfStudents = in.nextInt();
		Student[] students = new Student[numOfStudents];

		// Create n number of new students
		for (int n = 0; n < numOfStudents; n++) {
			// Ask how many new users to add
			students[n] = new Student()
			// Create n number of new students
			students[n].enroll();
			students[n].payTuition();
			System.out.println(students[n].toString());
		}
	}
}
