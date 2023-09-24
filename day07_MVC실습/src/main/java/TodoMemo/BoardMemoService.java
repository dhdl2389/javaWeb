package TodoMemo;

import java.util.ArrayList;

public class BoardMemoService {
	BoardMemoDAO dao = new BoardMemoDAO();

	public ArrayList<BoardMemo> getMemoRealList() {

		ArrayList<BoardMemo> list = dao.selectAll();
		return list;
	}

	public void registerMemo(String contents) {
		dao.memoInsert(contents);
	}

	public BoardMemo getMemo(String m_code) {

		BoardMemo m = dao.selectOne(m_code);
		return m;
	}

	public void modifyMemo(String m_code, String m_contents) {
		dao.updateMemo(m_code, m_contents);

	}

	public void deleteMemo(String m_code) {
		dao.memoDelete(m_code);
	}

}
