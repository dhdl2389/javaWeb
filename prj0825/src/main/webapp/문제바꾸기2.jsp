<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>문제바꾸기</title>
</head>
<body>



	<h2>2번 문제</h2>

	<%
	String numStr = request.getParameter("num");
	int num = Integer.parseInt(numStr);

	for (int i = 1; i < 10; i++) {
		int mt = num * i;
	%>
	<p>
		<%
		out.println(mt);
		%>
	</p>
	<%
	}
	%>


</body>
</html>