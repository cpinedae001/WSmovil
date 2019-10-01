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
public class Enc_Seguimiento {
 
    private int no_enc_seguimiento;
    private String estado_Caso;
    private String Transmitido;
    private int det_seguimiento_no_det_seguimiento;
    private int codigo_tip_seguimiento;
    private String no_guia;

    public int getNo_enc_seguimiento() {
        return no_enc_seguimiento;
    }

    public void setNo_enc_seguimiento(int no_enc_seguimiento) {
        this.no_enc_seguimiento = no_enc_seguimiento;
    }

    public String getEstado_Caso() {
        return estado_Caso;
    }

    public void setEstado_Caso(String estado_Caso) {
        this.estado_Caso = estado_Caso;
    }

    public String getTransmitido() {
        return Transmitido;
    }

    public void setTransmitido(String Transmitido) {
        this.Transmitido = Transmitido;
    }

    public int getDet_seguimiento_no_det_seguimiento() {
        return det_seguimiento_no_det_seguimiento;
    }

    public void setDet_seguimiento_no_det_seguimiento(int det_seguimiento_no_det_seguimiento) {
        this.det_seguimiento_no_det_seguimiento = det_seguimiento_no_det_seguimiento;
    }

    public int getCodigo_tip_seguimiento() {
        return codigo_tip_seguimiento;
    }

    public void setCodigo_tip_seguimiento(int codigo_tip_seguimiento) {
        this.codigo_tip_seguimiento = codigo_tip_seguimiento;
    }

    public String getNo_guia() {
        return no_guia;
    }

    public void setNo_guia(String no_guia) {
        this.no_guia = no_guia;
    }
    
}
