package nobuilder;

public class PizzaBuilder {
	private String dough;
	private String base;
	private String toppings;
	private String sauce;
	private String bake;
	private String cheese;

    public PizzaBuilder() {
        dough = null;
        base = null;
        toppings = null;
        sauce = null;
        bake = null;
        cheese = null;
    }

    public Pizza build() {
        if(dough == null || base == null || bake == null) {
            throw new IllegalStateException();
        }

        Pizza pizza = new Pizza();
        pizza.setBake(bake);
        pizza.setBase(base);
        pizza.setCheese(cheese);
        pizza.setDough(dough);
        pizza.setToppings(toppings);
        pizza.setSauce(sauce);

        return pizza;
    }

    public PizzaBuilder withDough(String dough) {
        this.dough = dough;
        return this;
    }

    public PizzaBuilder withBase(String base) {
        this.base = base;
        return this;
    }

    public PizzaBuilder withToppings(String toppings) {
        this.toppings = toppings;
        return this;
    }

    public PizzaBuilder withSauce(String sauce) {
        this.sauce = sauce;
        return this;
    }

    public PizzaBuilder withBake(String bake) {
        this.bake = bake;
        return this;
    }

    public PizzaBuilder withCheese(String cheese) {
        this.cheese = cheese;
        return this;
    }
}   
