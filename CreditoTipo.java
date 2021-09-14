/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.banco.litoral;

import java.math.BigDecimal;
import java.util.Objects;

/**
 *
 * @author Alexis
 */
public class CreditoTipo {
    private String descripcion;
    private BigDecimal tasaDeInteres,montoMinimo,montoMaximo;
    private int aniosMinimo, aniosMaximo;
    private ClienteTipoEnum clienteTipo;

    public CreditoTipo(String descripcion, BigDecimal tasaDeInteres, BigDecimal montoMinimo, BigDecimal montoMaximo, int aniosMinimo, int aniosMaximo, ClienteTipoEnum clienteTipo) {
        this.descripcion = descripcion;
        this.tasaDeInteres = tasaDeInteres;
        this.montoMinimo = montoMinimo;
        this.montoMaximo = montoMaximo;
        this.aniosMinimo = aniosMinimo;
        this.aniosMaximo = aniosMaximo;
        this.clienteTipo= clienteTipo;
    }

    public ClienteTipoEnum getClienteTipo() {
        return clienteTipo;
    }

    public void setClienteTipo(ClienteTipoEnum clienteTipo) {
        this.clienteTipo = clienteTipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public BigDecimal getTasaDeInteres() {
        return tasaDeInteres;
    }

    public void setTasaDeInteres(BigDecimal tasaDeInteres) {
        this.tasaDeInteres = tasaDeInteres;
    }

    public BigDecimal getMontoMinimo() {
        return montoMinimo;
    }

    public void setMontoMinimo(BigDecimal montoMinimo) {
        this.montoMinimo = montoMinimo;
    }

    public BigDecimal getMontoMaximo() {
        return montoMaximo;
    }

    public void setMontoMaximo(BigDecimal montoMaximo) {
        this.montoMaximo = montoMaximo;
    }

    public int getAniosMinimo() {
        return aniosMinimo;
    }

    public void setAniosMinimo(int aniosMinimo) {
        this.aniosMinimo = aniosMinimo;
    }

    public int getAniosMaximo() {
        return aniosMaximo;
    }

    public void setAniosMaximo(int aniosMaximo) {
        this.aniosMaximo = aniosMaximo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.descripcion);
        hash = 89 * hash + Objects.hashCode(this.tasaDeInteres);
        hash = 89 * hash + Objects.hashCode(this.montoMinimo);
        hash = 89 * hash + Objects.hashCode(this.montoMaximo);
        hash = 89 * hash + this.aniosMinimo;
        hash = 89 * hash + this.aniosMaximo;
        hash = 89 * hash + Objects.hashCode(this.clienteTipo);
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
        final CreditoTipo other = (CreditoTipo) obj;
        if (this.aniosMinimo != other.aniosMinimo) {
            return false;
        }
        if (this.aniosMaximo != other.aniosMaximo) {
            return false;
        }
        if (!Objects.equals(this.descripcion, other.descripcion)) {
            return false;
        }
        if (!Objects.equals(this.tasaDeInteres, other.tasaDeInteres)) {
            return false;
        }
        if (!Objects.equals(this.montoMinimo, other.montoMinimo)) {
            return false;
        }
        if (!Objects.equals(this.montoMaximo, other.montoMaximo)) {
            return false;
        }
        if (this.clienteTipo != other.clienteTipo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CreditoTipo{descripcion=").append(descripcion);
        sb.append(", tasaDeInteres=").append(tasaDeInteres);
        sb.append(", montoMinimo=").append(montoMinimo);
        sb.append(", montoMaximo=").append(montoMaximo);
        sb.append(", aniosMinimo=").append(aniosMinimo);
        sb.append(", aniosMaximo=").append(aniosMaximo);
        sb.append(", clienteTipo=").append(clienteTipo);
        sb.append('}');
        return sb.toString();
    }


}
