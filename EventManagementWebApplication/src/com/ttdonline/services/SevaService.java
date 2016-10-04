/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ttdonline.services;

import com.ttdonline.beans.Seva;
import com.ttdonline.daoimplementations.SevaDaoImplementation;
import com.ttdonline.daointerfaces.SevaDao;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Techm
 */
public class SevaService {
    public void addSevaDetails(Seva seva)throws ClassNotFoundException,SQLException{
	
	SevaDao sevaDao=new SevaDaoImplementation();
	sevaDao.addSevaDetails(seva);
}

public List getParticularSevaDetails(int sevaid)throws SQLException,ClassNotFoundException{

	SevaDao sevaDao=new SevaDaoImplementation();
	return sevaDao.getParticularSevaDetails(sevaid);
}

public List getAllSevas() throws SQLException,ClassNotFoundException{
    SevaDao sevaDao=new SevaDaoImplementation();
	return sevaDao.getAllSevas();
}
}
