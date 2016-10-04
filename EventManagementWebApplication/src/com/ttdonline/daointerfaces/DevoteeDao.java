/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ttdonline.daointerfaces;

import com.ttdonline.beans.Devotee;
import java.sql.SQLException;

/**
 *
 * @author Techm
 */
public interface DevoteeDao {
    public abstract void addDevoteeDetails(Devotee d)throws ClassNotFoundException,SQLException;
    public abstract int getDevoteeId(String username)throws ClassNotFoundException,SQLException;
    
}
