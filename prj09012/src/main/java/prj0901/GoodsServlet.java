package prj0901;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Goods")
public class GoodsServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		GoodsService s = new GoodsService();
		ArrayList<String> list = s.getGoodsRealList();
		System.out.println(list);
		
		request.setAttribute("list", list);
		request.getRequestDispatcher("WEB-INF/views/goods.jsp").forward(request, response);
	}
}
