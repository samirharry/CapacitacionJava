/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.shhp.app.venta.service;

import pe.shhp.app.venta.dto.VentaDto;

/**
 *
 * @author Samir Harry
 */
public class VentaService {
    public void procesaVenta(VentaDto dto){
        //Variables
        double importe,impuesto, total;
        //Proceso
        total = dto.getPrecio()*dto.getCantidad();
        importe = total/1.8;
        impuesto = total-importe;
        //Resultado
        dto.setImporte(importe);
        dto.setImpuesto(impuesto);
        dto.setTotal(total);
    }
}
