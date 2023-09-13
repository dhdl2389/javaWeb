package testelprj;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ex05")
public class Ex05 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String[] bookNames = { "소설", "역사", "인문", "정치", "미술", "종교", "여행", "과학" };

		request.setAttribute("bookNames", bookNames);
		request.getRequestDispatcher("WEB-INF/views/ex05.jsp").forward(request, response);
	}
}
