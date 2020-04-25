package staticBlock;

public class Example7 {
	
	static int i = 10;
	int b = 20;

	static void test1() {
		i = 20;
		System.out.println("from m1");
		//b = 10;
		//test2();
	}

	void test2() {
		i = 20;
		b = 10;
		test1();
		System.out.println("from m2");
	}

	public static void main(String[] args) {
	}
}
