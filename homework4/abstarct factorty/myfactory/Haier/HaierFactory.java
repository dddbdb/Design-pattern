public class HaierFactory implements myFactory{
    @Override
    public Television produceTelevision() {
        return new HaierTelevision();
    }

    @Override
    public AirConditioner produceAirCondition() {
        return new HaierAirConditioner();
    }
}
