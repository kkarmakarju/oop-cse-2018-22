package in.edu.tint.cse;

/* POJO class : Plain Old Java Object / Java Bean class*/
public abstract class Person {
	private String name;
	private String address;
	private String dob;
	
	public Person(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}

	public Person(String name, String address, String dob) {
		super();
		this.name = name;
		this.address = address;
		this.dob = dob;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}
}
