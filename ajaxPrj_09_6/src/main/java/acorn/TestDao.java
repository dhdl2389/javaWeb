package acorn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestDao {

	// 데이터베이스 연결정보
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:testdb";
	String user = "scott";
	String password = "tiger";

	public Connection dbcon() {

		Connection con = null;
		// 객체생성하는 코드

		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;

	}

//	public ArrayList<Member> selectAll(){
//		
//		
//	}

//	public Member selectOne(String id){
//	
//	
//}

	public String selectOne(String id) {
		String name = "";
		Connection con = dbcon();
		String sql = "select name from acorntbl where id = ?";
		try {

			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, id);
			ResultSet rs = pst.executeQuery();

			if (rs.next()) {
				name = rs.getString(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return name;
	}

	public static void main(String[] args) {

		TestDao dao = new TestDao();
		Connection con = dao.dbcon();
		if (con != null)
			System.out.println("db ok");
		
		String name =dao.selectOne("jy");
		System.out.println(name);
	}

}
