package page;

import java.sql.*;
import java.util.*;



public class CoffeeDAO {

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

	public int getTotalCnt() {

		Connection con = dbcon();
		PreparedStatement pst = null;
		ResultSet rs = null;

		int totalCnt = 0;
		String sql = "select count(*) from coffeetbl";

		try {
			pst = con.prepareStatement(sql);
			rs = pst.executeQuery();

			if (rs.next()) {
				totalCnt = rs.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		close(con, pst, rs);
		return totalCnt;
	}

	public ArrayList<Coffee> getRealList() {

		Connection con = dbcon();
		String sql = "select * from coffeetbl";
		PreparedStatement pst = null;
		ResultSet rs = null;

		ArrayList<Coffee> list = new ArrayList<>();

		try {
			pst = con.prepareStatement(sql);
			rs = pst.executeQuery();

			while (rs.next()) {
				String code = rs.getString(1);
				String name = rs.getString(2);
				int price = rs.getInt(3);

				Coffee c = new Coffee(code, name, price);
				list.add(c);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		close(con, pst, rs);
		return list;
	}

	public ArrayList<Coffee> getListPage(int page, int pageSize) {

		int startPage = 6, endPage = 10;
		startPage = ((page - 1) * pageSize) + 1;
		endPage = page * pageSize;

		Connection con = dbcon();
		PreparedStatement pst = null;
		ResultSet rs = null;

		String sql = "select *\r\n" 
		+ "from(select rownum num, code, name, price from coffeetbl)\r\n"
				+ "where num between ? and ?";
		System.out.println(sql);
		ArrayList<Coffee> list = new ArrayList<>();

		try {
			pst = con.prepareStatement(sql);
			pst.setInt(1, startPage);
			pst.setInt(2, endPage);
			rs = pst.executeQuery();

			while (rs.next()) {

				String code = rs.getString(2);
				String name = rs.getString(3);
				int price = rs.getInt(4);

				Coffee c = new Coffee(code, name, price);
				list.add(c);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		close(con, pst, rs);
		return list;
	}

	public static void main(String[] args) {
		CoffeeDAO dao = new CoffeeDAO();

		//int result = dao.getTotalCnt();
		//System.out.println(result);

		//ArrayList<Coffee> list = dao.getRealList();
		//System.out.println(list);
		
		ArrayList<Coffee> list = dao.getListPage(1, 5);
		System.out.println(list);
	}
}
