package MapleUpdate;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.getRequestDispatcher("WEB-INF/views/login.jsp").forward(request, response);

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String id = request.getParameter("id").trim();
		String pw = request.getParameter("pw").trim();

		System.out.println(id);
		System.out.println(pw);

		if (id.equals(pw)) {

			HttpSession session = request.getSession();
			
			session.setAttribute("id", id);
			
			response.sendRedirect("/MapleUpgrade/home");
		} else {

			response.sendRedirect("/MapleUpgrade/login");
		}
	}
}
