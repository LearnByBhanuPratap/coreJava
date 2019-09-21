package constructor;

public class Example5 {

	void test(){
		System.out.println("default");
	}
	
	Example5(){
		System.out.println("======");
	}
	
	public static void main(String[] args) {
		Example5 obj = new Example5();
		obj.test();
		obj.test();
		obj.test();
		obj.test();
		obj.test();
	}
}
