


public class Rectangle extends Shapes {

  private double x1, y1, x2, y2, x3, y3, x4, y4, x, y;

  // rectangle constructor
  public Rectangle (double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4, double x, double y) {
    this.x1 = x1;
    this.y1 = y1;
    this.x2 = x2;
    this.y2 = y2;
    this.x3 = x3;
    this.y3 = y3;
    this.x4 = x4;
    this.y4 = y4;
    this.x = x;
    this.y = y;
  }
  
  // getters and setters

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
    public double getX3() {
        return x3;
    }
    public void setX3(double x3) {
        this.x3 = x3;
    }
    public double getY3() {
        return y3;
    }
    public void setY3(double y3) {
        this.y3 = y3;
    }
    public double getX4() {
        return x4;
    }
    public void setX4(double x4) {
        this.x4 = x4;
    }
    public double getY4() {
        return y4;
    }
    public void setY4(double y4) {
        this.y4 = y4;
    }

    // point getter and setters

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


  //methods
  public double area() {
      // A = Length * Height
      return (x2-x1) * (y2 - y1);    
  }

  public double circumference() {
      // P = 2(h + l)
      return 2 * ((x2-x1) + (y2 - y1));
  }
// Find the center of a rectangle
  public double centerx() {
    //find the center of the x- axis cord of a rectangle
    double CRectX = (x2-x1)/2;
    return CRectX;
  }

    public double centery() {
    //find the center of the y-axis cord of a rectangle
    double CRectY = (y2-y1)/2;
    return CRectY;
  }
  
  //method if point (x,y) is inside the boundaries of rectangle
    public boolean isInside() {
      if ((x < x2 || x < x1 ) && (y < y2 || y > y1 )) {
          System.out.println("Is Inside Rectangle");
          return true; 
        } else {
          System.out.println("Is Outside Rectangle");
          return false;
        } 
    }

}



