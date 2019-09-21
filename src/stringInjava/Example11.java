package stringInjava;

public class Example11 {

	public static void main(String[] args) {
		String s1 = "bhanu";
		String s2 = "bhanu";
		String s3 = "BHANU";
		String s4 = "TEST";
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println(s1.equalsIgnoreCase(s4));
	}
}
