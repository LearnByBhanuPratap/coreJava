package arrayList;

public class Example20 {

	public static void main(String args[]) {
		String str = "String replaceAll() method example!!";
		String strRegExTest = "Java 12 23 String 4 Replace Example";
		String strObj = null;

		// Replace all occurrences of "t" to "T"
		strObj = str.replaceAll("t", "T");
		System.out.println(strObj);

		// Remove all occurrences of "!"
		strObj = str.replaceAll("!", "");
		System.out.println(strObj);

		// Replace "example" to "Example"
		strObj = str.replaceAll("example", "Example");
		System.out.println(strObj);

		// Remove all the numbers
		strObj = strRegExTest.replaceAll("[0-9]+", "");
		System.out.println(strObj);

		// Replace all the words to "Word"
		strObj = strRegExTest.replaceAll("[a-zA-Z]+", "Word");
		System.out.println(strObj);

	}
}
