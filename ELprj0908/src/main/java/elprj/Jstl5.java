package elprj;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/jstl5")
public class Jstl5 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ArrayList<Book> books = new ArrayList<>();
		books.add(new Book("b001", "부의 인문학", 15000));
		books.add(new Book("b002", "c언어를 배우기 전 알아야 할 것들", 16000));
		books.add(new Book("b003", "빌린돈은 갚지마라", 19000));

		request.setAttribute("books", books);
		request.getRequestDispatcher("WEB-INF/views/jstl5.jsp").forward(request, response);
	}
}
