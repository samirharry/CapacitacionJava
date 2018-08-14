/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.shhp.app.service;

/**
 *
 * @author Samir Harry
 */
public class VentasService {
    public int calcularPrecio(int... precio ){
        int precioTotal = 0;
        for(int i = 0;i < precio.length; i++){
            precioTotal += precio[i];
        }
        return precioTotal;
    }
    
}
