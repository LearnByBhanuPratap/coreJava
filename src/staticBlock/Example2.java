package staticBlock;

public class Example2 {

	static int i = 10;
	static int j;

	static {
		System.out.println("Static block initialized.");
		j = i * 2;
	}

	public static void main(String[] args) {
		System.out.println("Value of i : " + i);
		System.out.println("Value of j : " + j);
	}
}
