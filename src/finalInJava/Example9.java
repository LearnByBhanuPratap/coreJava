package finalInJava;

public class Example9 {

	int cube(final int n) {
		n = n + 2;
		return n * n * n;
	}

	public static void main(String args[]) {
		Example9 b = new Example9();
		b.cube(5);
	}
}
