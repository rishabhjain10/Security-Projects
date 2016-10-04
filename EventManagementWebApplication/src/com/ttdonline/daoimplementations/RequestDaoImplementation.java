/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ttdonline.daoimplementations;

import com.ttdonline.beans.Request;
import com.ttdonline.daointerfaces.RequestDao;
import com.ttdonline.utilities.DatabaseConnectionUtility;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Techm
 */
public class RequestDaoImplementation implements RequestDao{

    public void addRequest(Request request) throws SQLException, ClassNotFoundException {
        Connection con=DatabaseConnectionUtility.getConnection();
        PreparedStatement pstmt=con.prepareStatement("insert into request values(?,?,?,?,?,reqseq.nextval,?,?)");
        pstmt.setInt(1,request.getDevoteeId());
        pstmt.setString(2,request.getSevaName());
        pstmt.setInt(3,request.getSevaId());
        pstmt.setString(4,request.getBookingDate());
        pstmt.setInt(5,request.getNoofSeats());
        pstmt.setString(6,"PENDING");
        pstmt.setInt(7,request.getCost());
        pstmt.executeUpdate();
        DatabaseConnectionUtility.closeConnection(con);
    }

    public List getRequests() throws SQLException, ClassNotFoundException {
        Connection con=DatabaseConnectionUtility.getConnection();
        List requestList=new ArrayList();
        PreparedStatement pstmt=con.prepareStatement("select * from request");
        ResultSet rs=pstmt.executeQuery();
        Request r;
        while(rs.next()){
            r=new Request();
            r.setDevoteeId(rs.getInt("devoteeid"));
            r.setSevaName(rs.getString("sevaname"));
            r.setSevaId(rs.getInt("sevaid"));
            r.setBookingDate(rs.getString("bookdate"));
            r.setCost(rs.getInt("cost"));
            r.setRequestNo(rs.getInt("requestno"));
            r.setNoofSeats(rs.getInt("noofseats"));
            r.setStatus(rs.getString("status"));
            requestList.add(r);
        }
        pstmt.executeUpdate();
        DatabaseConnectionUtility.closeConnection(con);
        return requestList;
    }

    public String getRequestStatus(Request r) throws SQLException, ClassNotFoundException {
        String status=""; 
        Connection con=DatabaseConnectionUtility.getConnection();
        PreparedStatement pstmt=con.prepareStatement("select status from request where devoteeid=? and requestno=?");
        pstmt.setInt(1,r.getDevoteeId());
        pstmt.setInt(2,r.getRequestNo());
        ResultSet rs=pstmt.executeQuery();
        if(rs.next()){
            status=rs.getString("status");
        }
        else{
            status="no ticket";
        }
        DatabaseConnectionUtility.closeConnection(con);
        return status;
    }

    public List getPendingRequests(int did) throws SQLException, ClassNotFoundException {
        Connection con=DatabaseConnectionUtility.getConnection();
        List requestList=new ArrayList();
        PreparedStatement pstmt=con.prepareStatement("select * from request where devoteeid=? and status='PENDING'");
        pstmt.setInt(1,did);
        ResultSet rs=pstmt.executeQuery();
        Request r;
        while(rs.next()){
            r=new Request();
            r.setDevoteeId(rs.getInt("devoteeid"));
            r.setSevaName(rs.getString("sevaname"));
            r.setSevaId(rs.getInt("sevaid"));
            r.setBookingDate(rs.getString("bookdate"));
            r.setCost(rs.getInt("cost"));
            r.setRequestNo(rs.getInt("requestno"));
            r.setNoofSeats(rs.getInt("noofseats"));
            r.setStatus(rs.getString("status"));
            requestList.add(r);
        }
        pstmt.executeUpdate();
        DatabaseConnectionUtility.closeConnection(con);
        return requestList;
    }
    
    public List getApprovedRequests(int did) throws SQLException, ClassNotFoundException {
        Connection con=DatabaseConnectionUtility.getConnection();
        List requestList=new ArrayList();
        PreparedStatement pstmt=con.prepareStatement("select * from request where devoteeid=? and status='APPROVED'");
        pstmt.setInt(1,did);
        ResultSet rs=pstmt.executeQuery();
        Request r;
        while(rs.next()){
            r=new Request();
            r.setDevoteeId(rs.getInt("devoteeid"));
            r.setSevaName(rs.getString("sevaname"));
            r.setSevaId(rs.getInt("sevaid"));
            r.setBookingDate(rs.getString("bookdate"));
            r.setCost(rs.getInt("cost"));
            r.setRequestNo(rs.getInt("requestno"));
            r.setNoofSeats(rs.getInt("noofseats"));
            r.setStatus(rs.getString("status"));
            requestList.add(r);
        }
        pstmt.executeUpdate();
        DatabaseConnectionUtility.closeConnection(con);
        return requestList;
    }
    
    
    public void approveRequest(int requestNo) throws SQLException, ClassNotFoundException {
        Connection con=DatabaseConnectionUtility.getConnection();
        
        PreparedStatement pstmt=con.prepareStatement("update request set status='APPROVED' where requestno=?");
        pstmt.setInt(1,requestNo);  
        pstmt.executeUpdate();
        DatabaseConnectionUtility.closeConnection(con);
        
    }
    public void rejectRequest(int requestNo) throws SQLException, ClassNotFoundException {
        Connection con=DatabaseConnectionUtility.getConnection();
        
        PreparedStatement pstmt=con.prepareStatement("update request set status='NOT APPROVED' where requestno=?");
        pstmt.setInt(1,requestNo);  
        pstmt.executeUpdate();
        DatabaseConnectionUtility.closeConnection(con);
        
    }
    
}
