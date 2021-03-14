public class Circle extends Shapes {

    //private instance variables

    double x;
    double y; 
    double rad;

    // instance variables userinput coordinates
    double x1;
    double y1;

    final double pi = Math.PI;

    // Constructs a Circle with given inputs

    public Circle(double x, double y, double rad, double x1, double y1) {
        this.x = x;
        this.y = y;
        this.rad = rad;
        this.y1 = y1;
        this.x1 = x1;
    }

    // Getters and setters to gain indirect acces to variable

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getRad() {
        return rad;
    }

    public void setRad(double rad) {
        this.rad = rad;
    }


    // getters and setters for coordinates

    public double getX1() {
        return x1;
    }
    public void setX1(double x1) {
        this.x1 = x1;
    }
    public double getY1() {
        return y1;
    }
    public void setY1(double y1) {
        this.y1 = y1;
    }

    // Methods

    public double area() {
        // A = π r^2
        return pi * Math.pow(rad, 2);
    }

    public double circumference() {
        // P = 2πr
        return 2 * pi * rad;
    }

    public void center(userinput) {
      //Given from user input
      System.out.print("The Center is found at: " + x1 ", " y1)
      return x1, y1;
    }
    
    public boolean isInside() {
      if ((x1 - x) * (x1 - x) + (y1  - y) * (y1 - y) <= rad * rad) {
        System.out.println("Is Inside Circle");
        return true; 
        
      } else {
        System.out.println("Is Outside Circle");
        return false;
      } 
    }
    
}