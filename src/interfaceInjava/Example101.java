package interfaceInjava;

public interface Example101 extends Example102{

	void test1();
	
	default void test2(){
		System.out.println("default method");
	}
}
