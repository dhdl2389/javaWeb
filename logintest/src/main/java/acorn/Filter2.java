package acorn;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/*@WebFilter("*.do")
public class Filter2 implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("filter2 accept");
		
		HttpServletRequest h_request = (HttpServletRequest) request;
		HttpSession session = h_request.getSession();
		HttpServletResponse h_response =(HttpServletResponse) response;
		
		if(session.getAttribute("id")!=null) {
			//요청서블릿으로 넘어감
			chain.doFilter(request, response);
		}else {
			String path = h_request.getContextPath();
			h_response.sendRedirect(path+"/login");
		}
		
		//

		
	}	

}*/
