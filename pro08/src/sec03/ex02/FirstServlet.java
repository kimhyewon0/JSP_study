package sec03.ex02;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/firstsev")
public class FirstServlet extends HttpServlet{
	protected void doGet(HttpServletRequest request, HttpServletResponse response)  throws  ServletException, IOException { 
      response.setContentType("text/html;charset=utf-8");
      RequestDispatcher dispatch = request.getRequestDispatcher("secondsev?name=lee");  
      dispatch.forward(request, response);
   }
}