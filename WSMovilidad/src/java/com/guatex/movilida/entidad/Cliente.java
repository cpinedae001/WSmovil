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
public class Cliente {

    private int cod_cliente;
    private String tipo_cliente;
    private String activo_Cliente;
    private String persona_nit;

    public int getCod_cliente() {
        return cod_cliente;
    }

    public void setCod_cliente(int cod_cliente) {
        this.cod_cliente = cod_cliente;
    }

    public String getTipo_cliente() {
        return tipo_cliente;
    }

    public void setTipo_cliente(String tipo_cliente) {
        this.tipo_cliente = tipo_cliente;
    }

    public String getActivo_Cliente() {
        return activo_Cliente;
    }

    public void setActivo_Cliente(String activo_Cliente) {
        this.activo_Cliente = activo_Cliente;
    }

    public String getPersona_nit() {
        return persona_nit;
    }

    public void setPersona_nit(String persona_nit) {
        this.persona_nit = persona_nit;
    }

}
