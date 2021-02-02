import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
		Student[] list = new Student[10];
		
		for (int i = 0; i < 10; i++) {
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("Roll:");
			int roll = scanner.nextInt();
			System.out.println("Name:");
			String name = scanner.nextLine();

			list[i] = new Student(roll, name);
		}

		System.out.println(list[0].name);

	}
}
