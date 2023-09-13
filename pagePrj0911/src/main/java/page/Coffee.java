package page;

public class Coffee {
	String code;
	String name;
	int price;

	public Coffee() {
		// TODO Auto-generated constructor stub
	}

	public Coffee(String code, String name, int price) {
		super();
		this.code = code;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Coffee [code=" + code + ", name=" + name + ", price=" + price + "]";
	}

	public String getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}
	
}
