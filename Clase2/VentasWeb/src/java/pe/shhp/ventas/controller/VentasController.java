/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.shhp.ventas.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pe.shhp.app.venta.dto.VentaDto;
import pe.shhp.app.venta.service.VentaService;

/**
 *
 * @author Samir Harry
 */
@WebServlet(name = "VentasController", urlPatterns = {"/VentasProcesar"})
public class VentasController extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            //Datos
            double precio = Double.parseDouble(request.getParameter("precio"));
            int cantidad = Integer.parseInt(request.getParameter("cantidad"));
            //Procesar
            VentaDto dto = new VentaDto(cantidad, precio);
            VentaService service = new VentaService();
            service.procesaVenta(dto);
            //Datos para la vista
            request.setAttribute("dto", dto);
            request.setAttribute("importe", dto.getImporte());
            request.setAttribute("impuesto", dto.getImpuesto());
            request.setAttribute("total", dto.getTotal());
            
        } catch (Exception e) {
            //En caso de error
            request.setAttribute("error", e.getMessage());
           
        }
        //Forward
        RequestDispatcher dispatcher;
        dispatcher = request.getRequestDispatcher("index.jsp");
        dispatcher.forward(request, response);
        
        
    }
    
}
