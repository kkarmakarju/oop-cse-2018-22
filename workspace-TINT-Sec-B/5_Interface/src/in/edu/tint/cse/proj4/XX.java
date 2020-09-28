package in.edu.tint.cse.proj4;

public class XX {

	public static void main(String[] ar) {
		
		String str0 = "Hello";
		String str2 = "Hello";
		
		String str = str0;
		
		str0 = "Hello World";
		
		System.out.println(str);
		
		
		
		String str1 = new String("Hello");
		String str3 = new String("Hello");

		if (str1.equalsIgnoreCase(str3)) {
			System.out.println("same");
		} else {
			System.out.println("not same");
		}
		
		String str5 = str1;
		
		if(str5 == str3)
			System.out.println("1");
		else
			System.out.println("2");
		
	}

}
