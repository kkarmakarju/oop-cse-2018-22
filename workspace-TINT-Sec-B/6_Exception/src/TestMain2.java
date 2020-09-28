
public class TestMain2 {
	public static void main(String[] args) {
		System.out.println(LinkageError.class);
		System.out.println(VirtualMachineError.class);
		
		VirtualMachineError error = new VirtualMachineError() {
		};
		System.out.println(error.toString());
		System.out.println(StackOverflowError.class);
		System.out.println(OutOfMemoryError.class);
		
		System.out.println(ArithmeticException.class);
		System.out.println(NullPointerException.class);
		
		try {
			System.out.println("Before.....");
			Class.forName("B");
			System.out.println("After.....");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
