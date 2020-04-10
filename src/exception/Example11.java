package exception;

public class Example11 {

	public void test1() {
		int i = 90 / 1;
	}

	public void test2() {
		int a[] = { 20 };
		int k = a[1];
	}

	public void test3() {
		try {
			test1();
			System.out.println("No exception is test1() method");
			try {
				test2();
				System.out.println("No exception is test2() method");
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("ArrayIndexOutOfBoundsException handeled");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArithmeticException handeled");
		}
	}

	public static void main(String[] args) {
		Example11 obj = new Example11();
		obj.test3();
	}

}
