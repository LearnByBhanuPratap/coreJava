package staticBlock;

public class Example3 {
	static int j = 80;

	public static void test() {
		int i = 90;
		System.out.println(i);
	}

	public static void test1() {
		static int i = 90;
		System.out.println(i);
	}

	public static void test2() {
		System.out.println(j);
	}
}
