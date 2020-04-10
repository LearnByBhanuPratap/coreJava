package customException;

public class DAOException extends Exception {
	
	private ErrorCode erroCode;

	public ErrorCode getErroCode() {
		return erroCode;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	DAOException(String msg, Throwable t) {
		super(msg, t);
	}

	DAOException(String msg) {
		super(msg);
	}
	
	DAOException(ErrorCode erroCode,String msg, Throwable t) {
		super(msg, t);
		this.erroCode = erroCode;
	}
}
