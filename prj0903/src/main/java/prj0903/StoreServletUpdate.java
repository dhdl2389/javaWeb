package prj0903;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/update")
public class StoreServletUpdate extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String id = request.getParameter("order_id");
		String cnt = request.getParameter("cnt");

		StoreService ss = new StoreService();
		Store s = new Store (id, cnt);
		
		ss.updateStore(s);
		
		request.setAttribute(id, "id");
		request.getRequestDispatcher("WEB-INF/views/update.jsp").forward(request, response);
	}
}
