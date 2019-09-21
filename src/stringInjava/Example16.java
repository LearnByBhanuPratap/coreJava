package stringInjava;

public class Example16 {

	public static void main(String[] args) {
		String s1 = "hello java program";
		int index1 = s1.indexOf("ja");
		int index2 = s1.indexOf("java");
		System.out.println(index1);
		System.out.println(index2);

		int index3 = s1.indexOf("ro", 4);
		System.out.println(index3);

		int index4 = s1.indexOf('a');
		System.out.println(index4);
	}
}
