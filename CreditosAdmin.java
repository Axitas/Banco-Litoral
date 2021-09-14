/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.banco.litoral;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Alexis
 */
public class CreditosAdmin extends CreditosAdminAbstract {

    @Override
    public List<Credito> creditosPorClienteTipo(ClienteTipoEnum tipo) {
        List aDev = new ArrayList();
        creditosList.stream().filter(cred -> (tipo == cred.getCliente().getTipo())).forEachOrdered(cred -> {
            aDev.add(cred);
        });
        return aDev;
    }

    @Override
    public List<Credito> creditosPorCreditoTipoySucursal(CreditoTipo tipo, Sucursal sucursal) {
        List aDev = new ArrayList();
        creditosList.stream().filter(cred -> (tipo == cred.getTipo() && sucursal == cred.getSucursal())).forEachOrdered(cred -> {
            aDev.add(cred);
        });
        return aDev;
    }

    @Override
    public List<Credito> creditosInferioresA(double monto) {
        List aDev = new ArrayList();
        creditosList.stream().filter(cred -> (monto > cred.getMontoAcordado().doubleValue())).forEachOrdered(cred -> {
            aDev.add(cred);
        });
        return aDev;
    }

    @Override
    public List<Credito> creditosSuperioresA(double monto) {
        List aDev = new ArrayList();
        creditosList.stream().filter(cred -> (monto < cred.getMontoAcordado().doubleValue())).forEachOrdered(cred -> {
            aDev.add(cred);
        });
        return aDev;
    }

    @Override
    public void ordenar() {
        Collections.sort(creditosList);
    }

    /**
     *
     * @param comparator
     */
    @Override
    public void ordenar(Comparator comparator) {
        Collections.sort(creditosList, comparator);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(creditosList);
        return sb.toString();
    }

    public void removeRejectedCredits() {
        for (int i = 0; i < creditosList.size(); i++) {
            if (creditosList.get(i).getNumero()==0) {
                creditosList.remove(i);
                i--;
            }
            
        }

}

    @Override
    public void add(Credito c) {
        try{ 
        if (c.getTipo().getAniosMinimo() > c.getPlazoEnAnios()) {
            throw new IllegalArgumentException("No se ha podido crear el credito porque no cumple la cantidad de años minimos");
        } else if (c.getPlazoEnAnios() > c.getTipo().getAniosMaximo()) {
            throw new IllegalArgumentException("No se ha podido crear el credito porque excede la cantidad de años maximos");
        } else if (c.getTipo().getMontoMinimo().doubleValue() > c.getMontoAcordado().doubleValue()) {
            throw new IllegalArgumentException("No se ha podido crear el credito porque no se cumple con el monto mínimo");
        } else if (c.getMontoAcordado().doubleValue() > c.getTipo().getMontoMaximo().doubleValue()) {
            throw new IllegalArgumentException("No se ha podido crear el credito porque se excede el monto máximo");
        }
        else {
            creditosList.add(c);
        }
        }
        catch (Exception exc){
                exc.toString();
                }
        
    }
}