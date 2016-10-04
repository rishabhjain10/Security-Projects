/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ttdonline.daointerfaces;

import com.ttdonline.beans.Transaction;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Techm
 */
public interface TransactionDao {
    public abstract void addTicket(Transaction t) throws SQLException,ClassNotFoundException;
    public abstract List getTicketDetails(Transaction t) throws SQLException,ClassNotFoundException;
    public abstract int getSeatsBookedForDateAndSeva(int sevaid,String sdate) throws SQLException, ClassNotFoundException;
}
