package Demo1;

/**
 * Abstract Factory
 */
public abstract class AbstractFactory {
    
    public AbstractFactory() {
    }
    
    abstract GeometricShape getShape(ShapeType name);
}
