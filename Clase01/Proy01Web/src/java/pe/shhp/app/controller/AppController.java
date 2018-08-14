/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.shhp.app.controller;

import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "AppController", urlPatterns = {"/AppSumar", "/AppRestar", "/AppMultplicar", "/AppDividir"})
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
            case "/AppMultiplicar":
                appMultiplicar(request,response);
                break;
            case "/AppDividir":
                appDividir(request,response);
                break;
       }
    }

  
    public void appSumar(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        //Datos
        int n1= Integer.parseInt(request.getParameter("num1").toString());
        int n2= Integer.parseInt(request.getParameter("num2").toString());
        //Procesa
        MateService mateService = new MateService();
        int suma = mateService.sumar(n1,n2);
        //Forward
        
        
    }

 
    public void appRestar(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        super.service(req, res); //To change body of generated methods, choose Tools | Templates.
    }


    public void appMultiplicar(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        super.service(req, res); //To change body of generated methods, choose Tools | Templates.
    }

    public void appDividir(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        super.service(req, res); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
    
    
    
}
