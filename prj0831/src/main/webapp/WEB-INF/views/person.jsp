<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<%@ page import="java.util.ArrayList" %>
<%@ page import="prj0831.person"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h2>신상확인</h2>
	
	<%
	ArrayList<person> list = (ArrayList<person>) request.getAttribute("list");

	for (person p : list) {
		out.println( p + "<br>");
		//out.println(p.getName());
		//out.println(p.getHeight());
		//out.println(p.getWeight());
	}
	%>

</body>
</html>