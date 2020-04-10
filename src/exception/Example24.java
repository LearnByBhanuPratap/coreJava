package exception;

public class Example24 {
	public static void main(String args[]) throws ArithmeticException {
		Example23 obj = new Example23();
		obj.method();

		System.out.println("End Of Program");
		
		
		Example26 obj1 = new Example26();
		try {
			obj1.test1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
