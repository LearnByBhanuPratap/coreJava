package typeCasting;

public class B extends A {

	public void test1() {
		System.out.println("test1");
	}

	public static void main(String[] args) {
		A obj = new B();

		obj.test2();

		A obj1 = new B();

		((B) obj1).test1();
	}

}
