package Demo1;

/**
 * Concrete product
 */
public class Sphere implements GeometricShape {

    public Sphere() {
    }
    
    @Override
    public void draw() {
        System.out.println("Sphere drawn.");
    }
}
