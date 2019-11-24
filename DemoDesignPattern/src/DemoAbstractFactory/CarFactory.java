package DemoAbstractFactory;

public abstract class CarFactory {

    public CarFactory() {
    }
    
    abstract Car createCar(CarType carType);
}
