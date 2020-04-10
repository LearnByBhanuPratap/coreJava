package exception;

public class Example17 {

	public static void main(String[] args) {
		try {
			int num = 9 / 1;
			System.out.println(num);
			//return;
		} 
		catch (ArithmeticException e) {
			System.out.println("Number should not be divided by zero");
		} 
		
		finally {
			System.out.println("This is finally block");
		}
		System.out.println("Hello Java");
		
		System.out.println("Hello Java");
		System.out.println("Hello Java");
	}
}
