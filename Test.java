
class test {

  // We test wether or not our mathematical methods work by calculating the results of area, circumference, point inside or not using a calculator and then comparing the result. 

  
  public void testRectArea() {
    // create new object 
    Rectangle rect1 = new Rectangle(3, 1, 7, 4, 5, 5, 5, 5, 10, 10);
    assertEquals(12, rect1.area());
  }



  

}
