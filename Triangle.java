public class Triangle extends Shapes {

  //coordinates for points ABC in the Triangle
  double x1, y1, x2, y2, x3, y3; 

  //coordinates for point P thats outside the triangle
  double x = 5, y = 6;
  
  double sideAB;
  double sideBC;
  double sideAC;

  public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
    this.x1 = x1;
    this.y1 = y1;
    this.x2 = x2;
    this.y2 = y2;
    this.x3 = x2;
    this.y3 = y1;
  }

  public double area() { 
    //Calculate the area of the triangle 
       return Math.abs((x1*(y2-y3) + x2*(y3-y1)+x3*(y1-y2))/2.0); 
    } 
  
  public double circumference() {
    //Calculate the length of the side AB
    double tri_xside = Math.pow(((x2)-(x1)),2);
    double tri_yside = Math.pow(((y2)-(y1)),2);
    sideAB = Math.sqrt((tri_xside+tri_yside));
    
    //Calculate the length of the side BC
    double tri_xside2 = Math.pow(((x3)-(x2)),2);
    double tri_yside2 = Math.pow(((y3)-(y2)),2);
    sideBC = Math.sqrt((tri_xside2+tri_yside2));
    
    //Calculate the length of the side AC
    double tri_xside3 = Math.pow(((x1)-(x3)),2);
    double tri_yside3 = Math.pow(((y1)-(y3)),2);
    sideAC = Math.sqrt((tri_xside3+tri_yside3));

    //add all the sides toghether to get the circumference
    return sideAB + sideBC + sideAC;
  }

  public boolean isInside() {        
//Area formula for a triangle given point
//Area =1/2[x1(y2 - y3) + x2(y3 - y1) + x3(y1 - y2)]
       // Calculate area of triangle ABC
        double A = Math.abs((x1*(y2-y3) + x2*(y3-y1)+x3*(y1-y2))/2.0); 
       
       // Calculate area of triangle PBC 
        double A1 = Math.abs((x*(y2-y3))+(x2*(y3-y))+(x3*(y-y2))/2.0); 
       
       // Calculate area of triangle PAC  
        double A2 = Math.abs((x1*(y-y3) + x*(y3-y1)+x3*(y1-y))/2.0); 
       
       // Calculate area of triangle PAB   
        double A3 = Math.abs((x1*(y2-y) + x2*(y-y1)+x*(y1-y2))/2.0); 
      
        if(A == A1 + A2 + A3){
          System.out.println("The point is inside the Triangle");
          return true;
        } else{
          System.out.print("The point is outside the Triangle");
          return false;
        }
    }

  public double centerx () { 
     //find the orthocentroid, cord x of a right triangle
     double centerx = (x3 + x2 + x1)/3;
     //System.out.print("\n The Center of the triangle is found at (x,y): " + OCX + ", " + OCY);
      return centerx; 

    }
    public double centery () { 
     //find the orthocentroid cord y of a right triangle
     double centery = (y3+y2+y1)/3;
     //System.out.print("The Center of the triangle is found at (x,y): " + OCX + ", " + OCY);
      return centery; 
  
    }
}
