package prj0903;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/reg")
public class StoreServletReg extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String order_id = request.getParameter("order_id");
		String user_id = request.getParameter("user_id");
		String item_code = request.getParameter("item_code");
		String wp_code = request.getParameter("wp_code");
		String cnt = request.getParameter("cnt");

		StoreService s = new StoreService();
		s.registerStore(new Store(order_id, user_id, item_code, wp_code, cnt));

		request.getRequestDispatcher("WEB-INF/views/check.jsp").forward(request, response);
	}
}
