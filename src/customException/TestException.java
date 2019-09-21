package customException;

public class TestException {
	
	public static void test1(int a) throws DAOException{
		if(a<10){
			throw new DAOException("data is not valid");
		}
	}
	
	public static void test2() throws DAOException{
		try {
			int i = 9/0;
		} catch (ArithmeticException e) {
			throw new DAOException("data is not valid", e);
		}
	}
	
	public static void test3() throws DAOException{
		try {
			int i = 9/0;
		} catch (ArithmeticException e) {
			throw new DAOException(ErrorCode.INVALID_DATA,"data is not valid", e);
		}
	}
	
	public static void main(String[] args) throws DAOException{
		TestException.test2();
		TestException.test3();
	}
}
