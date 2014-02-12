package com.accountingminds.exception;

public class ServiceException extends AccountingMindsException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4584799122595309209L;
	
	/**
	 * 
	 */
	public ServiceException() {
		super();
 	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public ServiceException(String arg0, Throwable arg1) {
		super(arg0, arg1);
 	}

	/**
	 * @param arg0
	 */
	public ServiceException(String arg0) {
		super(arg0);
 	}

	/**
	 * @param arg0
	 */
	public ServiceException(Throwable arg0) {
		super(arg0);
 	}


}
