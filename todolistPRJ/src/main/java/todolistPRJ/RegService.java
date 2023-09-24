package todolistPRJ;

public class RegService {
	RegDAO dao = new RegDAO();

	public int regUser(User u) {
		dao.insertUser(u);
		boolean result = u.id.isEmpty() || u.pw.isEmpty() || u.name.isEmpty() || u.birth.isEmpty() || u.tel.isEmpty();
		int num;
		if (result) {
			num = 1; // 유효성 검사 실패
		} else {
			num = 0; // 회원가입 완료
		}
		return num;
	}

	public void deleteUser(String id) {
		dao.deleteUser(id);
		;
	}
}
