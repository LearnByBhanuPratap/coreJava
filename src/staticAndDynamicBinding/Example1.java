package staticAndDynamicBinding;

public class Example1 {
	private void eat() {
		System.out.println("dog is eating...");
	}

	public static void main(String args[]) {
		Example1 d1 = new Example1();
		d1.eat();
	}
}
