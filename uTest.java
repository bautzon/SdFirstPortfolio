import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class uTest {
    
//RECTANGLE TEST
    @Test
    public void testRectArea() {
        Rectangle rect1 = new Rectangle(1, 1, 3, 3, 5, 5);

        // double expected, double actual, double delta
        assertEquals(12, rect1.area(), 0);
    }

    @Test
    public void testRectCircumference() {
        Rectangle rect1 = new Rectangle(1, 1, 3, 3, 5, 5);

        // double expected, double actual, double delta
        assertEquals(10, rect1.circumference(), 0);
    }

    //tests the center coordinate x

    @Test
    public void testRectCenterX() {
        Rectangle rect1 = new Rectangle(1, 1, 3, 3, 5, 5);

        // double expected, double actual, double delta
        assertEquals(2, rect1.centerx(), 0);
    }

    //tests the center coordinate y
    @Test
    public void testRectCenterY() {
        Rectangle rect1 = new Rectangle(1, 1, 3, 3, 5, 5);

        // double expected, double actual, double delta
        assertEquals(1.5, rect1.centery(), 0);
    } 

    @Test
    public void testRectIsInside () {
        Rectangle rect1 = new Rectangle(1, 1, 3, 3, 5, 5);
    
        // double expected, double actual
        assertEquals(false, rect1.isInside());
    }
	
  //Triangle Test
	@Test
    public void testTriArea() {
        Triangle Tri1 = new Triangle(1, 1, 3, 3, 5, 5);

        // double expected, double actual, double delta
        assertEquals(3, Tri1.area(), 0);
    }
    @Test
    public void testTriCircumference() {
        Triangle Tri1 = new Triangle(1, 1, 3, 3, 5, 5);
        
        // double expected, double actual, double delta
        assertEquals(8.60555127546399, Tri1.circumference(), 0);
    }

    //tests the center coordinate x

    @Test
    public void testTriCenterX() {
        Triangle Tri1 = new Triangle(1, 1, 3, 3, 5, 5);

        // double expected, double actual, double delta
        assertEquals(2.3333333333333335, Tri1.centerx(), 0);
    }

    //tests the center coordinate y
    @Test
    public void testTriCenterY() {
        Triangle Tri1 = new Triangle(1, 1, 3, 3, 5, 5);

        // double expected, double actual, double delta
        assertEquals(2.0, Tri1.centery(), 0);
    } 

    @Test
    public void testTriIsInside () {
        Triangle Tri1 = new Triangle(1, 1, 3, 3, 5, 5);
    
        // double expected, double actual
        assertEquals(false, Tri1.isInside());
    }





}