package stringInjava;

public class Example2 {

	public static void main(String[] args) {

		String s1 = "Bhanu";
		String s2 = "Bhanu";
		String s3 = new String("Bhanu");
		String s4 = "Test";
		System.out.println(s1.equals(s2));// true
		System.out.println(s1.equals(s3));// true
		System.out.println(s1.equals(s4));// false

		s1 = "Bhanu";
		s2 = "BHANU";

		System.out.println(s1.equals(s2));// false
		System.out.println(s1.equalsIgnoreCase(s2));// true

		s2 = "Bhanu";
		s3 = new String("Bhanu");
		System.out.println(s1 == s2);// true (because both refer to same instance)
		System.out.println(s1 == s3);// false(because s3 refers to instance created in nonpool)
		
		
		s1 = "Bhanu";
		s2 = "Bhanu";
		s3 = "Bist1";
		System.out.println(s1.compareTo(s2));// 0
		System.out.println(s1.compareTo(s3));// -1(because s1>s3)
		System.out.println(s3.compareTo(s1));// 1(because s3 < s1 )
	}

}
