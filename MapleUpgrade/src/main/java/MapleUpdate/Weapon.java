package MapleUpdate;

public class Weapon {

	String wp_code;
	String wp_cat;
	String wp_price;

	public Weapon() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Weapon [wp_code=" + wp_code + ", wp_cat=" + wp_cat + ", wp_price=" + wp_price + "]";
	}

	public Weapon(String wp_code, String wp_cat, String wp_price) {
		super();
		this.wp_code = wp_code;
		this.wp_cat = wp_cat;
		this.wp_price = wp_price;
	}

	public Weapon(String wp_code, String wp_price) {
		super();
		this.wp_code = wp_code;
		this.wp_price = wp_price;
	}

	public String getWp_code() {
		return wp_code;
	}

	public void setWp_code(String wp_code) {
		this.wp_code = wp_code;
	}

	public String getWp_cat() {
		return wp_cat;
	}

	public void setWp_cat(String wp_cat) {
		this.wp_cat = wp_cat;
	}

	public String getWp_price() {
		return wp_price;
	}

	public void setWp_price(String wp_price) {
		this.wp_price = wp_price;
	}

}
