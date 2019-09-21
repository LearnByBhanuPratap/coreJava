package methodOverridingInJava;

public class TestExample1 extends Example1{
	
	public void test1(){
		System.out.println("TestExample1 test1()");
	}
	
	public static void main(String[] args) {
		TestExample1 obj = new TestExample1();
		obj.test1();
		obj.test2();
	}

}
