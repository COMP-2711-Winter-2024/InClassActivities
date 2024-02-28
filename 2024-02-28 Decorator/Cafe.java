public class Cafe {
    public static void main(String[] args) {

        HipsterHouseBeverage drink = new Cappuccino();
        
        System.out.println(drink.getDescription());
        
        drink = new Sugar(drink);
        drink = new Sugar(drink);
        drink = new Milk(drink);

        System.out.println(drink.getDescription());

        HipsterHouseBeverage otherDrink = new NightTerror();
        otherDrink = new Sugar(otherDrink);
        otherDrink = new Milk(otherDrink);
        otherDrink = new Concrete(otherDrink);
        System.out.println(otherDrink.getDescription());
        System.out.println(otherDrink.cost());


    }
}
