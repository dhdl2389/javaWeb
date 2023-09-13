<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.*"%>
<%@page import="prj0907.Acorn"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


	<table>
		<tr>
			<td>아이디</td>
			<td>비번</td>
			<td>이름</td>
			<td></td>
		</tr>

		<%
		ArrayList<Acorn> list = (ArrayList<Acorn>) request.getAttribute("list");
		for (Acorn a : list) {
		%>
		<tr>
			<td><%=a.getId()%></td>
			<td><%=a.getPw()%></td>
			<td><%=a.getName()%></td>

		</tr>
		<%
		}
		%>

	</table>

</body>
</html>