<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.Random"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>문제바꾸기</title>
</head>
<body>

	<h2>6번 문제</h2>

	<%
	String[] message = { "화이팅", "잠은 죽어서 자자", "시작은 시작이다", "늦었을땐 진짜 늦은거다" };
	Random ran = new Random();
	int randomIndex = ran.nextInt(message.length);
	String selmessage = message[randomIndex];
	%>
	<%
	out.println(selmessage);
	%>



</body>
</html>