/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ttdonline.controllers;

import com.ttdonline.beans.Request;
import com.ttdonline.beans.Seva;
import com.ttdonline.services.RequestService;
import com.ttdonline.services.SevaService;
import com.ttdonline.services.TransactionService;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
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
public class BookTicketServlet extends HttpServlet{
    public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
   
         HttpSession session = request.getSession(false);
         int did=(int)session.getAttribute("devoteeId");
         String devoteeName=(String)session.getAttribute("username");
         
        // String sevaName=request.getParameter("sevaname");
         String sevaDate=(String)request.getAttribute("sevaDate");
         int seatsbooked=(int)request.getAttribute("userSeats");
         
         int totcost=seatsbooked*500;
         
         int sevaId=(int)request.getAttribute("sevaId");
         SevaService sevaService=new SevaService();
         List sevaList=new ArrayList();
        try {
            sevaList=sevaService.getParticularSevaDetails(sevaId);
        } catch (SQLException ex) {
            Logger.getLogger(BookTicketServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BookTicketServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String sevaName="";
                 Iterator i=sevaList.iterator();
                 Seva seva;
                 if(i.hasNext()){
                    seva=(Seva)i.next();
                   sevaName=seva.getSevaName();
//                    int sid=seva.getSevaId();
//                    totalseats=seva.getTotalSeats();
//                    allowedseats=seva.getAllowedSeats();
                    int sevacost=seva.getSevaCost();
//                    String days=seva.getSevaDay();
                 }
       
         
         Request request1=new Request();
         request1.setDevoteeId(did);
         request1.setSevaName(sevaName);
         request1.setSevaId(sevaId);
         request1.setBookingDate(sevaDate);
         request1.setCost(totcost);
         request1.setNoofSeats(seatsbooked);
         
         
        TransactionService transactionService=new TransactionService();
        try {
            RequestService r=new RequestService();
            r.addRequest(request1);
            RequestDispatcher rd=request.getRequestDispatcher("success.jsp");
            rd.forward(request, response);

            
//            RequestDispatcher rdcheck=request.getRequestDispatcher("cas");
//            rdcheck.forward(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(BookTicketServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BookTicketServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
}
