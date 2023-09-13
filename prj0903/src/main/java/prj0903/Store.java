package prj0903;

public class Store {
	String order_id;
	String user_id;
	String item_code;
	String wp_code;
	String cnt;

	public Store() {
		// TODO Auto-generated constructor stub
	}

	public Store(String order_id, String user_id, String item_code, String wp_code, String cnt) {
		super();
		this.order_id = order_id;
		this.user_id = user_id;
		this.item_code = item_code;
		this.wp_code = wp_code;
		this.cnt = cnt;
	}
	
	public Store(String order_id, String cnt) {
		super();
		this.order_id = order_id;
		this.cnt = cnt;
	}

	@Override
	public String toString() {
		return "Goods [order_id=" + order_id + ", user_id=" + user_id + ", item_code=" + item_code + ", wp_code="
				+ wp_code + ", cnt=" + cnt + "]";
	}

	public String getOrder_id() {
		return order_id;
	}

	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getItem_code() {
		return item_code;
	}

	public void setItem_code(String item_code) {
		this.item_code = item_code;
	}

	public String getWp_code() {
		return wp_code;
	}

	public void setWp_code(String wp_code) {
		this.wp_code = wp_code;
	}

	public String getCnt() {
		return cnt;
	}

	public void setCnt(String cnt) {
		this.cnt = cnt;
	}

	
}
