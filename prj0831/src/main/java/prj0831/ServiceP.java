package prj0831;

import java.util.ArrayList;

public class ServiceP {

	public ArrayList<person> getList() {

		ArrayList<person> list = new ArrayList<>();

		list.add(new person("김재열", "181cm", "75kg"));
		list.add(new person("나재열", "182cm", "85kg"));
		list.add(new person("박재열", "183cm", "95kg"));
		list.add(new person("이재열", "184cm", "105kg"));
		
		return list;

	}

}
