package by.htp.coffeetruck.entity;

public class Coffee {

	private int gramPrice;
	private String state;
	private String sort;
	private String brand;
	
	public Coffee(int gramPrice, String state, String sort, String brand) {
		this.gramPrice = gramPrice;
		this.state = state;
		this.sort = sort;
		this.brand = brand;
	}

	public int getGramPrice() {
		return gramPrice;
	}

	public String getState() {
		return state;
	}

	public String getSort() {
		return sort;
	}
	
	public String getBrand() {
		return brand;
	}
	
	@Override
	public String toString() {
		return "Coffee [brand=" + brand +", state=" + state + ", sort=" + sort + "]";
	}
	
}
