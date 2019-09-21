package stringInjava;

public class Example14 {

	public static void main(String[] args) {
		String str = new String("java is programming language");
		char[] ch = new char[10];
		try {
			str.getChars(5, 15, ch, 0);
			System.out.println(ch);
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}
}
