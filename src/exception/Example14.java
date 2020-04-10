package exception;

public class Example14 {

	public static void main(String[] args) {
		try {
			int num = 9 / 0;
			System.out.println(num);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Number should not be divided by zero");
		}
		/*
		 * Finally block will always execute even if there is no exception in
		 * try block
		 */
		finally {
			System.out.println("This is finally block");
		}
		System.out.println("Out of try-catch-finally");
	}
}
