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
			<td><c:forEach var="i" begin="1" end="9">
					<c:forEach var="j" begin="1" end="9">
						<h2>${i*j }
						</h2>
					</c:forEach>
				</c:forEach></td>
		</tr>
	</table>

</body>
</html>