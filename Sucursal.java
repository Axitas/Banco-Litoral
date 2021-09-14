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
class Sucursal {
    private String nombreClave;

    public Sucursal(String nombreClave) {
        this.nombreClave = nombreClave;
    }

    public String getNombreClave() {
        return nombreClave;
    }

    public void setNombreClave(String nombreClave) {
        this.nombreClave = nombreClave;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Sucursal{nombreClave=").append(nombreClave);
        sb.append('}');
        return sb.toString();
    }
}
