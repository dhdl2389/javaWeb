<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>참가자 조회</title>
<link href="./css/참가자점수조회.css" rel="stylesheet" />
</head>
<body>
    <h2>참가자점수 조회</h2>

    <table>
        <tr>
            <td>계좌번호</td>
            <td>참가자ID</td>
            <td>참가자이름</td>
            <td>생년월일</td>
            <td>점수</td>
            <td>등급</td>
            <td>멘토이름</td>
        </tr>
        <%
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            String driver = "oracle.jdbc.driver.OracleDriver";
            String url = "jdbc:oracle:thin:@localhost:1521:testdb";
            String user = "scott";
            String password = "tiger";

            Class.forName(driver);
            con = DriverManager.getConnection(url, user, password);
            st = con.createStatement();

            String sql = "select sc.SCORE_NO , sc.artistid , jo.JOIN_NM , ";
            sql += "to_char(to_date(jo.birth, 'yyyy-mm-dd'), 'yyyy\"년\"mm\"월\"dd\"일\"') , ";
            sql += "sc.SCORE , ";
            sql += "case ";
            sql += "when sc.score >= 90 then 'A' ";
            sql += "when sc.score >= 80 then 'B' ";
            sql += "when sc.score >= 70 then 'C' ";
            sql += "else 'D' end as 등급, ";
            sql += "men.MENTOR_NM as 멘토이름 ";
            sql += "from tbl_mentor_200 men ";
            sql += "join tbl_score_200 sc on men.MENTOR_ID = sc.MENTORID ";
            sql += "join tbl_join_200 jo on sc.ARTISTID = jo.join_id";

            rs = st.executeQuery(sql);

            while (rs.next()) {
        %>
        <tr>
            <td><%=rs.getString(1)%></td>
            <td><%=rs.getString(2)%></td>
            <td><%=rs.getString(3)%></td>
            <td><%=rs.getString(4)%></td>
            <td><%=rs.getString(5)%></td>
            <td><%=rs.getString(6)%></td>
            <td><%=rs.getString(7)%></td>
        </tr>
        <%
        }
        } catch (Exception e) {
        e.printStackTrace();
        } finally {
        if (rs != null)
            rs.close();
        if (st != null)
            st.close();
        if (con != null)
            con.close();
        }
        %>
    </table>
</body>
</html>