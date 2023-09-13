package prj0901;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/reg")
public class GoodsServletReg extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String price = request.getParameter("price");

		GoodsService g = new GoodsService();
		g.registerGoods(new Goods(id, name, price));

		request.getRequestDispatcher("WEB-INF/views/check.jsp").forward(request, response);
	}
}
