class Main {

  public static void main(String[] args) {
      // calling the class and method to get coordinates from user

      //Circle area and circumference
      Circle circle = new Circle(10, 10, 20, 20, 5, 10);

      //calculates radius and sets radius 
      circle.setRad(circle.calculateRadius());
    
      System.out.println("Circle radius " + circle.getRad());
      System.out.println("Circle area " + circle.area());
      System.out.println("Circle center " + circle.centerx() + ", " + circle.centery());
      circle.isInside();

     // rectangles area and circumference
      Rectangle rect = new Rectangle(1, 1, 3, 3, 5, 5);
      System.out.println("Rectangle area " + rect.area());
      System.out.println("Rectangle circumference " + rect.circumference());
      System.out.println("Rectangle center " + rect.centerx() + ", " + rect.centery());
      rect.isInside();

      //public Triangle(input is seen as the first and the second point of the hypotenuse, please note this make the triangle right)
      Triangle tri = new Triangle(1, 1, 3, 4, 5, 5);
      System.out.println("Triangle area " + tri.area());
      System.out.println("Triangle circumference " + tri.circumference());
      System.out.println("The Orthocenter of the given triangle is " + tri.centerx() + ", " + tri.centery());
      tri.isInside();

      //Calculate the distance between two different shapes, given their center coordinates
      double DC2R; // Distance from circle to Rectangle
      double DC2T; // Distance from circle to Triangle
      double DR2T; // Distance from Rectangle to Triangle
      //Using the distance formular between the centroid of the different shapes q
      DC2R = Math.sqrt(Math.pow((circle.centerx() - rect.centerx()), 2) + Math.pow((circle.centery() - rect.centerx()), 2));
      System.out.println("\nThe distance from the circle to the rectangle is: " + DC2R);

      DC2T = (Math.sqrt(Math.pow((circle.centerx() - tri.centerx()), 2) + Math.pow((circle.centery() - tri.centerx()), 2))*100)/100;
      System.out.println("The distance from the circle to the triangle is: " + DC2T);

      DR2T = Math.sqrt(Math.pow((rect.centerx() - tri.centerx()), 2) + Math.pow((rect.centery() - tri.centerx()), 2));
      System.out.println("The distance from the rect to the triangle is: " + DR2T);
  }
}