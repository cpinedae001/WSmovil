/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guatex.CAD;

import java.sql.Connection;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;


/**
 *
 * @author Ivan
 */
public class CAD {
    public Connection getConection(){
        try {
                Context context = new InitialContext();
                DataSource dt = (DataSource) context.lookup("poolMovilidad");
                
        } catch (Exception e) {
        }
        return null;
    }
}
