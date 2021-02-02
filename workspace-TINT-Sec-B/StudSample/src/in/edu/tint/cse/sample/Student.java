package in.edu.tint.cse.sample;

public class Student extends Person {
	int roll;
	Course[] courses = new Course[5];

	public Student(String name, String dob, int roll) {
		super(name, dob);
		this.roll = roll;
	}

	public Student(String name, String addr, String dob, int roll) {
		super(name, addr, dob);
		this.roll = roll;
	}

	public int getRoll() {
		return roll;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + "]";
	}

}
