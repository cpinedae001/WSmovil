/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guatex.movilida.entidad;

/**
 *
 * @author Ivan
 */
public class Empleado {

    private int cod_empleado;
    private String usuario;
    private String contraseña;
    private String activo;
    private int puesto_trabajo_cod_puesto;

    public int getCod_empleado() {
        return cod_empleado;
    }

    public void setCod_empleado(int cod_empleado) {
        this.cod_empleado = cod_empleado;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getActivo() {
        return activo;
    }

    public void setActivo(String activo) {
        this.activo = activo;
    }

    public int getPuesto_trabajo_cod_puesto() {
        return puesto_trabajo_cod_puesto;
    }

    public void setPuesto_trabajo_cod_puesto(int puesto_trabajo_cod_puesto) {
        this.puesto_trabajo_cod_puesto = puesto_trabajo_cod_puesto;
    }
    
    

}
