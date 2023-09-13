<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="prj0907.Acorn2"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h2>명단출력</h2>

	<%
	ArrayList<Acorn2> list = (ArrayList<Acorn2>) request.getAttribute("list");

	for (Acorn2 item : list) {
		out.println(item.getId());
		out.println(item.getPw());
		out.println(item.getName() + "<br>");
	}
	%>

</body>
</html>