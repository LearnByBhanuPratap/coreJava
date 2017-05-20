package methodOverLoadingInjava;

public class Example2 {

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
	
	public void test1(double i) {
		System.out.println("test1(int i)");
	}
	
	public void test1(double i, double j) {
		System.out.println("test1(double i, double j)");
	}
	
	public static void main(String[] args) {
		Example2 obj = new Example2();
		obj.test1(9.8, 9.0);
		obj.test1(9, 9);
	}

}
