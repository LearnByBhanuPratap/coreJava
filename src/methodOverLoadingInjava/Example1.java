package methodOverLoadingInjava;

public class Example1 {

	public void test1() {
      System.out.println("test1()");
	}

	public void test1(int i) {
     System.out.println("test1(int i)");
	}

	public void test1(int i, int j) {
		System.out.println("test1(int i, int j)");
	}

	public void test1(int i, int j, int k) {
		System.out.println("test1(int i, int j, int k)");
	}
	
	public static void main(String[] args) {
		Example1 obj = new Example1();
		obj.test1();
		obj.test1(7);
		obj.test1(7,8);
		
		obj.test1(7,8,10);
	}

}
