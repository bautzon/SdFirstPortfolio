import java.util.Scanner;
import java.lang.Math.*;
import java.io.*;

public class GetPoints {
    public void getPoints() { 
      System.out.println("Please type the two coordinates x1, y1, x2, y2");
      Scanner s = new Scanner(System.in);
      double gx1 = s.nextDouble();
      double gy1 = s.nextDouble();
      double gx2 = s.nextDouble();
      double gy2 = s.nextDouble();
      System.out.println("x1, y1: " + gx1 + ", " + gy1 + "\n x2:, y2: " + gx2 + ", " + gy1);
      double distancexy = Math.sqrt(Math.pow((gx1 - gx2), 2) + Math.pow((gy1 - gy2), 2));
      System.out.println("The distance between the two points is: " + distancexy);
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
  



