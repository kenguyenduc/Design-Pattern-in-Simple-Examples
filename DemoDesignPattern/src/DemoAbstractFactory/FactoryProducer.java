package DemoAbstractFactory;

public class FactoryProducer {
    public static CarFactory getCarFactory(FactoryType factoryType){
        if (null != factoryType) 
            switch (factoryType) {
                case HONDA:
                    return new HondaCarFactory();
                case HUYNDAI:
                    return new HuyndaiCarFactory();
                case VINFAST:
                    return new VinfastCarFactory();
                default:
                    break;
            }
        return null;
    }
}
