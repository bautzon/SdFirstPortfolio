/*
import java.util.Scanner;
import java.lang.Math.*;
import java.io.*;

public class GetPoints {

  //instance variables
  private double x1;
  private double y1;
  private double x2;
  private double y2;
  private double x3;
  private double y3;
  private double x4;
  private double y4;
/*
  // Constructor
  public GetPoints(double x1, double y1, double x2, double y2) {
    this.x1 = x1;
    this.y1 = y1;
    this.x2 = x2;
    this.y2 = y2;
}
*/
/*
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
  //Points for rectangles
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

  public static void getPoints() { 
    //Type the two coordinates for the points given.
    //This will return the diagonal for a rectangles, 
     //Hypotenuse for triangle
     //Center and outer perimeter for circle
     System.out.println("Please type the two coordinates x1, y1, x2, y2");
    Scanner s = new Scanner(System.in);
    double x1 = s.nextDouble();
    double y1 = s.nextDouble();
    double x2 = s.nextDouble();
    double y2 = s.nextDouble();
    System.out.println("Please type a point");
    double x = s.nextDouble();
    double y = s.nextDouble();
    double x3 = y2;
    double y3 = x2;
    double x4 = x1;
    double y4 = y2;


    //Calculate the distance between two points
     System.out.println(" (x1, y1): " + x1 + ", " + y1 + "\n (x2, y2): " + x2 + ", " + y1);
    double distancexy = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
    System.out.println("The distance between the two points is: " + distancexy);
    }
  }

  /*
    //Setters for userinput
    public void setxOne(double xOne) {
    this.xOne = xOne;
     }
     public void setyOne(double yOne){
    this.yOne = yOne;
    }

    public Integer getxOne(double xOne) {
    return gx1;
   }
    public void getyOne(double yOne){
      return gy1;
    }
    
}



      /*
      System.out.println("Please type the two coordinates x1, y1, x2, y2");
      Scanner s = new Scanner(System.in);
      double gx1  = s.nextDouble();
      double gy1  = s.nexDouble();
      double gx2  = s.nextDouble();
      double gy2  = s.nextDouble();
      System.out.println("x1, y1: " + gx1 + ", " + gy1 + "\n x2:, y2: "  + gx2 + ", " + gy1);
    }
    
    public void distanceXY(){
      double d; 
      double distance = Math.sqrt(Math.pow((gx1-gx2),2)+ Math.pow((gy1-gy2),2));
      System.out.println("The distance between the two points is: " + distance);
    
    }
    
}
*/
  



