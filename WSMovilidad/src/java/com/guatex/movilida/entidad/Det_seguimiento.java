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
public class Det_seguimiento {

    private int no_det_seguimiento;
    private String detalle_det_seguimiento;
    private Timestamp fecha;

    public int getNo_det_seguimiento() {
        return no_det_seguimiento;
    }

    public void setNo_det_seguimiento(int no_det_seguimiento) {
        this.no_det_seguimiento = no_det_seguimiento;
    }

    public String getDetalle_det_seguimiento() {
        return detalle_det_seguimiento;
    }

    public void setDetalle_det_seguimiento(String detalle_det_seguimiento) {
        this.detalle_det_seguimiento = detalle_det_seguimiento;
    }

    public Timestamp getFecha() {
        return fecha;
    }

    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
    }

}
