
public class Circle extends Shapes {

//private instance variables
  private double x1;
  private double y1;
  private double x2;
  private double y2;
//point for is inside test 
  private double x;
  private double y;
  private double rad;

 
  final double pi = Math.PI;

// Constructs a Circle with given inputs
public Circle (double x1, double y1, double x2, double y2, double x, double y) {
    this.x1 = x1;
    this.y1 = y1;
    this.x2 = x2;
    this.y2 = y2;
// point
    this.x = x;
    this.y = y;

}
   // Calculating the radius from the distance between the two given points

// Getters and setters to gain indirect access to variable
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
    public double getX2() {
        return x2;
    }
    public void setX2(double x2) {
        this.x2 = x2;
    }
    public double getY2() {
        return y2;
    }
    public void setY2(double y2) {
        this.y2 = y2; 
    }
    public void setX(double x){
      this.x = x;
    }
    public double getX(double X){
      return x;
    }
        public void setY(double y){
      this.y = y;
    }
    public double getY(double y){
      return y;
    }

    //double radius = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
    public void setRad(double rad) {
        this.rad = rad;
    }
	
    public double getRad() {
        return rad;
    }
    
    // Methods

    public double calculateRadius() {

      return Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));

    }
	
    public double area() {
        // A = π r^2
        return pi * Math.pow(rad, 2);
    }

    public double circumference() {
        // P = 2πr
        return 2 * pi * rad;
    }

    public double centerx() {
      return x1;
    }

    public double centery() {
      return y1;
    }
//https://www.geeksforgeeks.org/find-if-a-point-lies-inside-or-on-circle/
    public boolean isInside() {
      if ((x1 - x) * (x1 - x) + (y1  - y) * (y1 - y) <= rad) {
        return true; 
        
    } else {
        System.out.println("The point is Outside Circle");
        return false;
    } 
}
}