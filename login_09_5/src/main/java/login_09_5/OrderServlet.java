package login_09_5;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/order")
public class OrderServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// 주문요청시
		// 로그인상태 확인 후 주문정보를 보여주거나 아니면 로그인화면으로 이동

		// 세션저장소에서 id값을 확인 후 로그인 상태 여부 확인
		HttpSession session = request.getSession();
		String id = (String) session.getAttribute("id");

		if (id != null) { // 로그인 상태이면 주문페이지가 응답 될 수 있도록 한다. - 화면이동
			// 해당고객의 주문목록 가져오기
			// 서비스, dao
			request.getRequestDispatcher("WEB-INF/views/order.jsp").forward(request, response);
			

		} else { // 로그인화면으로 이동
			response.sendRedirect("/login_09_5/login");
			
		}

	}
}
