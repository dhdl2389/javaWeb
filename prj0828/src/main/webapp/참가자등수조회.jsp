<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>참가자 조회</title>
<link href="./css/참가자등수조회.css" rel="stylesheet" />
</head>
<body>
    <h2>참가자점수 조회</h2>

    <table>
        <tr>
            <td>참가자ID</td>
            <td>참가자이름</td>
            <td>종합점수</td>
            <td>평균점수</td>
            <td>순위</td>
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

            String sql = "select jo.JOIN_ID , jo.JOIN_NM , ";
            sql += "sum(sc.score) , ";
            sql += "round(avg(sc.SCORE),2) , rank() over(order by  round(avg(sc.SCORE),2) desc)  ";
            sql += "from tbl_score_200 sc ";
            sql += "join tbl_join_200 jo on sc.artistid = jo.JOIN_ID ";
            sql += "group by jo.JOIN_ID, jo.JOIN_NM";

            rs = st.executeQuery(sql);

            while (rs.next()) {
        %>
        <tr>
            <td><%=rs.getString(1)%></td>
            <td><%=rs.getString(2)%></td>
            <td><%=rs.getString(3)%></td>
            <td><%=rs.getString(4)%></td>
            <td><%=rs.getString(5)%></td>
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