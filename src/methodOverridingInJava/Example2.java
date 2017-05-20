package methodOverridingInJava;

public class Example2 {
	
	public void test1(){
		System.out.println("Example1 test1()");
	}
	
	private void test2(){
		System.out.println("Example1 test2()");
	}
	
	public static void test3(){
		System.out.println("Example1 test3()");
	}
	
	public final void test4(){
		System.out.println("Example1 test4()");
	}

}
