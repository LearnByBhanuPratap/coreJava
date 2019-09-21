package ThisExample;

public class Example7 {

	int i = 90;

	Example7() {
		Example6 obj = new Example6(this);
	}

	void display() {
		System.out.println("Value of i in Class Example7 : " + i);
	}

	public static void main(String[] args) {
		Example7 obj = new Example7();

	}
}
