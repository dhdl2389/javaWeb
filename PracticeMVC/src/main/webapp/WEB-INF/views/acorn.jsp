<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="acorn.Customer"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
tr {
	border: 1px solid black;
}
</style>
</head>
<body>
	<h2>명단 출력</h2>
	<table>

		<%
		ArrayList<Customer> list = (ArrayList<Customer>) request.getAttribute("list");
		for (Customer item : list) {
		%>

		<tr>
			<td>아이디: <%=item.getId()%></td>
			<td>비번: <%=item.getPw()%></td>
			<td>이름: <%=item.getName()%></td>
		</tr>

		<%
		}
		%>
	</table>

</body>
</html>
