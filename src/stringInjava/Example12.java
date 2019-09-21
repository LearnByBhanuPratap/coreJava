package stringInjava;

public class Example12 {

	public static void main(String[] args) {
		String name = "bhanu";
		String sf1 = String.format("name is %s", name);
		String sf2 = String.format("value is %f", 32.33434);
		String sf3 = String.format("value is %.12f", 32.33434);
		System.out.println(sf1);
		System.out.println(sf2);
		System.out.println(sf3);

		String str1 = String.format("%d", 104); // Integer value
		String str2 = String.format("%s", "Bhanu Pratap"); // String value
		String str3 = String.format("%f", 104.00); // Float value
		String str4 = String.format("%x", 104); // Hexadecimal value
		String str5 = String.format("%c", 'a'); // Char value
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);

		str1 = String.format("%d", 101);
		str2 = String.format("|%10d|", 101); 
		str3 = String.format("|%-10d|", 101); 
		str4 = String.format("|% d|", 101);
		str5 = String.format("|%010d|", 101);
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
	}
}
