public class ExceptionTest {

	void tes1() {
		int i = 9 / 0;
	}

	void tes2() {
		tes1();
	}

	void tes3() {
		tes2() ;
//		try {
//			tes2();
//			System.out.println("000000");
//		} catch (Exception e) {
//		
//		}
	}

	void tes4() {
		tes3();
		System.out.println("-----");
	}

	void tes5() {
		tes4();
		System.out.println("******");

	}

	public static void main(String[] args) {
		ExceptionTest exceptionTest = new ExceptionTest();
		exceptionTest.tes5();
		//System.out.println("9999999");
	}
}
