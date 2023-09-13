package page;

public class PageHandler2 {

	int currentPage;
	int totRecords;
	int pageSize;
	int grpSize;

	int totalPage;
	int currentGrp;
	int grpStartPage;
	int grpEndPage;

	public PageHandler2(int currentPage, int totRecords, int pageSize, int grpSize) {
		super();
		this.currentPage = currentPage;
		this.totRecords = totRecords;
		this.pageSize = pageSize;
		this.grpSize = grpSize;

		calcPage();
	}

	private void calcPage() {
		// TODO Auto-generated method stub

		// 총 페이지

		int remain = totRecords % pageSize;
		if (remain == 0) {
			totalPage = totRecords / pageSize;
		} else {
			totalPage = totRecords / pageSize + 1;
		}

		// 현재그룹
		int remain2 = currentPage % grpSize;
		if (remain2 == 0) {
			currentGrp = currentPage / grpSize;
		} else {
			currentGrp = currentPage / grpSize + 1;
		}

		// 현재그룹 시작, 마지막 페이지
		grpStartPage = (currentGrp - 1) * grpSize + 1;
		grpEndPage = currentGrp * grpSize;

		if (grpEndPage > totalPage) {
			grpEndPage = totalPage;
		}
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public int getTotRecords() {
		return totRecords;
	}

	public int getPageSize() {
		return pageSize;
	}

	public int getGrpSize() {
		return grpSize;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public int getCurrentGrp() {
		return currentGrp;
	}

	public int getGrpStartPage() {
		return grpStartPage;
	}

	public int getGrpEndPage() {
		return grpEndPage;
	}

	public static void main(String[] args) {
		PageHandler2 p = new PageHandler2(1, 24, 8, 5);
		int a = p.getTotalPage();
		int b = p.getCurrentGrp();
		int c = p.getGrpStartPage();
		int d = p.getGrpEndPage();

		System.out.println(a + " " + b + " " + c + " " + d);

	}

}
