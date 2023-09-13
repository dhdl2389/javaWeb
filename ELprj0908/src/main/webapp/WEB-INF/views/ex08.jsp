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

	<table>
		<tr>
			<td>코드</td>
			<td>이름</td>
			<td>가격</td>
		</tr>

		<c:forEach var="Coffee" items="${list }">
			<tr>
				<td>${Coffee.code}</td>
				<td>${Coffee.name}</td>
				<td>${Coffee.price}</td>
			</tr>
		</c:forEach>
	</table>


</body>
</html>