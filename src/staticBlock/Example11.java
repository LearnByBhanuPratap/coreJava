package staticBlock;

public class Example11 {
	
	private static String str = "test";

	static class MyNestedClass {
		public void disp() {
			System.out.println(str);
		}
	}
	
	public static void main(String[] args) {
		Example11.MyNestedClass obj = new Example11.MyNestedClass();
		obj.disp();
	}
}
