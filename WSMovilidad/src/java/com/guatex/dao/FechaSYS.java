/*/
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guatex.dao;


import com.guatex.CAD.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


/**
 *
 * @author Ivan
 */
public class FechaSYS {

    public String traerFechaSys() {
        String fecha = "";
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            
            Conexion con = new Conexion();
            con.abrirConexion();
            String query = "select now();";
            st = con.getConexionDB().prepareStatement(query);
            rs = st.executeQuery();
            if (rs.next()) {
                fecha = rs.getString(1);
            } else {
                fecha = "Error ";
            }

        } catch (Exception e) {
            System.out.println("error en la consulta");
            e.printStackTrace();
        }
        return fecha;
    }
}
