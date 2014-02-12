package com.accountingminds.service;

import com.accountingminds.dao.ContentDao;
import com.accountingminds.dao.DaoFactory;
import com.accountingminds.entity.Content;
import com.accountingminds.exception.DaoException;
import com.accountingminds.exception.ServiceException;

/**
 * @author shasank4u
 * 
 * Date 10/02/2012
 *
 */
public class AccountingMindsServiceImpl implements AccountingMindsService {
	
	private ContentDao contentDao;
	
	/**
	 * @throws ServiceException
	 */
	public AccountingMindsServiceImpl() throws ServiceException{
		try {
			contentDao = DaoFactory.getContentDao();
		} catch (DaoException e) {
			e.printStackTrace();
			throw new ServiceException(e.getMessage(),e);
			
		}
	}

	/* (non-Javadoc)
	 * @see com.accountingminds.service.AccountingMindsService#setContentForTab(java.lang.String, java.lang.String)
	 */
	public Content setContentForTab(String headerTabName, String contentTabName)
			throws ServiceException {
		
		try {
			return contentDao.setContentForTab(headerTabName, contentTabName);
		} catch (DaoException e) {
			throw new ServiceException(e.getMessage(),e);
		}
	}

}
