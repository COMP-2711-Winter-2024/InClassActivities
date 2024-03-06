package nobuilder;

public class Pizza {
	private String dough;
	private String base;
	private String toppings;
	private String sauce;
	private String bake;
	private String cheese;
	
	protected Pizza() {

	}

	public void setDough(String dough) {
		this.dough = dough;
	}

	public void setBase(String base) {
		this.base = base;
	}

	public void setToppings(String toppings) {
		this.toppings = toppings;
	}

	public void setSauce(String sauce) {
		this.sauce = sauce;
	}

	public void setBake(String bake) {
		this.bake = bake;
	}

	public void setCheese(String cheese) {
		this.cheese = cheese;
	}

	public String getDough() {
		return dough;
	}

	public String getBase() {
		return base;
	}
	public String getToppings() {
		return toppings;
	}
	public String getSauce() {
		return sauce;
	}
	public String getBake() {
		return bake;
	}
	public String setCheese() {
		return cheese;
	}



	// What happens if we want to make a pizza without sauce? 
}
