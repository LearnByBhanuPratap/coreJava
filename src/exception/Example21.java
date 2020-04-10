package exception;

import java.io.IOException;

public class Example21 {

	void test() throws Exception {
		throw new IOException("device error");// checked exception
	}

	void tset2() throws Exception {
		test();
	}

	void tset1() {
		try {
			tset2();
		} catch (Exception e) {
			System.out.println("exception handled");
		}
	}

	public static void main(String args[]) {
		Example21 obj = new Example21();
		obj.tset1();
		System.out.println("normal flow...");
	}
}
