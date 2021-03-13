import java.util.Scanner;

class Main {
  
  public static void main(String[] args) {
    
    GetPoints getpointsObj = new GetPoints();
    getpointsObj.getPoints();
 
    //Circle coordinates
      double radius = 5;
      double circle_x = 20, circle_y = 30;
      Shapes circle = new Circle(radius, circle_x, circle_y);
      System.out.println("Circle radius" + radius);
      System.out.println("Circle area " + circle.area());
      System.out.println("Circle circumference " + circle.circumference());
      
    //check coordinates
    double x = 10, y = 10;  
        if (isInsideOrNot(circle_x, circle_y, radius, x, y)) 
            System.out.print("Inside"); 
        else
            System.out.print("Outside");
  }
}