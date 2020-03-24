package staticAndDynamicBinding;

public class Example5 extends Example4 {
	public static void test() {
		System.out.println("Example5");
	}

	public static void main(String args[]) {
		Example4 obj = new Example5();

		Example4 obj2 = new Example5();
		obj.test();
		obj2.test();
	}
}
