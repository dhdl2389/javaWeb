<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>삭제하기</h2>

	<%
	String a = (String) request.getAttribute("wp_code");
	%>

	무기코드:<%=a%>
</body>
</html>