package prj0901;

import java.sql.*;
import java.util.*;

public class GoodsDAO {

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
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
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

	public ArrayList<String> selectAll() {

		Connection con = dbcon();

		String sql = " select * from goodstbl";

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
		close(pst, rs, con);
		return list;
	}

	public Goods selectOne(String id) {

		Connection con = dbcon();

		String sql = "select * from goodstbl where id=?";
		PreparedStatement pst = null;
		ResultSet rs = null;
		Goods g = null;

		try {
			pst = con.prepareStatement(sql);
			pst.setString(1, id);
			rs = pst.executeQuery();

			if (rs.next() == true) {
				String id_tmp = rs.getString(1);
				String name_tmp = rs.getString(2);
				String price_tmp = rs.getString(3);

				g = new Goods(id_tmp, name_tmp, price_tmp);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		close(con, pst, rs);
		return g;

	}

	public void insertGoods(Goods g) {

		Connection con = dbcon();

		String sql = "insert into goodstbl values (?,?,?)";
		PreparedStatement pst = null;

		try {
			pst = con.prepareStatement(sql);
			pst.setString(1, g.getId());
			pst.setString(2, g.getName());
			pst.setString(3, g.getPrice());
			pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		close(con, pst);
	}

	public void deleteOne(String id) {

		Connection con = dbcon();

		String sql = "delete from goodstbl where id =?";
		PreparedStatement pst = null;

		try {
			pst = con.prepareStatement(sql);
			pst.setString(1, id);
			pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		close(con, pst);
	}

	public void updateGoods(Goods g) {

		Connection con = dbcon();

		String sql = "update goodstbl set price =? where id=?";
		PreparedStatement pst = null;

		try {
			pst = con.prepareStatement(sql);
			pst.setString(1, g.getPrice());
			pst.setString(2, g.getId());
			pst.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		close(con, pst);
	}

	public static void main(String[] args) {

		GoodsDAO dao = new GoodsDAO();

		// ArrayList<String> list = dao.selectAll();
		// System.out.println(list);

		Goods g = new Goods("test01", "test음료", "9999");
		dao.insertGoods(g);
		// System.out.println(g);

		// Goods goods = dao.selectOne("test01");
		// System.out.println(goods);

		// dao.deleteOne("c001");

		// dao.updateGoods(new Goods("c001","9999"));

	}

}
