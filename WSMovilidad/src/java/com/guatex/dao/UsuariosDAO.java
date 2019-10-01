/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guatex.dao;

import com.guatex.CAD.Conexion;
import com.guatex.movilida.entidad.Empleado;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Ivan
 */
public class UsuariosDAO {
    
    public Empleado obtenerUsuario(String usuario, String password) {
        Empleado empleado = new Empleado();
        PreparedStatement st = null;
        ResultSet rs = null;
        Conexion con = new Conexion();
        try {
            
            con.abrirConexion();
            String query = "select empleado.cod_empleado, empleado.usuario, empleado.contraseÑa, "
                    + "empleado.activo, puesto_trabajo_cod_puesto from empleado \n"
                    + "where empleado.usuario = ? and empleado.contraseÑa= ?";
            st = con.getConexionDB().prepareStatement(query);
            rs = st.executeQuery();
            if (rs.next()) {
                empleado.setCod_empleado(rs.getInt(1));
                empleado.setUsuario(rs.getString(2));
                empleado.setContraseña(rs.getString(3));
                empleado.setActivo(rs.getString(4));
                empleado.setPuesto_trabajo_cod_puesto(rs.getInt(5));
                return empleado;
            }else{
                return empleado = null;
            }
            
            
            
        } catch (Exception e) {
            System.out.println("Error de ejecución del metodo selecionar usuarios.\n"+e.toString());
            return empleado;
        }finally{
            try {
                if(!rs.isClosed()){
                    rs.close();
                }
            } catch (Exception e) {
            }
            try {
                if(!st.isClosed()){
                    st.close();;
                }
            } catch (Exception e) {
            }
        }
        
    }
    
    
}
