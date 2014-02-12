package com.accountingminds.service;


import com.accountingminds.entity.Content;
import com.accountingminds.exception.ServiceException;

/**
 * @author shasank4u
 *	Date 10/02/2012
 */
public interface AccountingMindsService {

	public Content setContentForTab(String headerTabName,String contentTabName) throws ServiceException;
}
