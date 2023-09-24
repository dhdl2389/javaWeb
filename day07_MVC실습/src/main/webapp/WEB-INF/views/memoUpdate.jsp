<%@page import="TodoMemo.BoardMemoService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page import="java.util.*"%>


<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>메모 수정</h2>
	<%
	String m_code = (String) request.getAttribute("updateM");
	String m_contents = (String) request.getAttribute("updateM1");
	out.println(m_code);
	out.println(m_contents);
	%>

	<form action="<%=request.getContextPath()%>/inquiryM" method="get">
		<input type="hidden" name="m_code" value=" ">
		<textarea name="updateM" rows="4" cols="50"> </textarea>
		<br> <input type="submit" value="수정">
	</form>


</body>
</html>
