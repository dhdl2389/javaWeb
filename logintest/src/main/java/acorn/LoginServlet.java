package acorn;

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
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	 
    	  req.getRequestDispatcher("/WEB-INF/views/loginResult.jsp").forward(req, resp);
    	
    }


    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 사용자가 입력한 ID와 비밀번호를 가져옵니다.
    	LoginService s = new LoginService();
        String inputId = req.getParameter("id");
        String inputPw = req.getParameter("pw");

        // 로그인 서비스를 통해 로그인을 처리합니다.
        boolean loginResult = s.loginUser(inputId, inputPw);

        if (loginResult) {
            // 로그인 성공 시
        	HttpSession session = req.getSession();
            session.setAttribute("id", inputId);
            req.setAttribute("message", "로그인 성공!");
            resp.sendRedirect("/PRJ1/home");
        } else {
            // 로그인 실패 시
            req.setAttribute("message", "로그인 실패. 아이디 또는 비밀번호를 확인하세요.");
            req.getRequestDispatcher("/WEB-INF/views/loginResult.jsp").forward(req, resp);
        }

        // 로그인 결과를 화면에 표시하는 JSP로 포워딩합니다.
       
    }
}