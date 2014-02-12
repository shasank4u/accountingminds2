package com.accountingminds.dao;


import com.accountingminds.entity.Content;
import com.accountingminds.exception.DaoException;

/**
 * @author shasank
 * Dao class for all the Content setting impls
 * 
 * Date 10/02/2012
 *
 */
public interface ContentDao {

	public Content  setContentForTab(String headerTabName, String contentTabName) throws DaoException;
	
}
