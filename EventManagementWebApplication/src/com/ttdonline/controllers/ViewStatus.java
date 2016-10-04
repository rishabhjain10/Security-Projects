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
public class ViewStatus extends HttpServlet{
    public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
        int requestno=Integer.parseInt(request.getParameter("requestno"));
        HttpSession session=request.getSession();
        int did=(int)session.getAttribute("devoteeId");
        RequestService requestService=new RequestService();
        Request r=new Request();
        r.setRequestNo(requestno);
        r.setDevoteeId(did);
        String status=null;
        try {
           status=requestService.getRequestStatus(r);
        } catch (SQLException ex) {
            Logger.getLogger(ViewStatus.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ViewStatus.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(status);
        Request r1=new Request();
        r1.setStatus(status);
        List status1=new ArrayList();
        status1.add(r1);
        request.setAttribute("status1",status1);
        RequestDispatcher rd=request.getRequestDispatcher("status.jsp");
        rd.forward(request, response);
    }
}
