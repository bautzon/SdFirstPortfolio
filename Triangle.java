public class Triangle extends Shapes {

  //coordinates for points ABC in the Triangle
  double tri_x1, tri_y1, tri_x2, tri_y2, tri_x3, tri_y3; 

  //coordinates for point P thats outside the triangle
  double tri_x = 5, tri_y = 6;
  
  double sideAB;
  double sideBC;
  double sideAC;

  public Triangle(int tri_x1, int tri_y1, int tri_x2, int tri_y2, int tri_x3, int tri_y3) {
    this.tri_x1 = tri_x1;
    this.tri_y1 = tri_y1;
    this.tri_x2 = tri_x2;
    this.tri_y2 = tri_y2;
    this.tri_x3 = tri_x3;
    this.tri_y3 = tri_y3;
  }

  public double area() { 
    //Calculate the area of the triangle 
       return Math.abs((tri_x1*(tri_y2-tri_y3) + tri_x2*(tri_y3-tri_y1)+tri_x3*(tri_y1-tri_y2))/2.0); 
    } 
  
  public double circumference() {
    //Calculate the length of the side AB
    double tri_xside = Math.pow(((tri_x2)-(tri_x1)),2);
    double tri_yside = Math.pow(((tri_y2)-(tri_y1)),2);
    sideAB = Math.sqrt((tri_xside+tri_yside));
    
    //Calculate the length of the side BC
    double tri_xside2 = Math.pow(((tri_x3)-(tri_x2)),2);
    double tri_yside2 = Math.pow(((tri_y3)-(tri_y2)),2);
    sideBC = Math.sqrt((tri_xside2+tri_yside2));
    
    //Calculate the length of the side AC
    double tri_xside3 = Math.pow(((tri_x1)-(tri_x3)),2);
    double tri_yside3 = Math.pow(((tri_y1)-(tri_y3)),2);
    sideAC = Math.sqrt((tri_xside3+tri_yside3));

    //add all the sides toghether to get the circumference
    return sideAB + sideBC + sideAC;
  }

  public boolean isInside() {        


//Area formula for a triangle given point
//Area =1/2[x1(y2 - y3) + x2(y3 - y1) + x3(y1 - y2)]
       // Calculate area of triangle ABC
        double A = Math.abs((tri_x1*(tri_y2-tri_y3) + tri_x2*(tri_y3-tri_y1)+tri_x3*(tri_y1-tri_y2))/2.0); 
       
       // Calculate area of triangle PBC 
        double A1 = Math.abs((tri_x*(tri_y2-tri_y3))+(tri_x2*(tri_y3-tri_y))+(tri_x3*(tri_y-tri_y2))/2.0); 
       
       // Calculate area of triangle PAC  
        double A2 = Math.abs((tri_x1*(tri_y-tri_y3) + tri_x*(tri_y3-tri_y1)+tri_x3*(tri_y1-tri_y))/2.0); 
       
       // Calculate area of triangle PAB   
        double A3 = Math.abs((tri_x1*(tri_y2-tri_y) + tri_x2*(tri_y-tri_y1)+tri_x*(tri_y1-tri_y2))/2.0); 
      
        return (A == A1 + A2 + A3); 
    }

  public double centerx () { 
     //find the orthocentroid, cord x of a right triangle
     double centerx = (tri_x3 + tri_x2 + tri_x1)/3;
     //System.out.print("\n The Center of the triangle is found at (x,y): " + OCX + ", " + OCY);
      return centerx; 

    }
    public double centery () { 
     //find the orthocentroid cord y of a right triangle
     double centery = (tri_y3+tri_y2+tri_y1)/3;
     //System.out.print("The Center of the triangle is found at (x,y): " + OCX + ", " + OCY);
      return centery; 
  
    }
}
