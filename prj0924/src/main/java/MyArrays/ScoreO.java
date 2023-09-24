package MyArrays;

import MyArrays.interfaceEx.MyComparator;

public class ScoreO implements MyComparator {
	String name;
	int kor;
	int eng;

	public ScoreO(String name, int kor, int eng) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;

	}

	@Override
	public String toString() {
		return "ScoreO [name=" + name + ", kor=" + kor + ", eng=" + eng + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	// 영어 성적으로 정렬
//	@Override
//	public int compare(Object o1, Object o2) {
//		ScoreO s1 = (ScoreO) o1;
//		ScoreO s2 = (ScoreO) o2;
//
//		return s2.getEng() - s1.getEng();
//	}

	// 국어 성적으로 정렬
	@Override
	public int compare(Object o1, Object o2) {
		ScoreO s1 = (ScoreO) o1;
		ScoreO s2 = (ScoreO) o2;

		return s2.getKor() - s1.getKor();
	}
}
