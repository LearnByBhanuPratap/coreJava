package ThisExample;

public class Example8 {
	int a;
	int b;

	Example8() {
		a = 10;
		b = 20;
	}

	Example8 get() {
		return this;
	}

	void display() {
		System.out.println("a = " + a + "  b = " + b);
	}

	public static void main(String[] args) {
		Example8 object = new Example8();
		
		Example8 data = object.get();
		
		data.display();
	}
}
