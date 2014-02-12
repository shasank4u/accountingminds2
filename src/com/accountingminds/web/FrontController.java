package com.accountingminds.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONException;
import org.json.JSONObject;

import com.accountingminds.entity.Content;
import com.accountingminds.exception.ServiceException;
import com.accountingminds.service.AccountingMindsServiceImpl;



public class FrontController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7069317426767683838L;
	//All the the requests will be processed as post
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("Inside Get method");
		
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("inside servlet");
		String tab = req.getParameter("data");
		System.out.println(tab);
		  
		JSONObject json;
		JSONObject jsonResponse = null;
		try {
			json = new JSONObject(req.getParameter("data"));
			
			
			String tabName = json.getString("tabName");
			
			AccountingMindsServiceImpl acc;
			Content content= null;
			try {
				acc = new AccountingMindsServiceImpl();
				content=acc.setContentForTab(tabName, tabName);//Both will be same ,two parameters are taken for future implementation
				 jsonResponse=	new JSONObject(content);
				
			} catch (ServiceException e) {
				
				e.printStackTrace();
			}
			
			
			resp.setContentType("application/json");
			PrintWriter out = resp.getWriter();
			out.print(jsonResponse);
			
		out.close();
		
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}

}
