package staticBlock;

public  class Example13 {
	
	private static String str = "test";

	public static class MyNestedClass {
		public void disp() {
			System.out.println(str);
		}
	}
}
