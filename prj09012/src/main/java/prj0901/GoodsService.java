package prj0901;

import java.util.ArrayList;

public class GoodsService {
	GoodsDAO dao = new GoodsDAO();

	public ArrayList<String> getGoodsRealList() {

		ArrayList<String> list = dao.selectAll();
		return list;
	}

	public void registerGoods(Goods g) {

		dao.insertGoods(g);
	}

	public Goods getGoods(String id) {

		Goods g = dao.selectOne(id);
		return g;
	}
	
	public void deleteGoods(String id) {
		dao.deleteOne(id);
	}
	
	public void modifyGoods(Goods g) {
		dao.updateGoods(g);
	}

}
