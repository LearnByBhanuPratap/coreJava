package stringBuffer;

public class Example3 {

	public static String concatString() {
		String t = "Hello";
		for (int i = 0; i < 10000; i++) {
			t = t + "Java";
		}
		return t;
	}

	public static String concatStringBuffer() {
		StringBuffer sb = new StringBuffer("Hello");
		for (int i = 0; i < 10000; i++) {
			sb.append("Java");
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		Example3.concatString();
		long endTime = System.currentTimeMillis();
		System.out.println("Time Take my string=" + (endTime - startTime));

		long startTime1 = System.currentTimeMillis();
		Example3.concatStringBuffer();
		long endTime1 = System.currentTimeMillis();

		System.out.println("Time Take my string=" + (endTime1 - startTime1));
	}

}
