package com.accountingminds.dao;

import java.util.ResourceBundle;

import com.accountingminds.exception.DaoException;

/**
 * @author shasank
 * Date 10/02/2012
 *
 */
public class DaoFactory {
	
	private static String contentDao;
	static {
		try {
			ResourceBundle res = ResourceBundle
					.getBundle
					("com.accountingminds.props.DBConfig");
			contentDao = res.getString("contentDao");
			
		} catch (Exception e) {
			 e.printStackTrace();
		}

	}
	
	/**
	 * @return DaoImplclass
	 * @throws DaoException
	 * 
	 * 
	 */
	public static ContentDao getContentDao() throws DaoException{
		try {
			return  (ContentDao)Class.forName(contentDao).newInstance() ;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			throw new DaoException(e.getMessage(),e);
	} catch (InstantiationException e) {
		throw new DaoException(e.getMessage(),e);
			
		} catch (IllegalAccessException e) {
			throw new DaoException(e.getMessage(),e);
		}

}
}
