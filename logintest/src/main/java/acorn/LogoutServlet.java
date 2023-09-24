package acorn;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("dkfkdfd");
		  HttpSession session = req.getSession();
		  String id   =(String) session.getAttribute("id");
		 if (id != null) {
			 
			 System.out.println(" id ");
            session.invalidate();
        }
        // 로그아웃 후 홈 화면으로 리다이렉트
		//resp.sendRedirect("/PRJ1/home");
		System.out.println("dkdfkfdkf");
		resp.sendRedirect("/PRJ1/home"); 
	}
}