
public class Calculator {

	int add(int x1, int x2) {
		System.out.println("------1-------");
		return x1 + x2;
	}

	int add(int x1, String x2, int... numbers) {
		System.out.println("------1-------");
		return x1;
	}

	int add( int... numbers) {
		System.out.println("------2-------");
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		return sum;
	}

	String concat(String... strings) {
		String res = "";
		for (int j = 0; j < strings.length; j++) {
			res += strings[j];
		}
		return res;
	}

}
