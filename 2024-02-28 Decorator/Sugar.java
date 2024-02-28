public class Sugar extends Additive {

    private static final double COST = 0.25;

    private HipsterHouseBeverage beverage;

    public Sugar(HipsterHouseBeverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + COST;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " with sugar";
    }
}
