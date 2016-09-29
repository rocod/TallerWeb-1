package Modelo;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

 
@WebServlet("/CrearSession")
public class crearSession extends javax.servlet.http.HttpServlet {
private static final long serialVersionUID = 1L;
 
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 
HttpSession misession= request.getSession(true);
Persona miPersona= new Persona();
misession.setAttribute("persona",miPersona);
PrintWriter pw= response.getWriter();
pw.println("<html><body>Producto en session</body></html>");
pw.close();
 
}
}