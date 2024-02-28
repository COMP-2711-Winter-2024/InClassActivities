public class Concrete extends Additive {

    public Concrete(HipsterHouseBeverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " with concrete";
    }

    @Override
    public double cost() {
        return beverage.cost();
    }
    
}
