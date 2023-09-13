<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@page import="java.util.*"%>
<%@page import="page.PageHandler2"%>
<%@page import="page.Coffee"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	PageHandler2 handler = (PageHandler2) request.getAttribute("handler");

	ArrayList<Coffee> list = (ArrayList<Coffee>) request.getAttribute("list");
	%>

	<table>
		<tr>
			<td>코드명</td>
			<td>상품명</td>
			<td>가격</td>
		</tr>
	</table>

	<%
	for (Coffee c : list) {
	%>
	<table>
		<tr>
			<td><%=c.getCode()%></td>
			<td><%=c.getName()%></td>
			<td><%=c.getPrice()%></td>
		</tr>
		<%
		}
		%>
	</table>

	<%
	int index = handler.getGrpStartPage();

	if (handler.getCurrentGrp() > 1) {
	%>
	<a href="/pagePrj0911/coffee.page?p=<%=index - 1%>">[이전]</a>
	<%
	}
	while (index <= handler.getGrpEndPage()) {
	%>

	<a href="/pagePrj0911/coffee.page?p=<%=index%>">[<%=index%>]
	</a>
	<%
	index++;
	}

	if (handler.getGrpEndPage() < handler.getTotalPage()) {
	%>

	<a href="/pagePrj0911/coffee.page?p=<%=index + 1%>">[다음]</a>

	<%
	}
	%>



</body>
</html>