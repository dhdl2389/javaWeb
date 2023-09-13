package prj0901;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/search")
public class GoodsServletgood extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// 사용자로부터 정보 꺼내오기
		String id = request.getParameter("id");
		// 모델
		GoodsService s = new GoodsService();
		//
		Goods g = s.getGoods(id);

		// 모델심기
		request.setAttribute("goods", g);
		request.getRequestDispatcher("WEB-INF/views/checkgood.jsp").forward(request, response);
	}
}
