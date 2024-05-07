package codetestFor;

import java.util.Scanner;

public class 비용문제 {

	public static void main(String[] args) {
		// 문제: 사용자로부터 여러 제품의 가격과 수량을 입력받아서 총 구매 비용을 계산하는 Java 프로그램을 작성하세요. 사용자는 제품 가격과
		// 수량을 입력한 후 마지막으로 -1을 입력하여 입력을 종료합니다. 각 제품의 가격과 수량을 입력받을 때마다 총 구매 비용에 누적하여
		// 계산하세요.

		Scanner sc = new Scanner(System.in);

		int total = 0;

		while (true) {
			int count = sc.nextInt();
			if (count == -1) {
				break;
			}
			int price = sc.nextInt();
			total += count * price;
		}
		System.out.println(total);

	}

}
