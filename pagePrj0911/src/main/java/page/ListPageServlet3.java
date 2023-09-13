package page;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/list3.page")
public class ListPageServlet3 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String p = request.getParameter("p");
		int currentPage = 1;
		if (p != null) {
			currentPage = Integer.parseInt(p);
		}

		MemberDAO2 dao = new MemberDAO2();
		int totRecords = dao.getTotalCnt();
		int pageSize = 2;
		int grpSize = 4; // [1] [2] [3] [4] [다음]

		// 페이징을 위한 값들
		PageHandler handler = new PageHandler(currentPage, totRecords, pageSize, grpSize);
		ArrayList<Member> list = dao.getListPage(currentPage, pageSize);

		// 현재페이지에대한 목록list
		request.setAttribute("list", list);
		request.setAttribute("handler", handler);
		
		
		request.getRequestDispatcher("WEB-INF/views/listPage3.jsp").forward(request, response);

	}
}
