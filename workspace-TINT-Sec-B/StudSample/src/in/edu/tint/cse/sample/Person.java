package in.edu.tint.cse.sample;

public abstract class Person {
	private String name;
	private String addr;
	private String dob;

	public Person(String name, String dob) {
		super();
		this.name = name;
		this.dob = dob;
	}

	public Person(String name, String addr, String dob) {
		super();
		this.name = name;
		this.addr = addr;
		this.dob = dob;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getDob() {
		return dob;
	}

}
