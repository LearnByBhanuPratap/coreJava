package stringInjava;

public class Example3 {

	public static void main(String[] args) {
		String s = 90 + 30 + "Bhanu" + 50 + 50;
		System.out.println(s);

		String s1 = "Bhanu ";
		String s2 = "Pratap";
		String s3 = s1.concat(s2);
		System.out.println(s3);
	}

}
