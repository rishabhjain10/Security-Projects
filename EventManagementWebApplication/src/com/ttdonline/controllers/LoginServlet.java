package com.ttdonline.controllers;

import com.ttdonline.beans.Login;
import com.ttdonline.services.DevoteeService;
import com.ttdonline.services.LoginService;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {
    
    @Override
    public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
        PrintWriter out=response.getWriter();
        String username=request.getParameter("userid");
        String password=request.getParameter("passid");
        String role = "";
        Login login = new Login( );
        login.setUsername(username);
        login.setPassword(password);
        LoginService loginService = new LoginService( );
      
  try{     
   role = loginService.validateUser(login);
   }
 catch(ClassNotFoundException ce){
            ce.printStackTrace();
            // append exception message to log file  
  }
 catch(SQLException se){
            se.printStackTrace( );
            // append exception message to log file
  }
      
  if( role.equalsIgnoreCase("admin")){
          HttpSession session = request.getSession();
          session.setAttribute("username", username);
          RequestDispatcher rd = request.getRequestDispatcher("adminHomePage.jsp");
          rd.forward(request, response);
  }
  
  if( role.equalsIgnoreCase("devotee")){
          DevoteeService devoteeService=new DevoteeService();
          int did=0;  
          try {
                did=devoteeService.getDevoteeId(username);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(LoginServlet.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(LoginServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
          HttpSession session = request.getSession();
          session.setAttribute("username", username);
          session.setAttribute("devoteeId",did);
          RequestDispatcher rd = request.getRequestDispatcher("devoteeHomePage.jsp");
          rd.forward(request, response);
  }
  
  if( role.equalsIgnoreCase("ticketofficer")){
          HttpSession session = request.getSession();
          session.setAttribute("username", username);
          RequestDispatcher rd = request.getRequestDispatcher("toHomePage.jsp");
          rd.forward(request, response);
  }

   if( role.equalsIgnoreCase("")){
          RequestDispatcher rd = request.getRequestDispatcher("invalidPage.jsp"); 
          rd.forward(request, response);
   }

 
    }
    
    @Override
    public void destroy(){
        System.out.println("end");
    }
}