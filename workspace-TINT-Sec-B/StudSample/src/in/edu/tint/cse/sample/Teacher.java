package in.edu.tint.cse.sample;

public class Teacher extends Person {
	int empid;
	String doj;

	public Teacher(String name, String dob, int empid, String doj) {
		super(name, dob);
		this.empid = empid;
		this.doj = doj;
	}

	public Teacher(String name, String addr, String dob, int empid, String doj) {
		super(name, addr, dob);
		this.empid = empid;
		this.doj = doj;
	}

	public int getEmpid() {
		return empid;
	}

	public String getDoj() {
		return doj;
	}

	@Override
	public String toString() {
		return "Teacher [empid=" + empid + ", doj=" + doj + "]";
	}

}
