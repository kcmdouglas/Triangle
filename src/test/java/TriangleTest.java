import org.junit.*;
import static org.junit.Assert.*;

public class TriangleTest{
Triangle triangle;

  @Before
  public void setUp() {
    triangle = new Triangle();
  }

  @Test
  public void isATriangle_sideOneSideTwoGreaterThanSideThree_false() {
    assertEquals(false, triangle.isATriangle(10, 10, 25));
  }
}
