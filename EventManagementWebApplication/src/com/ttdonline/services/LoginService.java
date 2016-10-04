/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ttdonline.services;

import com.ttdonline.beans.Login;
import com.ttdonline.daoimplementations.LoginDaoImplementation;
import com.ttdonline.daointerfaces.LoginDao;
import java.sql.SQLException;

/**
 *
 * @author Techm
 */
public class LoginService {
    public String validateUser(Login login) throws ClassNotFoundException,SQLException{
	LoginDao loginDao=new LoginDaoImplementation();
	return loginDao.validateUser(login);	
    }

    public void addUserToLogin(int did,String username,String password) throws ClassNotFoundException,SQLException{
        LoginDao loginDao=new LoginDaoImplementation();
    loginDao.addUserToLogin(did,username,password);
    
    }
}
