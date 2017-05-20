package testInheritance;

public class C extends B{
	
	public void test3(){
		System.out.println("C test1");
	}
	
	public static void main(String[] args) {
		C obj = new C();
		obj.test1();
		obj.test2();
		obj.test3();
	}

}
