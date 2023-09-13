package prj0901;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/checking")
public class GoodsServlettest extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String id = request.getParameter("id");

		GoodsService s = new GoodsService();
		Goods g = s.getGoods(id);

		request.setAttribute("goods", g);
		request.getRequestDispatcher("WEB-INF/views/checkgood.jsp").forward(request, response);
	}
}
