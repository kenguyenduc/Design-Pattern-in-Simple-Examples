package Demo1;

/**
 * Concrete factory
 */
public class ThreeDShapeFactory extends AbstractFactory{

    public ThreeDShapeFactory() {
    }

    @Override
    GeometricShape getShape(ShapeType name) {
        if (ShapeType.SPHERE == name) {
            return new Sphere();
        }
        return null;
    }
    
}
