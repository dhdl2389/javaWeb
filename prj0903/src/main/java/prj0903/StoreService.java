package prj0903;

import java.util.*;

public class StoreService {

	MpDAO dao = new MpDAO();

	public ArrayList<String> getStoreRealList() {

		ArrayList<String> list = dao.selectAll();
		return list;
	}

	public void registerStore(Store s) {

		dao.insertStore(s);
	}

	public Store getStore(String Order_id) {
		Store s = dao.selectOne(Order_id);
		return s;

	}

	public void deleteStore(String Order_id) {

		dao.deleteOne(Order_id);
		;
	}

	public void updateStore(Store s) {
		dao.updateStore(s);
	}

}
