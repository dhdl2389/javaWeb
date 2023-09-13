package prj0901;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/deleteOne")
public class deleteGoodsServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String id = request.getParameter("id");

		GoodsService s = new GoodsService();
		s.deleteGoods(id);

		Goods c = s.getGoods(id);
		request.setAttribute("id", id);
		request.getRequestDispatcher("WEB-INF/views/delete.jsp").forward(request, response);

	}
}
