package staticBlock;

public class Example3 {
	static int j = 80;

	public static void test() {
		System.out.println(j);
		int i = 90;
		System.out.println(i);
	}

	public static void test1() {
		System.out.println(j);
		//static int i = 90;
		System.out.println(j);
	}

	public static void test2() {
		System.out.println(j);
	}
	
	public static void main(String[] args) {
		Example3.test();
		Example3.test1();
		Example3.test2();
	}
}
