package exception;

public class Example12 {

	public static void main(String args[]) {
		try {
			try {
				try {
					int arr[] = { 1, 2, 3, 4 };
					System.out.println(arr[10]);
				} catch (ArithmeticException e) {
					System.out.print("Arithmetic Exception");
					System.out.println(" handled in Third try-block");
				}
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.print("Arithmetic Exception");
				System.out.println(" handled in Second try-block");
			}
		} catch (ArithmeticException e3) {
			System.out.print("Arithmetic Exception");
			System.out.println(" handled in main try-block");
		} catch (ArrayIndexOutOfBoundsException e4) {
			System.out.print("ArrayIndexOutOfBoundsException");
			System.out.println(" handled in main try-block");
		} catch (Exception e5) {
			System.out.print("Exception");
			System.out.println(" handled in main try-block");
		}
	}
}
