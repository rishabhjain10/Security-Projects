/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ttdonline.controllers;

/**
 *
 * @author Techm
 */
import com.ttdonline.services.RequestService;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ApproverequestServlet extends HttpServlet{
	public void doPost(HttpServletRequest request,HttpServletResponse response) 
			throws ServletException,IOException{
		String r=request.getParameter("requestno");
		int requestNo = Integer.parseInt(r);
		RequestService requestservice=new RequestService();
		
//		requestservice.approveRequest(requestNo);

		
	}
}