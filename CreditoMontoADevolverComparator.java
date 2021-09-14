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
public class CreditoMontoADevolverComparator implements Comparator<Credito>{
    @Override
    public int compare(Credito o1, Credito o2) {
        return o1.getTotalADevolver().compareTo(o2.getTotalADevolver());
    }
    
}
