package Demo1;

/**
 * Concrete factory
 */
public class TwoDShapeFactory extends AbstractFactory{

    public TwoDShapeFactory() {
    }

    @Override
    GeometricShape getShape(ShapeType name) {
        if (ShapeType.LINE==name){
            return new Line();
        }else if (ShapeType.CIRCLE == name) {
            return new Circle();
        }
        return null;
    }
}
