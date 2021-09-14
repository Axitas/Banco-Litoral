/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.banco.litoral;

import java.util.Objects;

/**
 *
 * @author Alexis
 */
class Cliente {
    private String apellido,nombre,documento;
    private ClienteTipoEnum tipo;

    public Cliente(String apellido, String nombre, String documento, ClienteTipoEnum tipo) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.documento = documento;
        this.tipo = tipo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public ClienteTipoEnum getTipo() {
        return tipo;
    }

    public void setTipo(ClienteTipoEnum tipo) {
        this.tipo = tipo;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.documento, other.documento)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{apellido=").append(apellido);
        sb.append(", nombre=").append(nombre);
        sb.append(", documento=").append(documento);
        sb.append(", tipo=").append(tipo);
        sb.append('}');
        return sb.toString();
    }
    
        
}
