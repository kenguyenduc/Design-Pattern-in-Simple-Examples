package DemoAbstractFactory;

public class HondaCarFactory extends CarFactory{

    public HondaCarFactory() {
    }
    
    @Override
    Car createCar(CarType carType) {
        if(CarType.BRIO==carType){
            return new Brio();
        }
        if (CarType.CITY==carType){
            return new City();
        }
        return null;
    }
}
