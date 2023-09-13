package login_09_5;

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

		// 로그인처리 사용자인지 확인해야함, dao가 필요함

		// 아이디와 비번이 동일하면 정상로그인
		// 아니면 다시 로그인화면으로
		String id = request.getParameter("id").trim();
		String pw = request.getParameter("pwd").trim();

		System.out.println(id);
		System.out.println(pw);

		// 아이디와 비번이 동일하면 정상로그인으로 간주
		if (id.equals(pw)) {
			// 메인페이지로 이동
			// 로그인성공 시 ==> 세션저장소에 아이디를 저장해 놓음
			HttpSession session = request.getSession();
			
			session.setAttribute("id", id);
			
			response.sendRedirect("/login_09_5/home");
		} else {
			response.sendRedirect("/login_09_5/login");
		}

	}

}
