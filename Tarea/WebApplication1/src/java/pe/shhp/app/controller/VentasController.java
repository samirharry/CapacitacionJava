package pe.shhp.app.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pe.shhp.app.service.VentasService;

@WebServlet(name = "VentasController", urlPatterns = {"/AppPrecios"})
public class VentasController extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String path = request.getServletPath();
        
        switch(path) {
            case "/AppPrecios" :
                calcularPrecioTotal(request, response);
                break;
        }
        
    }
    public void calcularPrecioTotal(ServletRequest request,  ServletResponse response) throws ServletException, IOException {
        //Datos
        int [] precio =  new int [20];
        precio[0] = Integer.parseInt(request.getParameter("prec1"));
        precio[1] = Integer.parseInt(request.getParameter("prec2"));
        precio[2] = Integer.parseInt(request.getParameter("prec3"));
        //Proceso
        VentasService ventasService = new VentasService();
        int montoTotal = ventasService.calcularPrecio(precio);
        //Forward
        request.setAttribute("precio1", precio[0]);
        request.setAttribute("precio2", precio[1]);
        request.setAttribute("precio3", precio[2]);
        request.setAttribute("resultado", montoTotal);
        RequestDispatcher dispatcher;
        dispatcher = request.getRequestDispatcher("respuesta.jsp");
        dispatcher.forward(request, response);
    }
 
}
