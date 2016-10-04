/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ttdonline.controllers;

import com.ttdonline.beans.Request;
import com.ttdonline.services.RequestService;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Techm
 */
public class GetApprovedRequest extends HttpServlet{
    public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
        Request req=new Request();
        HttpSession session=request.getSession();
        int did=(int)session.getAttribute("devoteeId");
        req.setDevoteeId(did);
        RequestService requestService=new RequestService();
        List approved=new ArrayList();
        try {
            approved=requestService.getApprovedRequests(did);
        } catch (SQLException ex) {
            Logger.getLogger(GetApprovedRequest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GetApprovedRequest.class.getName()).log(Level.SEVERE, null, ex);
        }
        request.setAttribute("approved", approved);
        RequestDispatcher rd=request.getRequestDispatcher("approved.jsp");
        rd.forward(request, response);
    }
}
