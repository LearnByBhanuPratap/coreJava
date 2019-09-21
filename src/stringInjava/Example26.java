package stringInjava;

public class Example26 {

	public static void main(String[] args) {
		String s1 = "hello java test program";
		System.out.println(s1.startsWith("hel"));
		System.out.println(s1.startsWith("hello java"));
		
		 System.out.println(s1.startsWith("a",7));
		 
		 System.out.println(s1.startsWith("a",40));
	}
}
