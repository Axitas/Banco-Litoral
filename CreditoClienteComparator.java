/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.banco.litoral;

import java.util.Comparator;

/**
 *
 * @author Alexis
 */
public class CreditoClienteComparator implements Comparator<Credito> {

    @Override
    public int compare(Credito o1, Credito o2) {

        int resultado = o1.getCliente().getApellido().compareTo(o2.getCliente().getApellido());
        if (resultado == 0) {
            resultado = o1.getCliente().getNombre().compareTo(o2.getCliente().getNombre());
        }

        return resultado;
    }

}
