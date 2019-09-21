package stringInjava;

public class Example13 {

	public static void main(String[] args) {
		String s1 = "ABCDEFG";
		byte[] barr = s1.getBytes();
		for (int i = 0; i < barr.length; i++) {
			System.out.println(barr[i]);
		}
	}
}
