/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
import pe.shhp.app.service.MateService;

/**
 *
 * @author Samir Harry
 */
@WebServlet(name = "AppController", urlPatterns = {"/AppSumar", "/AppRestar", "/AppMultiplicar", "/AppDividir"})
public class AppController extends HttpServlet {
    @Override
    
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String path = request.getServletPath();
       
        switch(path) {
            case "/AppSumar":
                appSumar(request,response);
                break;
            case "/AppRestar":
                appRestar(request,response);
                break;
            case "/AppMulti":
                appMultiplicar(request,response);
                break;
            case "/AppDividir":
                appDividir(request,response);
                break;
       }
    }

  
    public void appSumar(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        //Datos
        int n1= Integer.parseInt(request.getParameter("num1"));
        int n2= Integer.parseInt(request.getParameter("num2"));
        //Procesa
        MateService mateService = new MateService();
        int resultadoSuma = mateService.sumar(n1,n2);
        //Forward
        request.setAttribute("n1", n1);
        request.setAttribute("n2", n2);
        request.setAttribute("resultado", resultadoSuma);
        RequestDispatcher dispatcher;
        dispatcher = request.getRequestDispatcher("respuesta.jsp");
        dispatcher.forward(request, response);
        
    }

 
    public void appRestar(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        //Datos
        int n1= Integer.parseInt(request.getParameter("num1"));
        int n2= Integer.parseInt(request.getParameter("num2"));
        //Procesa
        MateService mateService = new MateService();
        int resultadoResta = mateService.restar(n1,n2);
        //Forward
        request.setAttribute("n1", n1);
        request.setAttribute("n2", n2);
        request.setAttribute("resultado", resultadoResta);
        RequestDispatcher dispatcher;
        dispatcher = request.getRequestDispatcher("respuesta.jsp");
        dispatcher.forward(request, response);
    }


    public void appMultiplicar(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        //Datos
        int n1= Integer.parseInt(request.getParameter("num1"));
        int n2= Integer.parseInt(request.getParameter("num2"));
        //Procesa
        MateService mateService = new MateService();
        int resultadoMultiplicacion = mateService.multiplicar(n1,n2);
        //Forward
        request.setAttribute("n1", n1);
        request.setAttribute("n2", n2);
        request.setAttribute("resultado", resultadoMultiplicacion);
        RequestDispatcher dispatcher;
        dispatcher = request.getRequestDispatcher("respuesta.jsp");
        dispatcher.forward(request, response);
    }

    public void appDividir(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        //Datos
        int n1= Integer.parseInt(request.getParameter("num1"));
        int n2= Integer.parseInt(request.getParameter("num2"));
        //Procesa
        MateService mateService = new MateService();
        int resultadoDivision = mateService.dividir(n1,n2);
        //Forward
        request.setAttribute("n1", n1);
        request.setAttribute("n2", n2);
        request.setAttribute("resultado", resultadoDivision);
        RequestDispatcher dispatcher;
        dispatcher = request.getRequestDispatcher("respuesta.jsp");
        dispatcher.forward(request, response);
    } 
}
