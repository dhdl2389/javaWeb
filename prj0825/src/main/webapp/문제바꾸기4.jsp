<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>문제바꾸기</title>
</head>
<body>

	<h2>4번 문제</h2>
	<%
	String Star = request.getParameter("str");
	int str = Integer.parseInt(Star);
	for (int i = 1; i <= str; i++) {
		for (int j = 1; j <= i; j++) {
	%>
	<%
	out.print("*");
	%>
	<%
	}
	out.println("<br>");
	%>
	<%
	}
	%>



</body>
</html>