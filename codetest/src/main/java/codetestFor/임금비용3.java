package codetestFor;

public class 임금비용3 {
	
	public static void main(String[] args) {
	
		// 문제: 회사 X는 한 달에 15만원의 인건비를 지불합니다. 회사 Y는 한 달에 25만원의 인건비를 지불합니다.
		// 회사 X는 2023년 5월부터 서비스를 이용하기 시작했고, 회사 Y는 2022년 10월부터 서비스를 이용하기 시작했습니다.
		// 2023년과 2022년의 서비스 이용에 대한 인건비를 각각 계산하세요.
		
		Integer year = 23;
		
		int xCost = 150000;
		int yCost = 250000;
		
		int xStartMonth = 5;
		int yStartMonth = 10;
				
		int xCostTotal;
		int yCostTotal;
		
		
		if(year.equals(25)) {
			yCostTotal = (12- yStartMonth + 1) * yCost;  // 75만
			System.out.println(yCostTotal);
		}else if(year ==23){
			xCostTotal = (12 - xStartMonth + 1) * xCost;   // 120만
			yCostTotal = ((12 - yStartMonth +1) * yCost) + (yCost * 12); // 75 + 300 = 375만
			int year23Sum = xCostTotal + yCostTotal;
			System.out.println(year23Sum);		
		}else {
			System.out.println("잘못된 연도");
		}
			
	}
	
}
