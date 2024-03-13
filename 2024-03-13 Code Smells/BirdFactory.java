public class BirdFactory {

    public Bird getBird(String type) {
        // european swallow
        if(type.equals("European Swallow")) {
            return new EuropeanSwallow();
        }

        // african swallow
        else if(type.equals("African Swallow")) {
            return new AfricanSwallow();
        }

        // norwegian blue parrot
        else if(type.equals("Norwegian Blue Parrot")) {
            return new NorwegianBlueParrot();
        }

        // throw exception
        else {
            throw new IllegalArgumentException("That's a FOWL type of bird!");
        }
    }
}
