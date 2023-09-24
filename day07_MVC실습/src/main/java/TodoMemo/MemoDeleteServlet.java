
package TodoMemo;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/deleteM")
public class MemoDeleteServlet extends HttpServlet{
	
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	//삭제
	String del = req.getParameter("del");
	System.out.println(del);
	
	BoardMemoService m = new BoardMemoService();
	m.deleteMemo(del);
	resp.sendRedirect(req.getContextPath()+"/inquiryM");
	
}
}

