package com.ttdonline.daointerfaces;

import com.ttdonline.beans.Login;
import java.sql.SQLException;

public interface LoginDao {
    public abstract String validateUser(Login login) throws ClassNotFoundException,SQLException;
    //public abstract int getDevoteeId(Login login) throws ClassNotFoundException,SQLException;
    public abstract void addUserToLogin(int did,String username,String password) throws SQLException,ClassNotFoundException;
}
