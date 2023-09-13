import javax.servlet.*;
import javax.servlet.http.*;
import gava.io.*;

public class FirstServlet extends HttpServlet {

	
	protected void service(HttpServletRequest request, HttpServletResponse response)	
	throws IOException, ServletException{
	
		System.out.println("hello servlet");
		PrintWrite out = response.getWriter();
		out.println("Hello Servlet");

  }
}