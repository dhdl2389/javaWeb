package MapleUpdate;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/delete")
public class WeaponDelete extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String wp_code = request.getParameter("wp_code");
		WeaponService s = new WeaponService();
		s.deleteOne(wp_code);

		Weapon w = s.getWeapon(wp_code);
		
		request.setAttribute("wp_code", wp_code);
		request.getRequestDispatcher("WEB-INF/views/delete.jsp").forward(request, response);
	}
}
