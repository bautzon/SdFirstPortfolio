import java.util.Scanner;
// 
class Main {
  
  public static void main(String[] args) {
    // calling the class and method to get coordinates from user
    GetPoints getpointsObj = new GetPoints();
    getpointsObj.getPoints();

    //Circle area and circumference

      Circle circle = new Circle(5, 5, 5, 5, 5);
      System.out.println("Circle radius " + circle.getRad());
      System.out.println("Circle area " + circle.area());
      System.out.println("Circle circumference " + circle.circumference());
      circle.isInside();

    // rectangles area and circumference
    //public Rectangle (double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4, double x, double y)

      Rectangle rect = new Rectangle(3, 1, 7, 4, 5, 5, 5, 5, 10, 10);
      System.out.println("Rectangle area " + rect.area());
      System.out.println("Rectangle circumference " + rect.circumference());
      System.out.println("Rectangle circumference " + rect.circumference());
      rect.isInside();




      //triangle are aand circumference
    Shapes triangle = new Triangles(10, 11, 16, 17, 15, 12);
    //get the Centroid of a triangle
    Triangles.TriOC(10, 11, 16, 17, 15, 12);

    System.out.println("Triangle area " + triangle.area());
    System.out.println("Triangle circumference " + triangle.circumference());
      
    if (triangle.isInside()){
      System.out.println("Inside the Triangle");
    } else {
      System.out.println("Outside the Triangle");
    }
  }
}