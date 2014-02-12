package com.accountingminds.exception;

public class DaoException extends AccountingMindsException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2215072769661291283L;
	
	/**
	 * 
	 */
	public DaoException() {
		super();
 	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public DaoException(String arg0, Throwable arg1) {
		super(arg0, arg1);
 	}

	/**
	 * @param arg0
	 */
	public DaoException(String arg0) {
		super(arg0);
 	}

	/**
	 * @param arg0
	 */
	public DaoException(Throwable arg0) {
		super(arg0);
 	}


}
