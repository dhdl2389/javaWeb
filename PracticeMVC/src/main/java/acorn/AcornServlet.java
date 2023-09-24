package acorn;

import java.io.IOException;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/acorn")
public class AcornServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		AcornService s = new AcornService();
		ArrayList<Customer> list = s.showlist();

		request.setAttribute("list", list);
		request.getRequestDispatcher("WEB-INF/views/acorn.jsp").forward(request, response);

	}
}
