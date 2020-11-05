package in.edu.tint.cse;

public class Student extends Person {
	int roll;
	Course[] courses = new Course[5];

	public Student(String name, String address, int roll) {
		super(name, address);
		this.roll = roll;
	}

	public Student(String name, String address, String dob, int roll) {
		super(name, address, dob);
		this.roll = roll;
	}

	public int getRoll() {
		return roll;
	}
}
