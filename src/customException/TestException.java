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
	
	public static void main(String[] args) {
		try {
			TestException.test2();
		} catch (DAOException e) {
			//e.printStackTrace();
		}
		try {
			TestException.test3();
		} catch (DAOException e) {
			System.out.println(e.getErroCode());
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			if(e.getErroCode().name().equalsIgnoreCase("INVALID_DATA")) {
				System.out.println("------");
			}
		}
	}
}
