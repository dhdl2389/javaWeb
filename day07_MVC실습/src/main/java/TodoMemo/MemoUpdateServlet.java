package TodoMemo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/updateM")
public class MemoUpdateServlet extends HttpServlet {



	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String code = req.getParameter("m_code");
		String contents = req.getParameter("m_contents");
		
		// 수정
		BoardMemoService m = new BoardMemoService();
		m.modifyMemo(code, contents);

	

		req.setAttribute("updateM", code);
		req.setAttribute("updateM1", contents);
		req.getRequestDispatcher("WEB-INF/views/memoUpdate.jsp").forward(req, resp);
	}
	
}
