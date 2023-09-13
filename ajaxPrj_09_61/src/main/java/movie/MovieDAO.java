package movie;

import java.sql.*;

import java.util.ArrayList;

public class MovieDAO {
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:testdb";
	String user = "scott";
	String password = "tiger";;

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

	public ArrayList<Movie> selectAll() {

		Connection con = dbcon();

		// sql
		String sql = "select * from movietbl";

		ArrayList<Movie> list = new ArrayList<>();

		try {
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();

			while (rs.next()) {
				String name = rs.getString(1);
				String price = rs.getString(2);
				String grade = rs.getString(3);

				Movie m = new Movie(name, price, grade);
				list.add(m);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}

	public ArrayList<Movie> getMovieList() {

		Connection con = dbcon();
		String sql = "select  from movietbl";
		ArrayList<Movie> list = new ArrayList<>();

		try {
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();

			while (rs.next()) {
				String name = rs.getString(1);
				String price = rs.getString(2);
				String grade = rs.getString(3);

				Movie movie = new Movie(name, price, grade);
				list.add(movie);
			}
			rs.close();
			pst.close();
			con.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

}
