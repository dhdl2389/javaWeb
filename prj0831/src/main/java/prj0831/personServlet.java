package prj0831;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/person")
public class personServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		ServiceP p = new ServiceP();
		ArrayList<person> list = p.getList();
		
		request.setAttribute("list", list);
		request.getRequestDispatcher("WEB-INF/views/person.jsp").forward(request, response);
		
		
	}
}
