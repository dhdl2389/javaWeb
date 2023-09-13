package prj0831;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/mvc6")
public class MVCServlet6 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		ServiceMVC6 service = new ServiceMVC6();
		String result = service.getMessage();
		
		request.setAttribute("r", result);
		request.getRequestDispatcher("WEB-INF/views/mvc6.jsp").forward(request, response);
		
	}
}
