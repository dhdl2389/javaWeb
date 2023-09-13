package MapleUpdate;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/insert")
public class WeaponInsert extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String wp_code = request.getParameter("wp_code");
		String wp_cat = request.getParameter("wp_cat");
		String wp_price = request.getParameter("wp_price");

		WeaponService s = new WeaponService();
		s.insertWp(new Weapon(wp_code, wp_cat, wp_price));

		request.getRequestDispatcher("WEB-INF/views/insert.jsp").forward(request, response);

	}
}
