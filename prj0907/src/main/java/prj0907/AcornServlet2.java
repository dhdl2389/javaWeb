package prj0907;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/acorn2")
public class AcornServlet2 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		AcornService2 s = new AcornService2();

		ArrayList<Acorn2> list = s.getRealMemberList();

		request.setAttribute("list", list);
		request.getRequestDispatcher("WEB-INF/views/AcornList2.jsp").forward(request, response);
	}
}
