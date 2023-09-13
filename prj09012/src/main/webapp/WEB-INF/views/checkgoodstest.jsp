<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="prj0901.Goods"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>상품조회</h2>
	
	<%Goods g = (Goods)request.getAttribute("goods"); %>
	<%=g.getId() %>
	

</body>
</html>