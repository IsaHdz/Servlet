package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "muestraSuma", urlPatterns = {"/muestraSuma"})
public class muestraSuma extends HttpServlet {
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter() ) {
        String n1=request.getParameter("num1");
        String n2=request.getParameter("num2");
          model.Suma s=new model.Suma(n1,n2);
          model.Suma s2=new model.Suma(n1,n2);
          s.hacerSuma();
          int resultado=s.getResultado();
          s2.perimetro();
          int resultado2=s.getResultado();
          request.setAttribute("sumaResuelta", s);
          request.setAttribute("perimetro", s2);
          request.getRequestDispatcher("/muestraResultado.jsp").forward(request, response);
}
}

@Override
protected void doPost(HttpServletRequest request, HttpServletResponse response)
         throws ServletException, IOException {
    processRequest (request, response);
}

@Override
public String getServletInfo() {
    return "Short description";
}
}