package com.accountingmids.dao.bundle;

import java.util.ResourceBundle;

import com.accountingminds.dao.ContentDao;
import com.accountingminds.entity.Content;
import com.accountingminds.exception.DaoException;

/**
 * @author shasank4u
 *
 *Date 10/02/2012
 */

public class ContentDaoBundleImpl implements ContentDao {

	/* (non-Javadoc)
	 * @see com.accountingminds.dao.ContentDao#setContentForTab(java.lang.String, java.lang.String)
	 * 
	 * gets the data from property file and sets in the content Object
	 * 
	 */
	public Content setContentForTab(String headerTabName, String contentTabName)
			throws DaoException {
		ResourceBundle res = ResourceBundle
				.getBundle
				("com.accountingminds.props.content");
		
			Content content  = new Content();
			String headerName = "content.tab.Header."+headerTabName;
			String contentName= "content.tab.Text."+contentTabName;
			content.setContentHeadear(res.getString(headerName));
			content.setContentTabName(headerName);
			content.setContentSubtabId(0);
			content.setContentSubTabName("X");
			content.setContentText(res.getString(contentName));
		
				return content;
		

	}

}
