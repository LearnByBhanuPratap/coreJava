package methodOverriding;

public class Overriding2 extends Overriding1{
	
	public void test(){
		System.out.println("This is test implementation-1");
	}
	
	public static void main(String[] args) {
		Overriding2 Overriding2 = new Overriding2();
		Overriding2.test();
		
		Overriding2.test1();
	}
}
