/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guatex.servicio;

import com.guatex.dao.FechaSYS;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Ivan
 */
@WebService(serviceName = "Servicio")
public class Servicio {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        System.out.println("fecha del sistema " + new FechaSYS().traerFechaSys());
        return "Hello " + txt + " !";
    }
    
        @WebMethod(operationName = "SincronizacionGuias")
    public byte[] SincronizacionGuias(@WebParam(name = "name") byte[] xmlGuias) {
        byte[] respuestaXML = null;
        try {
            
            System.out.println("Ingresando al servicio de SincronizacionGuias");
        } catch (Exception e) {
            System.out.println("Error en el metodo de SincronizacionGuias");
            System.err.println(e.toString());
        }
        return respuestaXML;
    }

    @WebMethod(operationName = "SincronizacionUsuario")
    public byte[] SincronizacionUsuario(@WebParam(name = "name") byte[] xmlUsuario) {
        byte[] respuestaXML = null;
        try {

            System.out.println("ingresando al servicio SincronizacionUsuario");
        } catch (Exception e) {
            System.out.println("Error en el metodo de SincronizacionUsuario");
            System.err.println(e.toString());
        }
        return respuestaXML;
    }
}
