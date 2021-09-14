/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.banco.litoral;

import java.math.BigDecimal;

/**
 *
 * @author Alexis
 */
public class ClienteCreditos {

    public static void main(String[] args) throws Exception, Throwable {
        Cliente clie001 = new Cliente("Gonzalo", "Varela", "40105238", ClienteTipoEnum.PERSONA);
        Cliente clie002 = new Cliente("Burbujas", "SRL", "00685", ClienteTipoEnum.COMERCIO);
        Cliente clie003 = new Cliente("Zenith", "SA", "05487", ClienteTipoEnum.EMPRESADECONSTRUCCION);
        Cliente clie004 = new Cliente("Adam", "Smith", "11121213", ClienteTipoEnum.PERSONA);
        Sucursal sucu001 = new Sucursal("Morty");
        Sucursal sucu002 = new Sucursal("Friedman");
        CreditoTipo prioridad = new CreditoTipo("Creditos muy subsidiados", new BigDecimal(15), new BigDecimal(100), new BigDecimal(500), 3, 7, ClienteTipoEnum.EMPRESADECONSTRUCCION);
        CreditoTipo caros = new CreditoTipo("Creditos caros", new BigDecimal(10), new BigDecimal(20), new BigDecimal(35), 1, 5, ClienteTipoEnum.COMERCIO);
        CreditoTipo hipotecarios = new CreditoTipo("Creditos para viviendas", new BigDecimal(10), new BigDecimal(500), new BigDecimal(2500), 10, 20, ClienteTipoEnum.PERSONA);
        CreditosAdmin registro = new CreditosAdmin();

        registro.add(new Credito(101, 3, prioridad, clie003, sucu001, new BigDecimal(400)));
        registro.add(new Credito(76, 15, hipotecarios, clie001, sucu002, new BigDecimal(1500)));
        registro.add(new Credito(34, 3, caros, clie002, sucu001, new BigDecimal(30)));
        System.out.println(registro);

        registro.add(new Credito(333, 11, hipotecarios, clie004, sucu002, new BigDecimal(650)));
        System.out.println("\n\n\n\nSegunda Impresion");
        System.out.println(registro);
        registro.add(new Credito(907, 3, hipotecarios, clie004, sucu001, new BigDecimal(600)));
        
        registro.ordenar();
        System.out.println("Impresion Ordenada por numero de credito");
        System.out.println(registro);
//        registro.removeRejectedCredits();
//        System.out.println("Impresion despues de remover creditos rechazados");
        System.out.println(registro);
        System.out.println("Creditos inferios a 500: ");
        System.out.println(registro.creditosInferioresA(500));
        System.out.println("Creditos superiores a 500: ");
        System.out.println(registro.creditosSuperioresA(500));
        System.out.println("Creditos por tipo de Cliente, PERSONA: ");
        System.out.println(registro.creditosPorClienteTipo(ClienteTipoEnum.PERSONA));
        System.out.println("Creditos por tipo y sucursal: ");
        System.out.println(registro.creditosPorCreditoTipoySucursal(hipotecarios, sucu002));
        System.out.println("Impresion Ordenada por Cliente: ");
        registro.ordenar(new CreditoClienteComparator());
//        Collections.sort(registro.creditosList, new CreditoClienteComparator());
        System.out.println(registro);
        registro.ordenar(new CreditoMontoADevolverComparator());
//        Collections.sort(registro.creditosList, new CreditoMontoADevolverComparator());
        System.out.println("Impresion Ordenada por Monto a Devolver");
        System.out.println(registro);
        registro.add(new Credito(158, 3, prioridad, clie003, sucu001, new BigDecimal(40000)));
    }
}
