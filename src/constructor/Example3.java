package constructor;

public class Example3 {
	int i;

	public Example3(int i) {
		this.i = i;
		System.out.println("Parameterized");
	}

	Example3() {
     System.out.println("default");
	}

	public static void main(String[] args) {
		Example3 obj = new Example3();
		Example3 obj1 = new Example3(5);
	}
}
