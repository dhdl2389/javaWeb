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

	<h2>7번 문제</h2>
	<%
	String[] randomimg = { "<img src = \"/PRJ/img/초롱이.jpg\">", "<img src = \"/PRJ/img/img.jpg\">",
			"<img src = \"/PRJ/img/img2.jpg\">"

	};
	Random ran = new Random();
	int randomIndex = ran.nextInt(randomimg.length);
	String selimg = randomimg[randomIndex];
	%>
	<%
	out.println(selimg);
	%>


</body>
</html>