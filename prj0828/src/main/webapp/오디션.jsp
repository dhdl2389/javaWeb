<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="./css/오디션.css" rel="stylesheet" />
<script>

function check(){
	return true;
}	
	
</script>
</head>
<body>s
	<nav>
	
<form name = "frm" action="참가자조회.jsp
" method="post" onsubmit="return check()">	
	<button id="btn1">참가자 조회</button>	
</form>

<form name = "frm" action="참가자점수조회.jsp
" method="post" onsubmit="return check()">	
	<button id="btn2">참가자 점수 조회</button>	
</form>


<form name = "frm" action="참가자등수조회.jsp
" method="post" onsubmit="return check()">	
	<button id="btn3">참가자 등수 조회</button>	
</form>
</nav>
</body>
</html>