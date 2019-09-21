package stringInjava;

public class Example31 {

	public static void main(String[] args) {
		float f = 10.05f;
		double d = 10.02;
		String s1 = String.valueOf(f);
		String s2 = String.valueOf(d);
		System.out.println(s1);
		System.out.println(s2);

		char ch1 = 'A';
		char ch2 = 'B';
		s1 = String.valueOf(ch1);
		s2 = String.valueOf(ch2);
		System.out.println(s1);
		System.out.println(s2);

		int value = 30;
		s1 = String.valueOf(value);
		System.out.println(s1);
	}

}
