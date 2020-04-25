package methodOverloading;

public class Overloading7 {

	void sum(int a, long b) {
		System.out.println("a method invoked");
	}

	void sum(long a, int b) {
		System.out.println("b method invoked");
	}

	public static void main(String args[]) {
		Overloading7 obj = new Overloading7();
		//obj.sum(20, 20);
	}
}
