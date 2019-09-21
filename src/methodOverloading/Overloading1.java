package methodOverloading;

public class Overloading1 {

	private static void display(int a) {
		System.out.println("Arguments: " + a);
	}

	private static void display(int a, int b) {
		System.out.println("Arguments: " + a + " and " + b);
	}

	public static void main(String[] args) {
		display(1);
		display(1, 4);
	}
}
