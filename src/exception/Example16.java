package exception;

public class Example16 {
	
	public static void main(String[] args) {
		try {
			int num = 9 / 0;
			System.out.println(num);
		} catch (ArithmeticException e) {
			System.out.println("Number should not be divided by zero");
		} finally {
			int num = 9 / 0;
			System.out.println(num);
			System.out.println("This is finally block");
		}
	}
}
