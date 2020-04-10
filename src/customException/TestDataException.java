package customException;

public class TestDataException {

	public static void test1(int a) throws DataException {
		if (a < 10) {
			throw new DataException("data is not valid");
		}
	}

	public static void test2() throws DataException {
		try {
			int i = 9 / 0;
		} catch (ArithmeticException e) {
			throw new DataException("data is not valid", e);
		}
	}

	public static void main(String[] args) {
		try {
			TestDataException.test2();
		} catch (DataException e) {
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
		}
	}

}
