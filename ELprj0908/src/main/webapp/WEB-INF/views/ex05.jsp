<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>좋아하는 것</h2>
	<table>
		<tr>
			<td></td>
		</tr>

		<c:forEach var="item" items="${bookNames }">
		${item }
		</c:forEach>

		<tr>
			<td></td>
		</tr>
	</table>

	<table>
		<h2>좋아하는 것 2</h2>
		<c:forEach var="item" items="${bookNames }">
	    ${item }
	    </c:forEach>
	</table>


</body>
</html>