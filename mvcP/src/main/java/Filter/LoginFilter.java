package Filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter("*.do")
public class LoginFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		
		HttpServletRequest h_request = (HttpServletRequest)request;
		HttpServletResponse h_response = (HttpServletResponse)response;
		
		HttpSession session = h_request.getSession();
		
		//교수님 코드  : 이해하지말고 흐름을 느끼시오.
		if(session.getAttribute("Id") != null) {
			chain.doFilter(request, response);
		}else {
			String path = h_request.getContextPath();
			h_response.sendRedirect(path+"/login");
			
		}
		
	}
}
