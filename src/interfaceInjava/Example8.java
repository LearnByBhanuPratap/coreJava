package interfaceInjava;

public interface Example8 {

	void method6();

	default void test1() {
		System.out.println("I am test1");
	}

	static void test2() {
		System.out.println("I am test2");
	}
}
