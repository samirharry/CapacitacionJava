/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.shhp.app.prueba;

import pe.shhp.app.service.MateService;

/**
 *
 * @author Samir Harry
 */
public class prueba01 {
    public static void main(String[] args) {
        MateService mateService = new MateService();
        //Datos
        int n1 = 1250;
        int n2 = 15;
        //Procesa
        int suma = mateService.sumar(n1, n2);
        int diferencia = mateService.restar(n1, n2);
        int cociente = mateService.dividir(n1, n2);
        int producto = mateService.multplicar(n1, n2);
        //Escribe
        System.out.println("Número 1: "+n1);
        System.out.println("Número 2: "+n2);
        System.out.println("suma: "+suma);
        System.out.println("diferencia: "+diferencia);
        System.out.println("producto: "+producto);
        System.out.println("cociente: "+cociente);
    }
}
