package in.edu.tint.cse;

public class Course {
	private static int id = 1;
	private int courseId;
	private String name;
	Student[] students = new Student[60];

	public Course(String name) {
		super();
		courseId = id++;
		this.name = name;
	}

	public int getCourseId() {
		return courseId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
