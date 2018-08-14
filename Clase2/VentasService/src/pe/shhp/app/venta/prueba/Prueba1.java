/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.shhp.app.venta.prueba;

import pe.shhp.app.venta.dto.VentaDto;
import pe.shhp.app.venta.service.VentaService;

/**
 *
 * @author Samir Harry
 */
public class Prueba1 {
    public static void main(String[] args) {
        VentaDto dto = new VentaDto(12, 45.5);
        VentaService service = new VentaService();
        service.procesaVenta(dto);
        System.out.println("importe "+dto.getImporte());
        System.out.println("impuesto "+dto.getImpuesto());
        System.out.println("Total "+dto.getTotal());
    }
}
