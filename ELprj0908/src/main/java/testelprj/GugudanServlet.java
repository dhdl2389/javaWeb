package testelprj;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/gugudan")
public class GugudanServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 사용자가 입력한 숫자를 가져옵니다.
		String inputNumberStr = request.getParameter("number");

		try {
			// 입력값을 정수로 변환합니다.
			int number = Integer.parseInt(inputNumberStr);

			// 구구단 계산 결과를 배열로 저장합니다.
			int[] gugudan = new int[9];
			for (int i = 0; i < 9; i++) {
				gugudan[i] = number * (i + 1);
			}

			// 결과를 request에 저장합니다.
			request.setAttribute("number", number);
			request.setAttribute("gugudan", gugudan);

			// JSP 페이지로 포워딩합니다.
			request.getRequestDispatcher("WEB-INF/views/gugudan.jsp").forward(request, response);
		} catch (NumberFormatException e) {
			// 유효하지 않은 입력일 경우 에러 메시지를 설정하고 다시 입력 폼으로 리다이렉트합니다.
			request.setAttribute("error", "유효한 숫자를 입력하세요.");
			response.sendRedirect(request.getContextPath() + "WEB-INF/views/gugudan-form.jsp");
		}
	}
}