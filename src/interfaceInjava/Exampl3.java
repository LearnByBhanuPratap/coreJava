package interfaceInjava;

public interface Exampl3 {
	
	default void test1(){
		System.out.println("I am default");
	}
	
	static void test2(){
		System.out.println("I am static");
	}

}
