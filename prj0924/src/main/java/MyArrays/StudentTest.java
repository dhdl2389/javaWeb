package MyArrays;

import MyArrays.interfaceEx.MyComparator;

public class StudentTest {
	public static void main(String[] args) {
		Student[] arr = new Student[3];
		arr[0] = new Student(89, 99);
		arr[1] = new Student(99, 100);
		arr[2] = new Student(100, 79);

		// 국어성적순 정렬
		MyArraysEx.sort(arr);
		System.out.println("국어성적순");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);

		}
		// 영어성적순 정렬
		MyArraysEx.sort(arr, new MyComparator() {
			@Override
			public int compare(Object o1, Object o2) {
				return ((Student) o1).eng - ((Student) o2).eng;
			}
		});
		// 람다식 사용가능
		MyArraysEx.sort(arr, (o1, o2) -> ((Student) o1).eng - ((Student) o2).eng);

		System.out.println("영어성적순");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
