package staticBlock;

public class Example9 {
	
	static void test1(){
		System.out.println("test1()");
	}
	
	void test2(){
		System.out.println("test1()");
	}
	
	public static void main(String[] args) {
		Example9.test1();
		//test2();
	}
}
