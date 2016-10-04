/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ttdonline.services;

import com.ttdonline.beans.Devotee;
import com.ttdonline.daoimplementations.DevoteeDaoImplementation;
import com.ttdonline.daointerfaces.DevoteeDao;
import java.sql.SQLException;

/**
 *
 * @author Techm
 */
public class DevoteeService {
    public void addDevoteeDetails(Devotee devotee)throws ClassNotFoundException,SQLException{
	
	DevoteeDao devoteeDao=new DevoteeDaoImplementation();
	devoteeDao.addDevoteeDetails(devotee);
}
    
    public int getDevoteeId(String username)throws ClassNotFoundException,SQLException{
        DevoteeDao devoteeDao=new DevoteeDaoImplementation();
        return devoteeDao.getDevoteeId(username);
    }


}
