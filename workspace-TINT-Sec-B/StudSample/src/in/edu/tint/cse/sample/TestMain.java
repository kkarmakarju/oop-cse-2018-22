package in.edu.tint.cse.sample;

public class TestMain {

	public static void main(String[] args) {
		Course[] courses = new Course[10];
		courses[0] = new Course("Opertaing System");
		courses[1] = new Course("OOP");

		System.out.println(courses[0]);
		System.out.println(courses[1]);

	}

}
