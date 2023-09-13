package testelprj;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ex08")
public class Ex08 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ArrayList<Coffee> list = new ArrayList<>();

		list.add(new Coffee("C001", "아메리카노", 3000));
		list.add(new Coffee("C002", "꿀메리카노", 4000));
		list.add(new Coffee("C003", "헤이즐넛", 5000));
		list.add(new Coffee("C004", "아포카토", 6000));
		list.add(new Coffee("C005", "에스프레소", 7000));

		request.setAttribute("list", list);
		request.getRequestDispatcher("WEB-INF/views/ex08.jsp").forward(request, response);
	}
}
