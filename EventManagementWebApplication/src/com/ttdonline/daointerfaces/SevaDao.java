/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ttdonline.daointerfaces;

import com.ttdonline.beans.Seva;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Techm
 */
public interface SevaDao {
    public abstract void addSevaDetails(Seva s) throws SQLException,ClassNotFoundException;//admin
    public List getParticularSevaDetails(int sevaid) throws SQLException,ClassNotFoundException;
    public List getAllSevas() throws SQLException,ClassNotFoundException;
}
