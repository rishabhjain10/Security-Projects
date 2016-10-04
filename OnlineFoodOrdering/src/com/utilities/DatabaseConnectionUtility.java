/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ttdonline.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Techm
 */
public class DatabaseConnectionUtility {
	public static Connection getConnection( ) throws ClassNotFoundException, SQLException{
        Connection con = null;
        Class.forName("oracle.jdbc.driver.OracleDriver");
		con=DriverManager.getConnection("jdbc:oracle:thin:localhost:1158:orcl","system","msat123$");
		return con;
	}
	public static void closeConnection(Connection con) throws SQLException{
        con.close();
   }

}
