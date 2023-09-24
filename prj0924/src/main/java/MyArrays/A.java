package MyArrays;

import MyArrays.interfaceEx.MyComparator;

public class A implements MyComparator {
//  영어 성적으로 정렬
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
