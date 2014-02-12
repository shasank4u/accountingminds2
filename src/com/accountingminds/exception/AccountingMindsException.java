package com.accountingminds.exception;

public class AccountingMindsException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3336695748546937732L;
	
	
	/**
	 * 
	 */
	public AccountingMindsException() {
		super();
 	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public AccountingMindsException(String arg0, Throwable arg1) {
		super(arg0, arg1);
 	}

	/**
	 * @param arg0
	 */
	public AccountingMindsException(String arg0) {
		super(arg0);
 	}

	/**
	 * @param arg0
	 */
	public AccountingMindsException(Throwable arg0) {
		super(arg0);
 	}


}
