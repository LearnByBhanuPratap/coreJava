package exception;

public class Example19 {

	static void checkEligibiltyProcess(int age) {
		if (age < 18) {
			throw new ArithmeticException("Not Eligible for voting");
		} else {
			System.out.println("Eligible for voting");
		}
	}

	public static void main(String[] args) {
		Example19.checkEligibiltyProcess(20);
	}

}
