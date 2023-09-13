<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <h2>나의 버킷 리스트</h2>
 
 <%String result = (String)request.getAttribute("r"); 
 out.println(result);%>
 
</body>
</html>