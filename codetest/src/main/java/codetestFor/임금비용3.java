package codetestFor;

public class 임금비용3 {
	
	public static void main(String[] args) {
	
		// 문제: 회사 X는 한 달에 15만원의 인건비를 지불합니다. 회사 Y는 한 달에 25만원의 인건비를 지불합니다.
		// 회사 X는 2023년 5월부터 서비스를 이용하기 시작했고, 회사 Y는 2022년 10월부터 서비스를 이용하기 시작했습니다.
		// 2023년과 2022년의 서비스 이용에 대한 인건비를 각각 계산하세요.
		
		int xCost = 150000;
		int yCost = 250000;
		
		int xStartYear = 23;
		int yStartYear = 22;
		
		int xStartMonth = 5;
		int yStartMonth = 10;
		
		int xTotalCost=0;
		int yTotalCost = 0;
		
		if(xStartYear == 23) {
			xTotalCost += (12 -xStartMonth +1) * xCost;			
		}
		
		if(yStartYear ==22) {
			yTotalCost += (12-yStartMonth +1) * yCost;
		}
		
		System.out.println("22년 인건비는" + " " + yTotalCost);
		System.out.println("23년 인건비는"+ " " + (xTotalCost + yTotalCost));
	}
	
}
