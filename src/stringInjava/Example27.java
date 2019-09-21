package stringInjava;

public class Example27 {

	public static void main(String[] args) {
		String s1 = "hellojavatest";
		String substr = s1.substring(0); 
		System.out.println(substr);
		String substr2 = s1.substring(5, 10); 
		System.out.println(substr2);
		
		// java.lang.StringIndexOutOfBoundsException:
		String substr3 = s1.substring(5, 15);
	}
}
