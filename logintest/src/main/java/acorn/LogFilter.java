package acorn;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

 
public class LogFilter implements Filter {
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse resp = (HttpServletResponse) response;

        HttpSession session = req.getSession();
        String userId = (String) session.getAttribute("userId");   //  ==> 이 부분도 수정되어야 함 

        if (userId != null) {
            // 사용자가 로그인한 상태이면 로그아웃 서블릿으로 이동
            chain.doFilter(request, response);
        } else {
            // 사용자가 로그인하지 않은 상태이면 홈 화면으로 리다이렉트
        	// resp.sendRedirect("/home");    => 수정
            resp.sendRedirect("/PRJ1/home");
        }
        System.out.println("로그인필터 accept");
    }
}