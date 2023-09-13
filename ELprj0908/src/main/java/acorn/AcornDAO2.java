package acorn;

import java.sql.*;
import java.util.*;

public class AcornDAO2 {
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:testdb";
	String user = "scott";
	String password = "tiger";

	public Connection dbcon() {

		Connection con = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			if (con != null)
				System.out.println("ok");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}

	public void close(AutoCloseable... autoCloseables) {
		for (AutoCloseable item : autoCloseables) {
			try {
				item.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public ArrayList<Student> selectAll() {
		Connection con = dbcon();

		String sql = "select * from acorntbl";

		PreparedStatement pst = null;
		ResultSet rs = null;

		ArrayList<Student> list = new ArrayList<>();

		try {
			pst = con.prepareStatement(sql);
			rs = pst.executeQuery();

			while (rs.next()) {

				String id = rs.getString(1);
				String pw = rs.getString(2);
				String name = rs.getString(3);

				list.add(new Student(id, pw, name));

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		close(con, pst, rs);
		return list;
	}

	public static void main(String[] args) {
		AcornDAO2 dao = new AcornDAO2();
		ArrayList<Student> list = dao.selectAll();
		System.out.println(list);
	}
}
