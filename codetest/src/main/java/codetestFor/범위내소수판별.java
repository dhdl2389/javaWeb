package codetestFor;

import java.util.Scanner;

public class 범위내소수판별 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		for (int i = num1; i <= num2; i++) {
			boolean bl = true;
			if (i <= 1) {
				bl = false;
			} else {
				for (int j = 2; j <= Math.sqrt(i); j++) {

					if (i % j == 0) {
						bl = false;
						break;
					}
				}
			}
			if(bl) {
				System.out.println(i);
			}
		}

	}
}
