package exception;

public class Example10 {

	public void handelException() {
		try {
			int i = 90 / 1;
			int a[] = { 20 };
			int k = a[3];

			String s1 = null;
			System.out.println(s1.length());
			
		} catch (ArithmeticException e) {
			System.out.println("Exception=" + e.getClass().getName());
			System.out.println("Exception=" + e.getCause());
			System.out.println("ArithmeticException handeled");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception=" + e.getClass().getName());
			System.out.println("Exception=" + e.getCause());
			e.printStackTrace();
			System.out.println("Exception=" + e.getMessage());
			System.out.println("ArrayIndexOutOfBoundsException handeled");
		} catch (Exception e) {
			System.out.println("Exception=" + e.getClass().getName());
			System.out.println("Exception=" + e.getCause());
			e.printStackTrace();
			System.out.println("Exception=" + e.getMessage());
		}
		System.out.println("code execution completed");
	}

	public static void main(String[] args) {
		Example10 obj = new Example10();
		obj.handelException();
	}
}
