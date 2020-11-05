package in.edu.tint.cse;

public class Teacher extends Person {
	int empId;
	String dateOfJoining;

	public Teacher(String name, String address, int empId, String dateOfJoining) {
		super(name, address);
		this.empId = empId;
		this.dateOfJoining = dateOfJoining;
	}

	public Teacher(String name, String address, String dob, int empId, String dateOfJoining) {
		super(name, address, dob);
		this.empId = empId;
		this.dateOfJoining = dateOfJoining;
	}

	public int getEmpId() {
		return empId;
	}

	public String getDateOfJoining() {
		return dateOfJoining;
	}
}
