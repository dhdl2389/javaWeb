package codetestFor;

public class 유지보수비용 {

	public static void main(String[] args) {
// 문제: 문제가 A 업체는 한달의 유지보수 비용이 10만원이 든다.
//		B업체는 한달의 유지보수 비용이 20만원이 든다.
//		A업체는 24년 3월 부터 사용했고 B업체는 23년 1월부터 사용했다. 24년 유지보수 비용과 23년 유지보수 전체 비용을 구하여라 
		
	
		int aStartYear = 24;
		int bStartYear = 23;
		
		int aStartMonth = 3;
		int bStartMonth = 1;
		
		int aTotalCost = 0;
		int bTotalCost = 0;
		
		if(aStartYear == 24) {
			if(aStartMonth >=3) {
				aTotalCost += (12-aStartMonth +1) * 100000;
			}
		}
		
		if(bStartYear == 23) {
			if(bStartMonth >=1) {
				bTotalCost += (12-bStartMonth +1) * 200000;
			}
		}
		
		System.out.println("a업체의 24년 유지보수 비용은" + aTotalCost);
		System.out.println("b업체의 23년 유지보수 비용은" + bTotalCost);
		
		
		
	}

}
