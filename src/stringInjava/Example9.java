package stringInjava;

public class Example9 {

	public static void main(String[] args) {
		String s1 = "bhanu test";
		System.out.println(s1.endsWith("t"));
		System.out.println(s1.endsWith("test1"));

		String str = "Welcome to youtube channel";
		if (str.endsWith("channel")) {
			System.out.println("Welcome to youtube channel");
		} else
			System.out.println("It does not end with channel");
	}
}
