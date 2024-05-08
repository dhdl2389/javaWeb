package codetestFor;

public class 유지보수비용2 {
	public static void main(String[] args) {
// 문제: 문제가 A 업체는 한달의 유지보수 비용이 10만원이 든다.
//		B업체는 한달의 유지보수 비용이 20만원이 든다.
//		A업체는 24년 3월 부터 사용했고 B업체는 23년 1월부터 사용했다. 24년 유지보수 비용과 23년 유지보수 전체 비용을 구하여라 

		int year = 24;

		int aStartMonth = 3;
		int bStartMonth = 1;

		int aMonthCost = 100000;
		int bMonthCost = 200000;

		int aTotalCost = 0;
		int bTotalCost = 0;

		if (year == 24) {
			aTotalCost += (12 - aStartMonth + 1) * aMonthCost;
			bTotalCost += (24 - bStartMonth + 1) * bMonthCost;
			int sum24 = aTotalCost + bTotalCost;			
			System.out.println(sum24);
		}else {
			bTotalCost +=(12- bStartMonth +1) * bMonthCost;
			System.out.println(bTotalCost);
		}

	}
}
