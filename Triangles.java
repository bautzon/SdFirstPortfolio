public class Triangles extends Shapes {

  int tri_x1, tri_y1, tri_x2, tri_y2, tri_x3, tri_y3; //coordinates for Triangles
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


  public double area(int tri_x1, int tri_y1, int tri_x2, int tri_y2, int tri_x3, int tri_y3) { 
       return Math.abs((tri_x1*(tri_y2-tri_y3) + tri_x2*(tri_y3-tri_y1)+tri_x3*(tri_y1-tri_y2))/2.0); 
    } 
  
  public double circumference(int tri_x1, int tri_y1, int tri_x2, int tri_y2, int tri_x3, int tri_y3) {
    
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
}
