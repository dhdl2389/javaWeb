package prj0901;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/update")
public class GoodsServletupdate extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		String newPr = request.getParameter("newPr");
		
		GoodsService s = new GoodsService();
		Goods g = new Goods(id, newPr);
		
		s.modifyGoods(g);
		
		request.setAttribute("id", id);
		request.getRequestDispatcher("WEB-INF/views/update.jsp").forward(request, response);
	}
}
