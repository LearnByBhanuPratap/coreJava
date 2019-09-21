package exception;

public class Example7 {

	public void handelException() {
		try {
			int i = 90 / 0;
		} catch (Exception e) {
			System.out.println("exception handeled");
		}
		System.out.println("code execution completed");
	}

	public void donotHandelException() {
		int i = 90 / 0;
		System.out.println("code execution completed");
	}

	public static void main(String[] args) {
		Example7 obj = new Example7();
		obj.handelException();
		obj.donotHandelException();
	}
}
