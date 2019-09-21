package exception;

public class Example15 {

	public static void main(String[] args) {
		try {
			int num = 9 / 0;
			System.out.println(num);
		} catch (NumberFormatException e) {
			System.out.println("Number should not be divided by zero");
		}
		finally {
			System.out.println("This is finally block");
		}
		System.out.println("Out of try-catch-finally");
	}
}
