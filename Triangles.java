public class Triangles extends Shapes {

  double tri_x1, tri_y1, tri_x2, tri_y2, tri_x3, tri_y3; //coordinates for Triangles
  double tri_x = 5, tri_y = 6;
  
  double sideAB;
  double sideBC;
  double sideAC;

  public Triangles(int tri_x1, int tri_y1, int tri_x2, int tri_y2, int tri_x3, int tri_y3) {
    this.tri_x1 = tri_x1;
    this.tri_y1 = tri_y1;
    this.tri_x2 = tri_x2;
    this.tri_y2 = tri_y2;
    this.tri_x3 = tri_x3;
    this.tri_y3 = tri_y3;
  }

  
  public double area() { 
       return Math.abs((tri_x1*(tri_y2-tri_y3) + tri_x2*(tri_y3-tri_y1)+tri_x3*(tri_y1-tri_y2))/2.0); 
    } 
  
  public double circumference() {
    
    double tri_xside = Math.pow(((tri_x2)-(tri_x1)),2);
    double tri_yside = Math.pow(((tri_y2)-(tri_y1)),2);
    sideAB = Math.sqrt((tri_xside+tri_yside));
    
    double tri_xside2 = Math.pow(((tri_x3)-(tri_x2)),2);
    double tri_yside2 = Math.pow(((tri_y3)-(tri_y2)),2);
    sideBC = Math.sqrt((tri_xside2+tri_yside2));
    
    double tri_xside3 = Math.pow(((tri_x1)-(tri_x3)),2);
    double tri_yside3 = Math.pow(((tri_y1)-(tri_y3)),2);
    sideAC = Math.sqrt((tri_xside3+tri_yside3));

    return sideAB + sideBC + sideAC;
  }

  public boolean isInside() {        

       /* Calculate area of triangle ABC */
        double A = Math.abs((tri_x1*(tri_y2-tri_y3) + tri_x2*(tri_y3-tri_y1)+tri_x3*(tri_y1-tri_y2))/2.0); 
       
       /* Calculate area of triangle PBC */  
        double A1 = Math.abs((tri_x*(tri_y2-tri_y3))+(tri_x2*(tri_y3-tri_y))+(tri_x3*(tri_y-tri_y2))/2.0); 
       
       /* Calculate area of triangle PAC */  
        double A2 = Math.abs((tri_x1*(tri_y-tri_y3) + tri_x*(tri_y3-tri_y1)+tri_x3*(tri_y1-tri_y))/2.0); 
        
        //(tri_x1, tri_y1, tri_x, tri_y, tri_x3, tri_y3); 
       
       /* Calculate area of triangle PAB */   
        double A3 = Math.abs((tri_x1*(tri_y2-tri_y) + tri_x2*(tri_y-tri_y1)+tri_x*(tri_y1-tri_y2))/2.0); 
        
        //(tri_x1, tri_y1, tri_x2, tri_y2, tri_x, tri_y); 
         
       /* Check if sum of A1, A2 and A3 is same as A */
        return (A == A1 + A2 + A3); 
    } 
}

