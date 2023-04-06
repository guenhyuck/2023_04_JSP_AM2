package com.KoreaIT.java.jam.exception;

public class SQLErrorException extends RuntimeException {
	private Exception origin;
	private static final long serialVersionUID = -5065445692231294049L;
	public SQLErrorException(String message, Exception origin) {
		super(message);
		this.origin = origin;
	}

	public Exception getOrigin() {
		return origin;
	}
}
