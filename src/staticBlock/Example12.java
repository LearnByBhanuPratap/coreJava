package staticBlock;

public class Example12 {
	
	private static String str = "test";

	class MyNestedClass {
		public void disp() {
			System.out.println(str);
		}
	}
	
	public static void main(String[] args) {
		Example12.MyNestedClass obj = new Example12().new MyNestedClass();
		obj.disp();
	}
}
