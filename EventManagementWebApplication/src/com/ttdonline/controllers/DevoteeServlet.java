package com.ttdonline.controllers;

import com.ttdonline.beans.Devotee;
import com.ttdonline.services.DevoteeService;
import com.ttdonline.services.LoginService;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DevoteeServlet extends HttpServlet{
    
    @Override
    public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
        PrintWriter out=response.getWriter();
        String username=request.getParameter("username");
        String dname=request.getParameter("dname");
        String dob=request.getParameter("dob");
        String phoneno=request.getParameter("phoneno");
        String country=request.getParameter("country");
        String city=request.getParameter("city");        
        String address1=request.getParameter("address1");
        String address2=request.getParameter("address2");
        String password=request.getParameter("pwd2");
        String title=request.getParameter("title");   
        
        Devotee devotee=new Devotee();
        
        devotee.setUsername(username);
        devotee.setDevoteeName(dname);
        devotee.setDateOfBirth(dob);
        devotee.setPhoneNumber(phoneno);
        devotee.setCountry(country);
        devotee.setCity(city);
        devotee.setAddress1(address1);
        devotee.setAddress2(address2);
        devotee.setTitle(title);
        
        DevoteeService devoteeService=new DevoteeService();
        LoginService loginService=new LoginService(); 
        try{
            devoteeService.addDevoteeDetails(devotee);
           int did=devoteeService.getDevoteeId(username);
           loginService.addUserToLogin(did, username, password);
            
        }
        catch(ClassNotFoundException e){
            System.out.println("classnot found");
        }
        catch(SQLException e1){
            e1.printStackTrace();
        }
      
        RequestDispatcher rd=request.getRequestDispatcher("Login.html");
        rd.forward(request, response);
               
        
    }
    
}
