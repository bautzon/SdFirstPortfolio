import java.util.Scanner;
// 
class Main {
  
  public static void main(String[] args) {
    // calling the class and method to get coordinates from user
    GetPoints getpointsObj = new GetPoints();
    getpointsObj.getPoints();

  //Circle area and circumference
    // public Circle (double x1, double y1, double x2, double y2, double x, double y, double rad)

      Circle circle = new Circle(5, 5, 3, 4, 4, 4, 4);
      System.out.println("Circle radius " + circle.getRad());
      System.out.println("Circle area " + circle.area());
      System.out.println("Circle circumference " + circle.circumference());
      System.out.println("Circle center " + circle.centerx() + ", " + circle.centery());
      circle.isInside();

  // rectangles area and circumference
    // public Rectangle (double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4, double x, double y)
      Rectangle rect = new Rectangle(3, 1, 7, 4, 5, 5, 5, 5, 10, 10);
      System.out.println("Rectangle area " + rect.area());
      System.out.println("Rectangle circumference " + rect.circumference());
      System.out.println("Rectangle center " + rect.centerx() + ", " + rect.centery());
      rect.isInside();

      //public Triangle(int tri_x1, int tri_y1, int tri_x2, int tri_y2, int tri_x3, int tri_y3)

      Triangle tri = new Triangle(1, 2, 3, 4, 5, 6);
      System.out.println("Triangle area " + tri.area());
      System.out.println("Triangle circumference " + tri.circumference());
      System.out.println("The Orthocenter of the given triangle is " + tri.centerx() + ", " + tri.centery());
      tri.isInside();

  }
}