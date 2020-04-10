package exception;

public class Example18 {

	static void checkEligibiltyProcess(int age, int weight) {
		if (age < 10 && weight < 30) {
			throw new ArithmeticException("Student is not eligible for registration");
		} else {
			System.out.println("Student is eligible for registration");
		}
	}

	public static void main(String args[]) {
		System.out.println("Welcome to the Admission process");
		checkEligibiltyProcess(9, 25);
		System.out.println("Have a good day");
		
		checkEligibiltyProcess(10, 39);
	}
}
