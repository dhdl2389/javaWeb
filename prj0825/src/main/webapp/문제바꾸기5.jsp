<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>문제바꾸기</title>
</head>
<body>

	<h2>5번 문제</h2>
	<%
	String num1 = request.getParameter("num");
	int num = Integer.parseInt(num1);
	for (int i = 1; i <= num; i++) {
		if (num % i == 0) {
	%>
	<%
	out.println(i);
	%>
	<%
	}
	%>
	<%
	}
	%>




</body>
</html>