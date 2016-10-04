package com.ttdonline.beans;

import com.ttdonline.utilities.DatabaseConnectionUtility;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SevaDays {
    
    public List getSevaDays(int sid) throws SQLException,ClassNotFoundException{
Connection con=DatabaseConnectionUtility.getConnection();
List sevadayList=new ArrayList();
PreparedStatement pstmt=con.prepareStatement("select sevaday from sevadays where sid=?");
pstmt.setInt(1,sid);
ResultSet rs=pstmt.executeQuery();
String day;
while(rs.next()){
day=rs.getString("sevaday");
sevadayList.add(day);
}
return sevadayList;
}
    
}
