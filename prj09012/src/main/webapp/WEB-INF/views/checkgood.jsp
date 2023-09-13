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
	<%
	Goods g = (Goods) request.getAttribute("goods");
	%>

	<h2>상품 조회</h2>

	<%
	if (g != null) {
	%>
	아이디:
	<%=g.getId()%>
	이름:
	<%=g.getName()%>
	가격:
	<%=g.getPrice()%>
	<%
	} else {
	%>
	상품 정보를 찾을 수 없습니다.
	<%
	}
	%>
</body>
</html>