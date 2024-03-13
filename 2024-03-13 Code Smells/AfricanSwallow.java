public class AfricanSwallow extends Bird {

    private static final int DEFAULT_COCONUTS = 0;
    private int coconuts;

    public AfricanSwallow() {
        this(DEFAULT_COCONUTS);
    }

    public AfricanSwallow(int coconuts) {
        this.coconuts = coconuts;
    }

    @Override
    public String getPlumage() {
        if(coconuts > 2) {
            return "tired";
        }
        return "average";
    }

    @Override
    public Integer getAirSpeedVelocity() {
        return 40 - 2 * coconuts;
    }

}
