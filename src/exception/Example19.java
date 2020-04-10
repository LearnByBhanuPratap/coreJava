package exception;

import java.io.IOException;

public class Example19 {

	static void checkEligibiltyProcess(int age) {
		if (age < 18) {
			throw new ArithmeticException("Not Eligible for voting");
		} else {
			System.out.println("Eligible for voting");
		}
	}

	static void checkData(int data) throws IOException, Exception {

		if (data < 100) {
			throw new IOException("issue with data");
		}

		if (data < 100) {
			throw new Exception("issue with data");
		}

	}

	public static void main(String[] args) {
		Example19.checkEligibiltyProcess(15);
	}

}
