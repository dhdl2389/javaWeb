package MyArrays;

import MyArrays.interfaceEx.MyComparable;

public class Student implements MyComparable {

	int kor;
	int eng;

	public Student(int kor, int eng) {
		super();
		this.kor = kor;
		this.eng = eng;
	}

	@Override
	public int compareTo(Object obj) {
		if (obj instanceof Student) {
			Student tmp = (Student) obj;
			return (this.kor - tmp.kor) > 0 ? 1 : 0;
		}
		return 0;
	}

	@Override
	public String toString() {
		return "Student [kor=" + kor + ", eng=" + eng + "]";
	}

}
