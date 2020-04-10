package exception;

public class Example13 {
	
	public static void main(String args[]) {
		// Parent try block
		try {
			// Child try block1
			try {
				System.out.println("Inside block1");
				int b = 40 / 0;
				System.out.println(b);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Exception in Child try block1");
			}
			// Child try block2
			try {
				System.out.println("Inside block2");
				int b = 40 / 0;
				System.out.println(b);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Exception in Child try block2");
			}
			System.out.println("Just other statement");
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception");
			System.out.println("Inside parent try catch block");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException");
			System.out.println("Inside parent try catch block");
		} catch (Exception e5) {
			System.out.println("Exception");
			System.out.println("Inside parent try catch block");
		}
		System.out.println("Hello java");
	}
}
