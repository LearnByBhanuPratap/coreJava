package stringInjava;

public class Example25 {

	public static void main(String args[]) {
		String s1 = "hello java test";
		String[] words = s1.split("\\s");
		for (String w : words) {
			System.out.println(w);
		}
		
		s1 = "hello:java:test";
		words = s1.split(":");
		for (String w : words) {
			System.out.println(w);
		}
	}
}
