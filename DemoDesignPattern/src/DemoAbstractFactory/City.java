package DemoAbstractFactory;

public class City implements Car{

    public City() {
    }

    @Override
    public void drive() {
        System.out.println("Driving Honda City ...");
    }
}
