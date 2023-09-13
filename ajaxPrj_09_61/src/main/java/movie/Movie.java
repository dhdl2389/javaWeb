package movie;

public class Movie {

	String name;
	String price;
	String grade;

	public Movie() {
		// TODO Auto-generated constructor stub
	}

	public Movie(String name, String price, String grade) {
		super();
		this.name = name;
		this.price = price;
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "movie [name=" + name + ", price=" + price + ", grade=" + grade + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

}
