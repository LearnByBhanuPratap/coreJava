package staticBlock;

public class Example4 {

	static {
		System.out.println("static block");
	}

	static int i = 0;
	static {
		System.out.println("value of i=" + i);
		i = 90;
	}

	static {
		System.out.println("value of i=" + i);
	}

	public static void main(String[] args) {

	}
}
