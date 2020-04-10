package exception;

public class Example20 {

	static void check() throws ArithmeticException {
		System.out.println("Inside check function");
		throw new ArithmeticException("demo");
	}

	public static void main(String args[]) {
		try {
			check();
		} catch (ArithmeticException e) {
			System.out.println("caught======" + e);
		}
		
		Example21 obj = new Example21();
		try {
			obj.tset2();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
