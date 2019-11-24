package DemoAbstractFactory;

public class VinfastCarFactory extends CarFactory {
    
    public VinfastCarFactory() {
    }
    
    @Override
    Car createCar(CarType carType) {
        if(CarType.FADIL==carType){
            return new Fadil();
        }
        return null;
    }
}
