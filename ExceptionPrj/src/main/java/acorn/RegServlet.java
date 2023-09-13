package acorn;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/acornReg")
public class RegServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.getRequestDispatcher("WEB-INF/views/joinus.jsp").forward(request, response);

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// 사용자정보 가져오기
		// Customer 객체만들기
		// 서비스의 registerCustomer() 매서드 호출하기
		// 홈 화면으로 sendRedirect()
		request.setCharacterEncoding("UTF-8");

		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset = utf-8");

		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");

		// PrintWriter out = response.getWriter();
		// out.println(name);

		Customer c = new Customer(id, pw, name);
		AcornService s = new AcornService();
		try {
			s.registerCustomer(c);
			request.getRequestDispatcher("WEB-INF/views/regOk.jsp").forward(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			request.getRequestDispatcher("WEB-INF/views/dberr.jsp").forward(request, response);

		}

	}

}
