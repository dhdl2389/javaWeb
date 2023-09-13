<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="./css/로그인.css" rel="stylesheet" />
</head>
<body>
	<div class="moveCenter">택시예약등록</div>
	<table>
		<tr>
			<td class="a">예약번호</td>
			<td class="lineUp"><input type="text" /></td>
		</tr>
		<tr>
			<td class="a">예약시간</td>
			<td class="lineUp"><input type="text" />
				<button>중복확인</button></td>
		</tr>
		<tr>
			<td class="a">예약날짜</td>
			<td class="lineUp"><input type="text" /></td>
		</tr>
		<tr>
			<td class="a">고객아이디</td>
			<td class="lineUp"><input type="text" /></td>
		</tr>
		<tr>
			<td class="a">출발지</td>
			<td class="lineUp"><input type="text" /></td>
		</tr>
		<tr>
			<td class="a">목적지</td>
			<td class="lineUp"><input type="text" /></td>
		</tr>
		<tr>
			<td class="a">택시번호</td>
			<td class="lineUp"><input type="text" /></td>
		</tr>
		<tr class = "c">
			<td class = "b">
			배차상태
			<select>
					<option>R</option>
					<option>P</option>
			</select></td>

		</tr>
	</table>
</body>
</html>