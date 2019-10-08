package staticBlock;

public  class Example11 {
	
	private static String str = "test";

	public static void test1(){
		
	}
	static class MyNestedClass {
		public void disp() {
			System.out.println(str);
		}
	}
	
	public static void main(String[] args) {
		Example11.test1();
		
		Example11.MyNestedClass obj = new Example11.MyNestedClass();
		obj.disp();
	}
}
