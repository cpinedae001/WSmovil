/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guatex.CAD;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Ivan
 */
public class Conexion {

    private static final String url = "jdbc:postgresql://localhost:5432/MovilidadDB";
    private static final String user = "postgres";
    private static final String contraseña = "root";

    Connection conexionDB;

    public Connection getConexionDB() {
        return conexionDB;
    }

    public void setConexionDB(Connection conexionDB) {
        this.conexionDB = conexionDB;
    }

    public void abrirConexion() {
        try {
            Class.forName("org.postgresql.Driver");
            this.conexionDB = DriverManager.getConnection(url, user, contraseña);
        } catch (Exception e) {
            System.out.println("Error al abrir la conexion. ");
        }
    }

    public void cerrarConexion() {
        try {
            if (!this.conexionDB.isClosed() && this.conexionDB != null) {
                this.conexionDB.close();
            }
        } catch (Exception e) {
            System.out.println("Error al cerrar la conexion.");
        }
    }
}
