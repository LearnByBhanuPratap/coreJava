package staticBlock;

public class Example5 {

	static int k = 90;

	void display() {
		System.out.println("value of k is:=" + k);
	}

	public static void main(String[] args) {
		Example5 obj = new Example5();

		obj.display();

		Example5 obj1 = new Example5();
		obj1.display();

		Example5 obj2 = new Example5();
		obj2.display();
	}

}
