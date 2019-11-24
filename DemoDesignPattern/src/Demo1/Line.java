package Demo1;

/**
 * Concrete Product
 */
public class Line implements GeometricShape {
    
    public Line() {
    }
    
    @Override
    public void draw() {
        System.out.println("Line Drawn...");
    }
}
