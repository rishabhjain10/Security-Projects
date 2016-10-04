package com.ttdonline.daoimplementations;

import com.ttdonline.beans.Transaction;
import com.ttdonline.daointerfaces.TransactionDao;
import com.ttdonline.utilities.DatabaseConnectionUtility;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TransactionDaoImplementation implements TransactionDao {

    public void addTicket(Transaction t) throws SQLException, ClassNotFoundException {
        Connection con=DatabaseConnectionUtility.getConnection();	
        PreparedStatement pstmt=con.prepareStatement("insert into transaction values(?,?,?,?,?,?,tktseq.nextval)");
        pstmt.setString(1,t.getDevoteeName());
        pstmt.setInt(2,t.getDevoteeId());
        pstmt.setString(3,t.getSevaName());
        pstmt.setString(4,t.getSevaDate());
        pstmt.setLong(5,t.getDevoteeCost());
        pstmt.setInt(6,t.getSeatsBooked());
        pstmt.executeUpdate();
        DatabaseConnectionUtility.closeConnection(con);
    }

    public List getTicketDetails(Transaction t) throws SQLException, ClassNotFoundException {
        List ticketList=new ArrayList();
        Connection con=DatabaseConnectionUtility.getConnection();
        PreparedStatement pstmt=con.prepareStatement("select * from transaction where did=? and ticketid=?");
        pstmt.setInt(1,t.getDevoteeId());
        pstmt.setInt(2,t.getTicketId());   
        ResultSet rs=pstmt.executeQuery();
        Transaction t1=null;
        while(rs.next()){
            t1=new Transaction();
            t1.setDevoteeCost(rs.getInt("totcost"));
            t1.setDevoteeId(rs.getInt("did"));
            t1.setDevoteeName(rs.getString("dname"));
            t1.setSeatsBooked(rs.getInt("seatsbooked"));
            t1.setSevaDate(rs.getString("sdate"));
            t1.setSevaName(rs.getString("sname"));
            t1.setTicketId(rs.getInt("ticketid"));
            ticketList.add(t1);
        }
        
        return ticketList;
    }
    
      public int getSeatsBookedForDateAndSeva(int sid,String sdate) throws SQLException, ClassNotFoundException {
        List ticketList=new ArrayList();
        Connection con=DatabaseConnectionUtility.getConnection();
        PreparedStatement pstmt=con.prepareStatement("select sum(seatsbooked) from transaction where sevaid=? and sdate=?");
        pstmt.setInt(1,sid);
        pstmt.setString(2,sdate);   
        ResultSet rs=pstmt.executeQuery();
        int total=0;
        while(rs.next()){
            total=rs.getInt("sum(seatsbooked)");
        }
        
        return total;
    }
    
    
}
