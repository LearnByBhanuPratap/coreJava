package customException;

import java.io.Serializable;

public class DataException extends Exception implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	DataException(String msg, Throwable t) {
		super(msg, t);
	}

	DataException(String msg) {
		super(msg);
	}

}
