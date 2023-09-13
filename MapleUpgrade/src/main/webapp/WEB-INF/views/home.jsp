<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	환영합니다
	<%
String id = (String) session.getAttribute("id");
if (id == null) {
%>
	<a href="/MapleUpgrade/login">로그인 </a>
	<%
	} else {
	%>
	<%=id%>
	<a href="/MapleUpgrade/logout"> 로그아웃 </a>
	<a href="/MapleUpgrade/order"> 주문하기 </a>
	<%
	}
	%>
</body>
</html>