package MapleUpdate;

public class WeaponService {

	MpDao dao = new MpDao();

	public void deleteOne(String wp_code) {
		dao.deleteOne(wp_code);
	}
	
	public void insertWp(Weapon w) {
		
	 dao.insertWeapon(w);
		
	}
		
	public Weapon getWeapon (String wp_code) {
		Weapon w = dao.selectOne(wp_code);
		return w;
	}
}
