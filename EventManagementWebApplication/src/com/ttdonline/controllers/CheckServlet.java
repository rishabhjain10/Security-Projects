         package com.ttdonline.controllers;

import com.ttdonline.beans.CheckDateCompatibility;
import com.ttdonline.beans.GetDaysBasedOnDate;
import com.ttdonline.beans.Seva;
import com.ttdonline.beans.SevaDays;
import com.ttdonline.services.SevaService;
import com.ttdonline.services.TransactionService;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class CheckServlet extends HttpServlet {
  
 public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{

		PrintWriter out=response.getWriter();
		int sevaid=Integer.parseInt(request.getParameter("nameOfSeva"));
		String sevadate=request.getParameter("sevadate");
		int userSeats=Integer.parseInt(request.getParameter("seatsss"));
		     System.out.println(userSeats);
		
		
		SevaService sevaService=new SevaService();
		TransactionService transactionService=new TransactionService();
		
		CheckDateCompatibility c=new CheckDateCompatibility();
		GetDaysBasedOnDate d=new GetDaysBasedOnDate();
		
		List sevaDetails=new ArrayList();
		List sevadays=new ArrayList();
		
		
		SevaDays s=new SevaDays();
		
		int totalseats=0;
		int allowedseats=0;
		int sevacost=0;
		String sevaname="";
		try{
		    
			//getting seva row from seva table for sevaname,sid which userwants   
			sevaDetails=sevaService.getParticularSevaDetails(sevaid);
			Seva seva;
			Iterator i=sevaDetails.iterator();
			if(i.hasNext()){
			    seva=(Seva)i.next();
				sevaname=seva.getSevaName();
				int sid=seva.getSevaId();
				totalseats=seva.getTotalSeats();
				allowedseats=seva.getAllowedSeats();
				sevacost=seva.getSevaCost();
				String days=seva.getSevaDay();
			}
			   // System.out.println(seva);
			int seatsbooked=transactionService.getSeatsBookedForDateAndSeva(sevaid, sevadate);
			//getting all days on which pooja performed 
			sevadays=s.getSevaDays(sevaid);
				System.out.println("userseats"+userSeats);
			    System.out.println("total"+totalseats);
			    System.out.println("booked"+seatsbooked);
			//constraints
			if(c.checkDateCompatibility(sevadate)){
				if(sevadays.contains(d.getDayBaseOnDate(sevadate))){
					if(userSeats<=allowedseats){
						if((userSeats)<=(totalseats-seatsbooked)){
						    System.out.println("4");
						    List l=sevaService.getAllSevas();
						    request.setAttribute("listofsevas", l);
						    RequestDispatcher rd=request.getRequestDispatcher("available.jsp");
						    rd.forward(request, response);
						}
						else{
						    RequestDispatcher rd=request.getRequestDispatcher("notavailable.jsp");
						    rd.forward(request, response);
						}
					
					}
					else{
					    RequestDispatcher rd=request.getRequestDispatcher("notavailable.jsp");
					    rd.forward(request, response);
					}
				}
				else{
				    RequestDispatcher rd=request.getRequestDispatcher("notavailable.jsp");
				    rd.forward(request, response);
				}
			    
			}
			else{
			    RequestDispatcher rd=request.getRequestDispatcher("notavailable.jsp");
			    rd.forward(request, response);
			}
		
		}
		catch(SQLException e){
		    e.printStackTrace();
		}
		catch(ClassNotFoundException e1){
			e1.printStackTrace();
		}  
		catch(ParseException p){
		    p.printStackTrace();
		}
	
	}
}