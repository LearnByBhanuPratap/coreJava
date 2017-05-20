package methodOverridingInJava;

public class TestExample3 extends Example3{
	
	public void test1(){
		System.out.println("TestExample3 test1()");
	}
	
	private void test2(){
		System.out.println("TestExample3 test2()");
	}
	
	public static void test3(){
		System.out.println("TestExample3 test3()");
	}
	
	public void test4(){
		System.out.println("TestExample3 test4()");
	}
	
	public static void main(String[] args) {
		Example3 obj = new TestExample3();
		obj.test1();
		Example3.test3();
		obj.test4();
	}

}
