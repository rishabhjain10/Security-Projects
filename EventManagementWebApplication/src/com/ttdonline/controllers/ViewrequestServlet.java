/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ttdonline.controllers;

/**
 *
 * @author Techm
 */
import com.ttdonline.beans.Request;
import com.ttdonline.services.RequestService;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ViewrequestServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) 
			throws ServletException,IOException{
			Request requests= new Request();
			RequestService requestservice=new RequestService();
List requestList=null;
                        try {
            requestList = requestservice.getRequests();
        } catch (SQLException ex) {
            Logger.getLogger(ViewrequestServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ViewrequestServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
	request.setAttribute("requestList", requestList);        
        RequestDispatcher rd=request.getRequestDispatcher("viewrequest.jsp");
        rd.forward(request, response);
        }
			
	}
