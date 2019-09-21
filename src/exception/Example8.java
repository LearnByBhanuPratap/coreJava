package exception;

public class Example8 {

	public void handelException() {
		try {
			int i = 90 / 1;
			int a[] = { 20 };
			int k = a[2];
		} catch (ArithmeticException e) {
			System.out.println("exception handeled");
		}
		System.out.println("code execution completed");
	}
	
	public static void main(String[] args) {
		Example8 obj = new Example8();
		obj.handelException();
	}
}
