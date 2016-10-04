/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ttdonline.daoimplementations;

import com.ttdonline.beans.Login;
import com.ttdonline.daointerfaces.LoginDao;
import com.ttdonline.utilities.DatabaseConnectionUtility;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Techm
 */
public class LoginDaoImplementation implements LoginDao{

    public String validateUser( Login login) throws ClassNotFoundException, SQLException{
     String role = "";
     Connection con = DatabaseConnectionUtility.getConnection();
     PreparedStatement psmt = con.prepareStatement("select role from ttdlogin where username=? and password=?");
        psmt.setString(1, login.getUsername());
        psmt.setString(2, login.getPassword());
        ResultSet rs = psmt.executeQuery();
        if(rs.next()){
            role=rs.getString("role");
        }
        else{
            role = "invalid";
        }
        return role;
    }

    public int getDevoteeId(Login login) throws ClassNotFoundException, SQLException {
        int did;
        Connection con = DatabaseConnectionUtility.getConnection();
     PreparedStatement psmt = con.prepareStatement("select did from ttdlogin where username=? and password=?");
      psmt.setString(1, login.getUsername());
        psmt.setString(2, login.getPassword());
         ResultSet rs = psmt.executeQuery();
        if(rs.next()){
            did=rs.getInt("role");
        }
        else{
            did=0;
        }
    return did;
    }
    
   public void addUserToLogin(int did,String username,String password) throws SQLException,ClassNotFoundException{
    Connection con=DatabaseConnectionUtility.getConnection();
    con.commit();
    PreparedStatement pstmt=con.prepareStatement("insert into ttdlogin values (?,?,'devotee',?)");
    pstmt.setString(1,username);
    pstmt.setString(2,password);
    pstmt.setInt(3, did);
    pstmt.executeUpdate();
    con.commit();
    DatabaseConnectionUtility.getConnection();
    
}
    
}
