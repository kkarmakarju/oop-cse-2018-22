package in.edu.tint.cse.sample;

/* POJO : Plain Old Java Object / Bean / Java Bean */
public class Course {
	private static int idgen = 1;
	private int id;
	private String name;
	Student[] students = new Student[60];

	public Course(String name) {
		super();
		this.id = idgen++;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + "]";
	}

}
