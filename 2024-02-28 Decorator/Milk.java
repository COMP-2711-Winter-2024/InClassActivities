public class Milk extends Additive {

    private static final double COST = 0.50;

    private HipsterHouseBeverage beverage;

    public Milk(HipsterHouseBeverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + COST;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " with milk";
    }
}
