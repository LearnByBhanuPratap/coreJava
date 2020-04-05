package exception;

public class Example1 {

	public void test1() {
		try {
			int i = 90 / 0;
			System.out.println("execution completed");
		} 
		catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void test2() {
		try {
			int i = 90 / 0;
		} catch (Exception e) {
			System.out.println("exception occured");
		}
		System.out.println("execution completed");
	}

	public static void main(String[] args) {
		Example1 obj = new Example1();
		// obj.test1();
		obj.test2();
	}

}
