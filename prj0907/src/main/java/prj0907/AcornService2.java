package prj0907;

import java.util.ArrayList;

public class AcornService2 {
	AcornDAO2 dao = new AcornDAO2();

	public ArrayList<Acorn2> getRealMemberList() {

		ArrayList<Acorn2> list = dao.selectAll();
		return list;
	}
}
