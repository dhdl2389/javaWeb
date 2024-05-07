package codetestFor;

import java.util.Scanner;

public class 소수판별 {
	public static void main(String[] args) {

		// 문제: 사용자가 입력하는 값이 소수인지 아닌지 판별하는 코드를 작성하시오

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		boolean bl = true;

		if (num <= 1) {
			System.out.println("잘못된 입력");

		} else if (num == 2) {
			System.out.println("2는 소수");
		} else {
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					bl = false;
					break;
				}
			}
			if (bl) {
				System.out.println(num + "은(는) 소수");

			} else {
				System.out.println(num + "은(는)소수가 아닙니다.");
			}
		}

	}

}
