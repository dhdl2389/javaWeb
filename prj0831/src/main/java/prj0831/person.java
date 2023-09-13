package prj0831;

public class person {
	String name;
	String height;
	String weight;
	
	public person() {
		// TODO Auto-generated constructor stub
	}
	
	public person(String name, String height, String weight) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "person [name=" + name + ", height=" + height + ", weight=" + weight + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}
	
}
