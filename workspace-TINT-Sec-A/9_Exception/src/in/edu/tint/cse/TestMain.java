package in.edu.tint.cse;

public class TestMain {

	public static void main(String[] args) {

		try {
			Class.forName("A");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
