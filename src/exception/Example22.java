package exception;

public class Example22 {

	void test1() throws ArithmeticException {
		throw new ArithmeticException("Calculation error");
	}

	void test2() {
		test1();
	}

	void test3() {
		try {
			test2();
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException handled");
		}
	}

	public static void main(String args[]) {
		Example22 obj = new Example22();
		obj.test3();
		System.out.println("End Of Program");
	}
}
