package acorn;

import java.io.IOException;
import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.HTTP;

@WebServlet("/ex2")
public class ExServlet2 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int len = 0;
		PrintWriter out = response.getWriter();
		try {
			String str = request.getParameter("str");
			len = str.length();

		} catch (NullPointerException e) {
			out.println("length=>" + len);
			out.println("mission clear");
			out.close();
		}
	}

}
