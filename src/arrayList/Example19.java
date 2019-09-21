package arrayList;

public class Example19 {

	public static void main(String args[]) {
		String Str = new String("Welcome to learnjava.com");

		System.out.print("Return Value :");
		System.out.println(Str.replaceAll("(.*)learnjava(.*)", "youtube"));
	}
}
