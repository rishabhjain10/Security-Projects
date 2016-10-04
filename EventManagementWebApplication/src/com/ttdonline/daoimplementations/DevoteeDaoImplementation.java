package com.ttdonline.daoimplementations;

import com.ttdonline.beans.Devotee;
import com.ttdonline.beans.Login;
import com.ttdonline.daointerfaces.DevoteeDao;
import com.ttdonline.utilities.DatabaseConnectionUtility;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DevoteeDaoImplementation implements DevoteeDao {

    public void addDevoteeDetails(Devotee d) throws ClassNotFoundException,SQLException {
     
        Connection con=DatabaseConnectionUtility.getConnection();
       PreparedStatement pstmt=con.prepareStatement("insert into devotee values(devseq.nextval,?,?,?,?,?,?,?,?,?)");
        pstmt.setString(1,d.getDevoteeName());
        pstmt.setString(2,d.getDateOfBirth());
        pstmt.setString(3,d.getTitle());
        pstmt.setString(4,d.getCity());
        pstmt.setString(5,d.getCountry());
        pstmt.setString(6,d.getAddress1());
        pstmt.setString(7,d.getAddress2());
        pstmt.setString(8,d.getPhoneNumber());
        pstmt.setString(9,d.getUsername());
        
        pstmt.executeUpdate();
        DatabaseConnectionUtility.closeConnection(con);
        
    }

    public int getDevoteeId(String username) throws ClassNotFoundException, SQLException {
        int did=0;
         Connection con=DatabaseConnectionUtility.getConnection();
       PreparedStatement pstmt=con.prepareStatement("select * from devotee where username=?");
       pstmt.setString(1,username);
       ResultSet rs=pstmt.executeQuery();
       while(rs.next()){
           did=rs.getInt("did");
       }
       return did;
    }
    
    
    
}
