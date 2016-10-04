/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ttdonline.services;

import com.ttdonline.beans.Transaction;
import com.ttdonline.daoimplementations.TransactionDaoImplementation;
import com.ttdonline.daointerfaces.TransactionDao;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Techm
 */
public class TransactionService {
    public void addTicket(Transaction transaction) throws SQLException,ClassNotFoundException{
TransactionDao transactionDao=new TransactionDaoImplementation();
transactionDao.addTicket(transaction);
}


public List getTicketDetails(Transaction t) throws SQLException,ClassNotFoundException{
TransactionDao transactionDao=new TransactionDaoImplementation();
return transactionDao.getTicketDetails(t);
}

public int getSeatsBookedForDateAndSeva(int sevaid,String sdate) throws SQLException, ClassNotFoundException{
    TransactionDao transactionDao=new TransactionDaoImplementation();
    return transactionDao.getSeatsBookedForDateAndSeva(sevaid, sdate);
}
}
