package com.mycompany.banco.litoral;

import static java.lang.System.runFinalization;
import java.math.BigDecimal;

public class Credito implements Comparable<Credito> {

    private int numero, plazoEnAnios;
    private CreditoTipo tipo;
    private Cliente cliente;
    private Sucursal sucursal;
    private BigDecimal montoAcordado, totalADevolver;

    public Credito(int numero, int plazoEnAnios, CreditoTipo tipo, Cliente cliente, Sucursal sucursal, BigDecimal montoAcordado) throws Exception, Throwable {
        try{ 
        if (tipo.getAniosMinimo() > plazoEnAnios) {
            throw new Exception("No se ha podido crear el credito porque no cumple la cantidad de años minimos");
        } else if (plazoEnAnios > tipo.getAniosMaximo()) {
            throw new Exception("No se ha podido crear el credito porque excede la cantidad de años maximos");
        } else if (tipo.getMontoMinimo().doubleValue() > montoAcordado.doubleValue()) {
            throw new Exception("No se ha podido crear el credito porque no se cumple con el monto mínimo");
        } else if (montoAcordado.doubleValue() > tipo.getMontoMaximo().doubleValue()) {
            throw new Exception("No se ha podido crear el credito porque se excede el monto máximo");
        } else {
            this.numero = numero;
            this.plazoEnAnios = plazoEnAnios;
            this.tipo = tipo;
            this.cliente = cliente;
            this.sucursal = sucursal;
            this.montoAcordado = montoAcordado;
            this.totalADevolver = tipo.getTasaDeInteres().divide(new BigDecimal(100)).multiply(montoAcordado).add(montoAcordado);
//            //Las siguientes lineas calculan si el interes es anual
//            int contador=plazoEnAnios-1;
//            while (contador>0){
//            this.totalADevolver = tipo.getTasaDeInteres().divide(new BigDecimal(100)).multiply(this.totalADevolver).add(this.totalADevolver);
//            contador--;
//            }
        }}
        catch (Exception exc){
            System.out.println(exc.toString());
            runFinalization();
        }
        
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getPlazoEnAnios() {
        return plazoEnAnios;
    }

    public void setPlazoEnAnios(int plazoEnAnios) {
        this.plazoEnAnios = plazoEnAnios;
    }

    public CreditoTipo getTipo() {
        return tipo;
    }

    public void setTipo(CreditoTipo tipo) {
        this.tipo = tipo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public BigDecimal getMontoAcordado() {
        return montoAcordado;
    }

    public BigDecimal getTotalADevolver() {
        return totalADevolver;
    }

    public void setTotalADevolver(BigDecimal totalADevolver) {
        this.totalADevolver = totalADevolver;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + this.numero;
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
        final Credito other = (Credito) obj;
        if (this.numero != other.numero) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n\nCredito{numero=").append(numero);
        sb.append(", plazoEnAnios=").append(plazoEnAnios);
        sb.append(",\ntipo=").append(tipo);
        sb.append(",\ncliente=").append(cliente);
        sb.append(", sucursal=").append(sucursal);
        sb.append(", montoAcordado=").append(montoAcordado);
        sb.append(", totalADevolver=").append(totalADevolver);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Credito o) {
        return this.numero > o.getNumero() ? 1 : this.numero < o.getNumero() ? -1 : 0;
    }

}
