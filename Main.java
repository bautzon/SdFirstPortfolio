import java.util.Scanner;

class Main {
  
  public static void main(String[] args) {
    // calling the class and method to get coordinates from user
    GetPoints getpointsObj = new GetPoints();
    getpointsObj.getPoints();
 
    //Circle area and circumference
      double radius = 5;
      double circle_x = 20;
      double circle_y = 30;
      Shapes circle = new Circle(radius, circle_x, circle_y);
      System.out.println("Circle radius" + radius);
      System.out.println("Circle area " + circle.area());
      System.out.println("Circle circumference " + circle.circumference());
      
    //circle check coordinates
      double x = 10, y = 10;  

      if (Circle.insideOrNot(circle_x, circle_y, radius, x, y)){ 
            System.out.print("Inside"); 
      }else{
            System.out.print("Outside");
      }

      //triangle are aand circumference
      Shapes triangle = new Triangles(1, 1, 1, 1, 1, 1);
      System.out.println("Triangle area " + triangle.area());
      System.out.println("Triangle circumference " + triangle.circumference());

  }
}