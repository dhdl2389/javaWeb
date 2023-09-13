package cartPrj;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/addCart")
public class addCartServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String code = request.getParameter("code");
		System.out.println(code);

		// request.getRequestDispatcher("WEB-INF/views/addCart.jsp").forward(request,
		// response);
		// 세션에 저장하기

		HttpSession session = request.getSession();
		Object cartList = session.getAttribute("cartList");

		if (cartList != null) {

			ArrayList<String> list = (ArrayList<String>) cartList;
			list.add(code);

		} else {
			//
			ArrayList<String> list = new ArrayList<>();
			list.add(code);
			session.setAttribute("cartList", list);
		}
		
		response.sendRedirect("/cartPrj/home");
		
	}
}
