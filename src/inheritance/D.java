package inheritance;

public class D extends C {

	void test1() {

	}

	public static void main(String[] args) {
		D obj = new D();

		obj.test1();

		int c = obj.b;

		//System.out.println(obj.a);

		System.out.println(obj.b);
	}
}
