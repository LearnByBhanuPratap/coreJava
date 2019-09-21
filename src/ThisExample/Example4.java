package ThisExample;

public class Example4 {
	int a;
	int b;

	Example4() {
		this(10, 20);
		System.out.println("Inside  default constructor \n");
	}

	Example4(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("Inside parameterized constructor");
	}

	public static void main(String[] args) {
		Example4 object = new Example4();
	}
}