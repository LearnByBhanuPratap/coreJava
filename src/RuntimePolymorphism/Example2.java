package RuntimePolymorphism;

public class Example2 extends Example1{

	void run() {
		System.out.println("running safely with 60km");
	}

	public static void main(String args[]) {
		Example1 b = new Example2();// upcasting
		b.run();
	}
}
