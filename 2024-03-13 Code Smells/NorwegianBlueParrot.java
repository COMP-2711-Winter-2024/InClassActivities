public class NorwegianBlueParrot extends Bird {

    private static final int DEFAULT_VOLTAGE = 0;
    private static final boolean DEFAULT_NAILED = false;

    private boolean nailed;
    private int voltage;

    public NorwegianBlueParrot() {
        this(DEFAULT_VOLTAGE, DEFAULT_NAILED);
    }

    public NorwegianBlueParrot(int voltage, boolean nailed) {
        this.voltage = voltage;
        this.nailed = nailed;
    }

    @Override
    public String getPlumage() {
        if(voltage > 100) {
            return "scorched";
        }

        return "beautiful";
    }

    @Override
    public Integer getAirSpeedVelocity() {
        if(nailed) {
            return 10 + voltage / 10;
        }

        return 0;
    }

}
