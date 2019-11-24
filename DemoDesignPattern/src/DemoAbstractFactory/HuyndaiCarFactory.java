package DemoAbstractFactory;

public class HuyndaiCarFactory extends CarFactory{

    public HuyndaiCarFactory() {
    }

    @Override
    Car createCar(CarType carType) {
        if(CarType.I10==carType){
            return new I10();
        }
        if (CarType.I20==carType){
            return new I20();
        }
        return null;
    }   
}
