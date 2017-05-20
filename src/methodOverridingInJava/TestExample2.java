package methodOverridingInJava;

public class TestExample2 extends Example2{
	
	public void test1(){
		System.out.println("TestExample2 test1()");
	}
	
	private void test2(){
		System.out.println("TestExample2 test2()");
	}
	
	public static void test3(){
		System.out.println("TestExample2 test3()");
	}
	/*
	public final void test4(){
		System.out.println("TestExample2 test4()");
	}
	*/
	public static void main(String[] args) {
		TestExample2 obj = new TestExample2();
		obj.test1();
		obj.test2();
		obj.test4();
		
		TestExample2.test3();
		
		System.out.println("-------");
		Example2 obj1 = new TestExample2();
		obj1.test1();
		obj1.test4();
		Example2.test3();
		
	}

}
