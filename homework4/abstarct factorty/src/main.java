public class main {
    public static void main(String[] args) {
        myFactory factory;
        Television tv;
        AirConditioner airconditioner;
        factory= (myFactory) XMLUtil.getBean();
        tv=factory.produceTelevision();
        airconditioner= factory.produceAirCondition();
        tv.play();
        airconditioner.changeTemperature();
    }
}
