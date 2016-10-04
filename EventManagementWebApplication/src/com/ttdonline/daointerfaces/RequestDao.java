package com.ttdonline.daointerfaces;

import com.ttdonline.beans.Request;
import java.sql.SQLException;
import java.util.List;

public interface RequestDao {
    public abstract void addRequest(Request r) throws SQLException,ClassNotFoundException;
//    public abstract void removeRequest(Request r) throws SQLException,ClassNotFoundException;
    public abstract String getRequestStatus(Request r) throws SQLException,ClassNotFoundException;
    public abstract List getRequests() throws SQLException,ClassNotFoundException;
    public List getPendingRequests(int did) throws SQLException, ClassNotFoundException;
     public List getApprovedRequests(int did) throws SQLException, ClassNotFoundException;
     public abstract void approveRequest(int requestNo) throws SQLException,ClassNotFoundException;
    public abstract void rejectRequest(int requestNo) throws SQLException,ClassNotFoundException;
}
