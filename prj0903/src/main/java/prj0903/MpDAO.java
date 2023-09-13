package prj0903;

import java.sql.*;
import java.util.*;

public class MpDAO {

	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:testdb";
	String user = "scott";
	String password = "tiger";

	public Connection dbcon() {

		Connection con = null;

		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);

			if (con != null) {
				System.out.println("ok");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}

	private void close(AutoCloseable... autoCloseable) {
		// TODO Auto-generated method stub

		for (AutoCloseable item : autoCloseable) {
			try {
				item.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public ArrayList<String> selectAll() {

		Connection con = dbcon();

		String sql = " select * from mp_store";
		PreparedStatement pst = null;
		ResultSet rs = null;

		ArrayList<String> list = new ArrayList<>();

		try {
			pst = con.prepareStatement(sql);
			rs = pst.executeQuery();
			while (rs.next()) {
				list.add(rs.getString(1));
				list.add(rs.getString(2));
				list.add(rs.getString(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		close(con, pst, rs);
		return list;
	}

	public Store selectOne(String order_id) {

		Connection con = dbcon();
		String sql = "select * from mp_store where order_id=?";
		PreparedStatement pst = null;
		ResultSet rs = null;
		Store g = null;

		try {
			pst = con.prepareStatement(sql);
			pst.setString(1, order_id);
			rs = pst.executeQuery();

			if (rs.next() == true) {
				String order_id_Tmp = rs.getString(1);
				String user_id_Tmp = rs.getString(2);
				String item_code_Tmp = rs.getString(3);
				String wp_code_Tmp = rs.getString(4);
				String cnt_Tmp = rs.getString(5);

				g = new Store(order_id_Tmp, user_id_Tmp, item_code_Tmp, wp_code_Tmp, cnt_Tmp);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		close(con, pst, rs);
		return g;
	}

	public void insertStore(Store s) {

		Connection con = dbcon();

		String sql = "insert into mp_store values (?,?,?,?,?)";
		PreparedStatement pst = null;

		try {
			pst = con.prepareStatement(sql);
			pst.setString(1, s.getOrder_id());
			pst.setString(2, s.getUser_id());
			pst.setString(3, s.getItem_code());
			pst.setString(4, s.getWp_code());
			pst.setString(5, s.getCnt());
			pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		close(con, pst);
	}

	public void deleteOne(String Order_id) {

		Connection con = dbcon();

		String sql = "delete from mp_store where Order_id=?";
		PreparedStatement pst = null;

		try {
			pst = con.prepareStatement(sql);
			pst.setString(1, Order_id);
			pst.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		close(con, pst);
	}

	public void updateStore(Store s) {
		// TODO Auto-generated method stub

		Connection con = dbcon();

		String sql = "update mp_store set cnt=? where Order_id=?";
		PreparedStatement pst = null;

		try {
			pst = con.prepareStatement(sql);
			pst.setString(1, s.getCnt());
			pst.setString(2, s.getOrder_id());
			pst.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		close(con, pst);
	}

	public static void main(String[] args) {
		MpDAO dao = new MpDAO();

		// Goods g1 = new Goods("O001","망나니식코딩",null,"w001","8");
		// dao.insertGoods(g1);
		// System.out.println(g1);

		// Goods g2 = dao.selectOne("O001");
		// System.out.println(g2);

		// dao.deleteOne("O001");

		// dao.updateGoods(new Store("O002","10"));

	}

}
