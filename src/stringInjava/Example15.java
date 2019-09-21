package stringInjava;

public class Example15 {

	public static void main(String[] args) {
		String str = new String("java is programming language");
		char[] ch = new char[10];
		try {
			str.getChars(5, 20, ch, 0);
			System.out.println(ch);
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}
}
