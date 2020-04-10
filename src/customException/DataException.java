package customException;

import java.io.Serializable;

public class DataException extends Exception {


	DataException(String msg, Throwable t) {
		super(msg, t);
	}

	DataException(String msg) {
		super(msg);
	}

}
