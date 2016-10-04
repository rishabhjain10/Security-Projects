/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ttdonline.daoimplementations;

import com.ttdonline.beans.Seva;
import com.ttdonline.daointerfaces.SevaDao;
import com.ttdonline.utilities.DatabaseConnectionUtility;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Techm
 */
public class SevaDaoImplementation implements SevaDao {

    public void addSevaDetails(Seva s) throws SQLException,ClassNotFoundException {
       Connection con=DatabaseConnectionUtility.getConnection();
        PreparedStatement pstmt=con.prepareStatement("insert into seva values(?,?,?,?,?,?)");
        pstmt.setInt(1,s.getSevaId());
        pstmt.setString(2,s.getSevaName());
        pstmt.setString(3,s.getSevaDay());
        pstmt.setInt(4,s.getSevaCost());
        pstmt.setInt(5,s.getAllowedSeats());
        pstmt.setInt(6,s.getTotalSeats());
        pstmt.executeUpdate();
        DatabaseConnectionUtility.closeConnection(con);
        }

   public List getParticularSevaDetails(int sevaid) throws SQLException,ClassNotFoundException{
         Connection con=DatabaseConnectionUtility.getConnection();
         List sevaList=new ArrayList();
         
//         PreparedStatement pstmt=con.prepareStatement("select * from seva where sevaname=?");
          PreparedStatement pstmt=con.prepareStatement("select * from seva where sevaid=?");
         pstmt.setInt(1,sevaid);
	ResultSet rs=pstmt.executeQuery();
	
        while(rs.next()){
		Seva seva=new Seva();
                
                seva.setSevaId(rs.getInt("sevaid"));
                seva.setSevaName(rs.getString("sevaname"));
                seva.setSevaDay(rs.getString("availabledays"));
                seva.setSevaCost(rs.getInt("totalcost"));
                seva.setAllowedSeats(rs.getInt("allowedperticket"));
                seva.setTotalSeats(rs.getInt("totalseats"));
		sevaList.add(seva);	
}
	
DatabaseConnectionUtility.closeConnection(con);
	
return sevaList;    
}
   
   public List getAllSevas() throws SQLException,ClassNotFoundException{
       List allSevas=new ArrayList();
        Connection con=DatabaseConnectionUtility.getConnection();
        PreparedStatement pstmt=con.prepareStatement("select * from seva");
        ResultSet rs=pstmt.executeQuery();
        Seva s;
        while(rs.next()){
            s=new Seva();
            s.setAllowedSeats(rs.getInt("allowedperticket"));
            s.setSevaCost(rs.getInt("totalcost"));
            s.setSevaDay(rs.getString("availabledays"));
            s.setSevaId(rs.getInt("sevaid"));
            s.setSevaName(rs.getString("sevaname"));
            s.setTotalSeats(rs.getInt("totalseats"));
            allSevas.add(s);
        }
        pstmt.executeUpdate();
        DatabaseConnectionUtility.closeConnection(con);
       return allSevas;
   }
   
   public List getParticularSevaId(String sevaname) throws SQLException,ClassNotFoundException{
         Connection con=DatabaseConnectionUtility.getConnection();
         List sevaList=new ArrayList();
         
         PreparedStatement pstmt=con.prepareStatement("select * from seva where sevaname=?");
//          PreparedStatement pstmt=con.prepareStatement("select * from seva where sevaid=?");
         pstmt.setString(1,sevaname);
	ResultSet rs=pstmt.executeQuery();
	
        while(rs.next()){
		Seva seva=new Seva();
                
                seva.setSevaId(rs.getInt("sevaid"));
                seva.setSevaName(rs.getString("sevaname"));
                seva.setSevaDay(rs.getString("availabledays"));
                seva.setSevaCost(rs.getInt("totalcost"));
                seva.setAllowedSeats(rs.getInt("allowedperticket"));
                seva.setTotalSeats(rs.getInt("totalseats"));
		sevaList.add(seva);	
}
	
DatabaseConnectionUtility.closeConnection(con);
	
return sevaList;    
}
}
