<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>3단구하기 1번</h2>

<%
	for( int i=1; i<=9; i++){
%>
	<p> <% out.println(3*i); %>  </p>
<%
	}
%>

<%
for(int i=0; i<=9; i++){
%>
<p> <%=3*i %></p>
<%
}%>


	<h2>3단구하기 2`번</h2>

<%
	for( int i=1; i<=9; i++){
%>
	<p> <%=3*i %>  </p>
<%
	}
%>

</body>
</html>