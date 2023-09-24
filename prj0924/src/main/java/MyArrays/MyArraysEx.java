package MyArrays;

import MyArrays.interfaceEx.MyComparable;
import MyArrays.interfaceEx.MyComparator;

public class MyArraysEx {

	public static void sort(Object[] arr, MyComparator c) {
		// 선택정렬, 예) 배열의 요소 정렬할 때 사용
		for (int i = 0; i < arr.length - 1; i++) {

			for (int j = i; j < arr.length; j++) {

				if (c.compare(arr[i], arr[j]) > 0) {
					Object tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}

	public static void sort(Object[] arr) {
		// 선택정렬 , 예) 배열의 요소 정렬할 때 사용
		for (int i = 0; i < arr.length - 1; i++) {

			for (int j = i; j < arr.length; j++) {

				if (arr[i] instanceof MyComparable) {

					if (((MyComparable) arr[i]).compareTo(arr[j]) > 0) {
						Object tmp = arr[i];
						arr[i] = arr[j];
						arr[j] = tmp;
					}

				}
			}

		}
	}
}
