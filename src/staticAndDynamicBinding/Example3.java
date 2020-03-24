package staticAndDynamicBinding;

public class Example3 extends Example2 {
	
	void eat() {
		System.out.println("dog is eating...");
	}

	public static void main(String args[]) {
		Example2 a = new Example3();
		a.eat();
	}
}