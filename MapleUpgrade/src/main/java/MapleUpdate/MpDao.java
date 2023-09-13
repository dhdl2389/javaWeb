package MapleUpdate;

import java.sql.*;

public class MpDao {

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

	public void insertWeapon(Weapon w) {

		Connection con = dbcon();

		String sql = "insert into mp_wp values(?,?,?)";
		PreparedStatement pst = null;

		try {
			pst = con.prepareStatement(sql);
			pst.setString(1, w.getWp_code());
			pst.setString(2, w.getWp_cat());
			pst.setString(3, w.getWp_price());
			pst.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		close(con, pst);

	}

	public Weapon selectOne(String wp_code) {

		Connection con = dbcon();

		String sql = "select * from mp_wp where wp_code=?";
		PreparedStatement pst = null;
		ResultSet rs = null;
		Weapon w = new Weapon();

		try {
			pst = con.prepareStatement(sql);
			pst.setString(1, wp_code);

			rs = pst.executeQuery();

			if (rs.next() == true) {

				String wp_code_tmp = rs.getString(1);
				String wp_cat_tmp = rs.getString(2);
				String wp_price_tmp = rs.getString(3);

				w = new Weapon(wp_code_tmp, wp_cat_tmp, wp_price_tmp);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		close(con, rs, pst);
		return w;
	}

	public void deleteOne(String wp_code) {

		Connection con = dbcon();

		String sql = "delete from mp_wp where wp_code=?";
		PreparedStatement pst = null;

		try {
			pst = con.prepareStatement(sql);
			pst.setString(1, wp_code);
			pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		close(con, pst);
	}

}
