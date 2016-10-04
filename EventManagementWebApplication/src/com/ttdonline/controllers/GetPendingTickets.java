/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ttdonline.controllers;

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
public class GetPendingTickets extends HttpServlet{
      public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
        HttpSession session=request.getSession();
        int did=(int)session.getAttribute("devoteeId");
          RequestService requestService=new RequestService();
        List list=null;
          try {
            list=new ArrayList();
            list=requestService.getPendingRequests(did);
        } catch (SQLException ex) {
            Logger.getLogger(GetPendingTickets.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GetPendingTickets.class.getName()).log(Level.SEVERE, null, ex);
        }
        request.setAttribute("devoteeId", did);
        request.setAttribute("list",list);
          System.out.println(did);
          System.out.println(list);
        RequestDispatcher rd=request.getRequestDispatcher("ticketstatus.jsp");
        rd.forward(request, response);
    }
}
