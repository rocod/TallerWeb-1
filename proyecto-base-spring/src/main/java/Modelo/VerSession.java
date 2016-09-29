package Modelo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/VerSession")
public class VerSession extends HttpServlet {
private static final long serialVersionUID = 1L;
 
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
HttpSession misession= (HttpSession) request.getSession();
 
Persona miPersona= (Persona) misession.getAttribute("persona");
 
PrintWriter pw= response.getWriter();
pw.println("<html><body>"+ miPersona.getNombre()+ "," +miPersona.getNombre());
pw.close();
}
}