package Demo1;

/**
 * Concrete product
 */
public class Circle implements GeometricShape {

    public Circle() {
    }
    
    @Override
    public void draw() {
        System.out.println("Circle is drawn.");
    }
}
