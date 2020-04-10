
public class StringTest {

	public static void main(String[] args) {
		String s1 = new String("Test");
		String s2 = new String("Test");
		String s3 = "Test";
		String s4 = "Test";

		System.out.println(s1 == s2);

		System.out.println(s3 == s4);

		System.out.println(s1 == s4);

		System.out.println(s1.equals(s2));

		System.out.println(s3.equals(s4));

		System.out.println(s1.equals(s4));
	}

}
