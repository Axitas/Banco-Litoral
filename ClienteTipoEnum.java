/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.banco.litoral;

/**
 *
 * @author Alexis
 */
public enum ClienteTipoEnum {
    PERSONA("Persona"),
    COMERCIO("Comercio"),
    EMPRESADECONSTRUCCION("Empresa de construcción"),
    RECHAZADO("Credito Rechazado");
    private String descripcion;
    
    ClienteTipoEnum (String descripcion){
        this.descripcion=descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "ClienteTipoEnum{" + "descripcion=" + descripcion + '}';
    }
    
}
