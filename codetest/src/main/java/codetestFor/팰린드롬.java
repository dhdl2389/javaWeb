package codetestFor;

import java.util.Scanner;

public class 팰린드롬 {
	public static void main(String[] args) {

		// 문제 : 팰린드롬 알고리즘 구현하기 / 사용자가 정수를 입력했을 때 뒤집어도 같은 숫자인지 판별
		// ex) 입력 : 100009 로직 : 900001 출력 : 팰린드롬이 아님

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String str = String.valueOf(num);
		StringBuffer sb = new StringBuffer(str).reverse();
		String reverse = sb.toString();

		if (str.equals(reverse)) {
			System.out.println("팰린드롬입니다.");
		} else {
			System.out.println("팰린드롬이 아닙니다.");
		}

	}
}
