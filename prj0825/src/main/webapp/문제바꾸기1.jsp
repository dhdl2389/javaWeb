<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>문제바꾸기</title>
</head>
<body>

	<h2>1번 문제</h2>

	<%
	String su1_ = request.getParameter("su1");
	String su2_ = request.getParameter("su2");

	int su1 = Integer.parseInt(su1_);
	int su2 = Integer.parseInt(su2_);

	int add = su1 + su2;
	int multi = su1 * su2;
	int subtract = su1 - su2;
	int division = su1 / su2;
	%>
	<p>
		<%=add%>
	</p>
	<p>
		<%=multi%>
	</p>
	<p>
		<%=subtract%>
	</p>
	<p>
		<%=division%>
	</p>


</body>
</html>