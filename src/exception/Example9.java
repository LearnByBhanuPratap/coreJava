package exception;

public class Example9 {

	public void handelException() {
		try {
			int i = 90 / 1;
			int a[] = { 20 };
			int k = a[2];
		} 
		
		catch (ArithmeticException e) {
			System.out.println("ArithmeticException handeled");
		} 
		
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException handeled");
		}
		
		finally {
			
		}
		System.out.println("code execution completed");
	}

	public static void main(String[] args) {
		Example9 obj = new Example9();
		obj.handelException();
	}
}
