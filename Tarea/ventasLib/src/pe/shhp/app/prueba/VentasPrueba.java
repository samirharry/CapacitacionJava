/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.shhp.app.prueba;

import pe.shhp.app.service.VentasService;

/**
 *
 * @author Samir Harry
 */
public class VentasPrueba {
    public static void main(String[] args) {
        int [] precio = {1,5,3,7,4,5};
        VentasService ventaService = new VentasService();
        int resultado = ventaService.calcularPrecio(precio);
        System.out.println("Precio total "+ resultado+" soles.");
    }
}
