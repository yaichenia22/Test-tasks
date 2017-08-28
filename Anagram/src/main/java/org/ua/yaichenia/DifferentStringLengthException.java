package org.ua.yaichenia;

public class DifferentStringLengthException extends Exception {

	private static final long serialVersionUID = 3880873708237451701L;

	public DifferentStringLengthException() {
		super();
	}
	
	public DifferentStringLengthException(String message) {
		super(message);
	}
	
	public DifferentStringLengthException(String message, Throwable cause) {
		super(message, cause);
	}
}
