public class Circle extends Shapes {

    double radius;
    double x, y;
    final double pi = Math.PI;

    public Circle(double radius, double circle_x, double circle_y) {
        this.radius = radius;
        this.y = y;
        this.x = x;
    }

    @Override
    public double area() {
        // A = π r^2
        return pi * Math.pow(radius, 2);
    }

    public double circumference() {

        // P = 2πr
        return 2 * pi * radius;
    }

    boolean isInsideOrNot(int circle_x, int circle_y, 
                   int radius, int x, int y) { 
    // Compare radius of circle with distance  
    // of its center from given point 
    if ((x - circle_x) * (x - circle_x) + 
        (y - circle_y) * (y - circle_y) <= radius * radius) 
        return true; 
    else
        return false; 
    } 


}