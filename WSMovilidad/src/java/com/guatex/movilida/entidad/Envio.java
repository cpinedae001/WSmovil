/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guatex.movilida.entidad;

import java.sql.Timestamp;

/**
 *
 * @author Ivan
 */
public class Envio {

    private int cod_envio;
    private String descripcion;
    private Timestamp fecha;
    private int cliente_cod_cliente;
    private int enc_seguimiento_no_enceguimiento;

    public int getCod_envio() {
        return cod_envio;
    }

    public void setCod_envio(int cod_envio) {
        this.cod_envio = cod_envio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Timestamp getFecha() {
        return fecha;
    }

    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
    }

    public int getCliente_cod_cliente() {
        return cliente_cod_cliente;
    }

    public void setCliente_cod_cliente(int cliente_cod_cliente) {
        this.cliente_cod_cliente = cliente_cod_cliente;
    }

    public int getEnc_seguimiento_no_enceguimiento() {
        return enc_seguimiento_no_enceguimiento;
    }

    public void setEnc_seguimiento_no_enceguimiento(int enc_seguimiento_no_enceguimiento) {
        this.enc_seguimiento_no_enceguimiento = enc_seguimiento_no_enceguimiento;
    }

}
