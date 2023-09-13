<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h2>정보가 수정 되었습니다.</h2>
	
	<%
	String u = (String)request.getAttribute("id");
	%>
	
	<%=u %>
</body>
</html>