package acorn;

import java.util.*;

public class AcornService {
	AcornDAO dao = new AcornDAO();

	public ArrayList<Customer> showlist() {

		ArrayList<Customer> list = dao.selectAll();
		return list;
	}
}
