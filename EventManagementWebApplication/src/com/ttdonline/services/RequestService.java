/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ttdonline.services;

import com.ttdonline.beans.Request;
import com.ttdonline.daoimplementations.RequestDaoImplementation;
import com.ttdonline.daointerfaces.RequestDao;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Techm
 */
public class RequestService {
    public void addRequest(Request request) throws SQLException,ClassNotFoundException{
RequestDao requestDao=new RequestDaoImplementation();
requestDao.addRequest(request);
}

public List getRequests() throws SQLException,ClassNotFoundException{
RequestDao requestDao=new RequestDaoImplementation();
return requestDao.getRequests();
}

public String getRequestStatus(Request r) throws SQLException,ClassNotFoundException{
RequestDao requestDao=new RequestDaoImplementation();
return requestDao.getRequestStatus(r);
}

public List getPendingRequests(int did) throws SQLException, ClassNotFoundException{
    RequestDao requestDao=new RequestDaoImplementation();
    return requestDao.getPendingRequests(did);
}

 public List getApprovedRequests(int did) throws SQLException, ClassNotFoundException{
     RequestDao requestDao=new RequestDaoImplementation();
    return requestDao.getApprovedRequests(did);
 }
 public void approveRequest(int requestNo) throws SQLException,ClassNotFoundException{
RequestDao requestDao=new RequestDaoImplementation();
requestDao.approveRequest(requestNo);
}
public void rejectRequest(int requestNo) throws SQLException,ClassNotFoundException{
RequestDao requestDao=new RequestDaoImplementation();
requestDao.rejectRequest(requestNo);
}

}
