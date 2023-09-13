<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>구구단 결과</title>
</head>
<body>
	<h1>구구단 결과</h1>
	<p><%=request.getAttribute("number")%>님의 구구단 결과:
	</p>
	<table border="1">
		<tr>
			<th>곱하는 수</th>
			<th>계산 결과</th>
		</tr>
		<%
		int[] gugudan = (int[]) request.getAttribute("gugudan");
		%>
		<%
		for (int i = 0; i < gugudan.length; i++) {
		%>
		<tr>
			<td><%=i + 1%></td>
			<td><%=gugudan[i]%></td>
		</tr>
		<%
		}
		%>
	</table>
</body>
</html>