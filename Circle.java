public class Circle extends Shapes {

    double radius;
    double circle_x, circle_y;
    final double pi = Math.PI;

    public Circle(double radius, double circle_x, double circle_y) {
        this.radius = radius;
        this.circle_y = circle_y;
        this.circle_x = circle_x;
    }
 
    //@Override
    public double area() {
        // A = π r^2
        return pi * Math.pow(radius, 2);
    }

    public double circumference() {

        // P = 2πr
        return 2 * pi * radius;
    }
    
    //@Override
    public static boolean insideOrNot(double circle_x, double circle_y, double radius, double x, double y) { 
    // Compare radius of circle with distance  
    // of its center from given point 
    if ((x - circle_x) * (x - circle_x) + 
        (y - circle_y) * (y - circle_y) <= radius * radius) {
      // System.out.println("Is inside");
      return true; 
    } else {
      // System.out.println("Is not inside");
        return false;
    } 
  }
    
}