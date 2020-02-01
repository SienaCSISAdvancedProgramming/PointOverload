/**
 * Example PointOverload: a class demonstrating ad hoc polymorphism
 * by overloading constructors and the distance method.
 *
 * @author Jim Teresco
 * Siena College, Computer Science 225, Spring 2017
 * @version Spring 2020
 *
 */

public class Point {

    /** the coordinates */
    private double x, y;
    
    /**
     * Constructor a default point at (0,0)
     */
    public Point() {
        
        // x and y are already 0.0
    }
    
    /**
     * Constructor a point at the given x, y coordinates.
     * 
     * @param x the x coordinate for the point
     * @param y the y coordinate for the point
     */
    public Point(double x, double y) {
        
        this.x = x;
        this.y = y;
    }
    
    /**
     * Construct a point, initialized using another point.
     * 
     * @param p the point whose coordinates are to be used for this one's
     */
    public Point(Point p) {
        
        x = p.x;
        y = p.y;
    }
    
    /**
     * Compute the distance from this point to another.
     * 
     * @param p the other point
     * @return the distance from this point to p
     */
    public double distance(Point p) {
        
        double dx = x - p.x;
        double dy = y - p.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
    
    /**
     * Compute the distance from this point to a given coordinate pair.
     * 
     * @param x the x-coordinate of the other point
     * @param y the y-coordinate of the other point
     * @return the distance from this point to (x,y)
     */
    public double distance(double x, double y) {
    
        double dx = x - this.x;
        double dy = y - this.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
    
    /**
     * Compute the distance from this point to the origin.
     * 
     * @return the distance from this point to the origin
     */
    public double distance() {
        
        return Math.sqrt(x * x + y * y);
    }
    
    /**
     * @return string representation of this Point
     */
    public String toString() {
        
        return "(" + x + "," + y + ")";
    }

    /**
       main method to run some basic tests of the Point class.

       @param args not used
    */
    public static void main(String[] args) {
        
        Point a = new Point();
        Point b = new Point(3, 4);
        Point c = new Point(9, 12);
        Point d = new Point(b);
        
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
        System.out.println("d: " + d);
        
        System.out.println("Distance from b to c: " + b.distance(c));
        System.out.println("Distance from d to origin: " + d.distance());
        System.out.println("Distance from c to (1, 1): " + c.distance(1,1));
    
    }
}
