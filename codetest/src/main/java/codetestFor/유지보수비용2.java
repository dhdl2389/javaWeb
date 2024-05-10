package codetestFor;

import java.util.Scanner;

public class 유지보수비용2 {
	public static void main(String[] args) {
// 문제: 문제가 A 업체는 한달의 유지보수 비용이 10만원이 든다.
//		B업체는 한달의 유지보수 비용이 20만원이 든다.
//		A업체는 24년 3월 부터 사용했고 B업체는 23년 1월부터 사용했다. 24년 유지보수 비용과 23년 유지보수 전체 비용을 구하여라 

		Scanner sc = new Scanner(System.in);
		String year = sc.nextLine();
		
		int aStartMonth = 3;
		int bStartMonth = 1;
		
		int aCost = 100000;
		int bCost = 200000;
		
		int sum;
		if(year.equals("23")) {
			
		  sum = (12 - bStartMonth + 1)	* 200000;
		  System.out.println(sum);
		}else if(year.equals("24")) {
			
		  sum = (12 - aStartMonth + 1)*100000 + (((12-bStartMonth +1) * 200000)*2) ;
		  System.out.println(sum);
		}else {
			System.out.println("잘못된 선택");
		}

	}
}
