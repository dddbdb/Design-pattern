public class TCLFactory implements myFactory{
    @Override
    public Television produceTelevision() {
        return new TCLtelevision();
    }

    @Override
    public AirConditioner produceAirCondition() {
        return new TCLAirConditioner();
    }
}
