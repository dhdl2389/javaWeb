<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>구구단 계산</title>
</head>
<body>
	<h1>구구단 계산</h1>
	<form action="/testelprj/gugudan" method="post">
		<label for="number">숫자 입력:</label> <input type="text" id="number"
			name="number"> <input type="submit" value="계산">
	</form>
	<%
	String error = (String) request.getAttribute("error");
	%>
	<%
	if (error != null) {
	%>
	<p style="color: red;"><%=error%></p>
	<%
	}
	%>
</body>
</html>