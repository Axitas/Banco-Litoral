/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.banco.litoral;

import java.util.ArrayList; import java.util.Comparator; import java.util.List;
public abstract class CreditosAdminAbstract {
    protected List<Credito> creditosList;
    
    public CreditosAdminAbstract(){ this.creditosList = new ArrayList(); }
    
    /** Devuelve la cantidad de elementos en creditosList */
    public int size() { return creditosList.size(); }
    /** Agrega un credito a creditosList */
    public void add(Credito c) { creditosList.add(c); }
    /**
     * Devuelve el credito ubicado en index.
     * @param index
     * @return 
     */
    public Credito get(int index) { return creditosList.get(index); }
    /**
     * Quita y devuelve el elemento ubicado index.
     * @param index
     * @return 
     */
    public Credito remove(int index) { return creditosList.remove(index); }
    
    /**
     * Devuelve todos los créditos otorgados a los clientes cuyo tipo es 
     * pasado por parámetro
     * @param tipo
     * @return 
     */
    public abstract List<Credito> creditosPorClienteTipo(ClienteTipoEnum tipo);
    
    /**
     * Devuelve todos los créditos otorgados del tipo y sucursal especificados.
     * @param tipo
     *  * @param sucursal
     * @return 
     */
    public abstract List<Credito> creditosPorCreditoTipoySucursal(CreditoTipo tipo, Sucursal sucursal);
    
    /**
     * Devuelve los créditos cuyo monto es inferior a monto.
     * @param monto
     * @return 
     */
    public abstract List<Credito> creditosInferioresA(double monto);
    
    /**
     * Devuelve los créditos cuyo monto es superior a monto.
     * @param monto
     * @return 
     */
    public abstract List<Credito> creditosSuperioresA(double monto);
    /**
     * Ordena los créditos por el criterio especificado en compareTo()
     */
    public abstract void ordenar();
    
    /**
     * Ordena los créditos por el criterio pasado por parámetro.
     * @param comparator 
     */
    public abstract void ordenar(Comparator comparator);
        
    
    /**
     * Transforma en String todas las instancias de Credito almacenadas
     * en creditosList
     * @return 
     */
    public abstract String toString();
}
