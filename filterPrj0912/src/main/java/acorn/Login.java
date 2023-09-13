package acorn;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class Login extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.getRequestDispatcher("WEB-INF/views/login.jsp").forward(request, response);

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String id = request.getParameter("id");
		String pw = request.getParameter("pw");

		System.out.println(id);
		System.out.println(pw);

		if (isValid(id, pw)) { // 정상적인 id,pw
			// 세션등록
			HttpSession session = request.getSession();
			session.setAttribute("id", id);
			response.sendRedirect("/filterPrj0912/home");
		} else {
			request.getRequestDispatcher("WEB-INF/views/login.jsp").forward(request, response);
		}
	}

	boolean isValid(String id, String pw) {
		boolean result = false;
		if (id.equals(pw))
			result = true;
		return result;
	}
}
