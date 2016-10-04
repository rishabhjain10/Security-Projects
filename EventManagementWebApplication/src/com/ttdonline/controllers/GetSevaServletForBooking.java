package com.ttdonline.controllers;

import com.ttdonline.services.SevaService;
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

/**
 *
 * @author Techm
 */
public class GetSevaServletForBooking extends HttpServlet{
    @Override
    public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
        SevaService sevaService=new SevaService();
        try {
            List ListOfSevas=new ArrayList();
            ListOfSevas=sevaService.getAllSevas();
            request.setAttribute("ListOfSevas",ListOfSevas);
            RequestDispatcher rd=request.getRequestDispatcher("bookticket.jsp");
            rd.forward(request, response);

               
            
        } catch (SQLException ex) {
            Logger.getLogger(GetSevaServletForCheck.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GetSevaServletForCheck.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
