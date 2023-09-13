package page;

import java.io.IOException;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/coffee.page")
public class CoffeeServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String p = request.getParameter("p");
		int currentPage = 1;

		if (p != null) {
			currentPage = Integer.parseInt(p);
		}

		CoffeeDAO dao = new CoffeeDAO();
		int totRecords = dao.getTotalCnt();
		int pageSize = 5;
		int grpSize = 4;

		PageHandler2 handler = new PageHandler2(currentPage, totRecords, pageSize, grpSize);
		ArrayList<Coffee> list = dao.getListPage(currentPage, pageSize);

		request.setAttribute("list", list);
		request.setAttribute("handler", handler);

		request.getRequestDispatcher("WEB-INF/views/coffeepage.jsp").forward(request, response);

	}
}
