public class Circle extends Shapes {


    double cir_y = 10;
    double cir_x = 10;
    double radius;
    double circle_x, circle_y;
    final double pi = Math.PI;

    public Circle(double radius, double circle_x, double circle_y) {
        this.radius = radius;
        this.circle_y = circle_y;
        this.circle_x = circle_x;
    }
 
   
    public double area() {
        // A = π r^2
        return pi * Math.pow(radius, 2);
    }


    public double circumference() {

        // P = 2πr
        return 2 * pi * radius;
    }
    
 
    public boolean isInside() { 
    // Compare radius of circle with distance  
    // of its center from given point 
    if ((cir_x - circle_x) * (cir_x - circle_x) + 
        (cir_y - circle_y) * (cir_y - circle_y) <= radius * radius) {
      // System.out.println("Is inside");
      return true; 
    } else {
      // System.out.println("Is not inside");
        return false;
    } 
  }
    
}