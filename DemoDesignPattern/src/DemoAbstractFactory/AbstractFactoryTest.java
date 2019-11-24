package DemoAbstractFactory;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        CarFactory carFactory=FactoryProducer.getCarFactory(FactoryType.HONDA);
        if(carFactory==null){
            System.out.println("Factory for given name doesn't exist.");
            System.exit(1);
        }
        Car car=carFactory.createCar(CarType.BRIO);
        if (car != null) {
            car.drive();
        } else {
            System.out.println("Car with given name doesn't exist.");
        }
        
        carFactory=FactoryProducer.getCarFactory(FactoryType.VINFAST);
        if(carFactory==null){
            System.out.println("Factory for given name doesn't exist.");
            System.exit(1);
        }
        car=carFactory.createCar(CarType.FADIL);
        if (car != null) {
            car.drive();
        } else {
            System.out.println("Car with given name doesn't exist.");
        }
    }
}


