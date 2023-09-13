package acorn;

import java.util.ArrayList;

public class Acorn2Service {

	AcornDAO2 dao = new AcornDAO2();

	public ArrayList<Student> getRealStudentList() {

		ArrayList<Student> list = dao.selectAll();
		return list;
	}
}
