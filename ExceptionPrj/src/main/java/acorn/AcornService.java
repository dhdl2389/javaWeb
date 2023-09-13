package acorn;

import java.sql.SQLException;

public class AcornService {

	AcornDAO dao = new AcornDAO();

	// 회원 정보 등록 하는 기능
	public void registerCustomer(Customer c) throws SQLException {		
		
		dao.insert(c);
		
	}

}
