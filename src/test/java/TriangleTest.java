import org.junit.*;
import static org.junit.Assert.*;

public class TriangleTest{
// Triangle triangle;
//
//   @Before
//   public void setUp() {
//     triangle = new Triangle();
//   }

  @Test
  public void isATriangle_sideOneSideTwoGreaterThanSideThree_false() {
    Triangle triangle = new Triangle(10, 10, 25);
    assertEquals(false, triangle.isATriangle());
  }

  @Test
  public void isATriangle_sideTwoSideThreeGreaterThanSideOne_false() {
    Triangle triangle = new Triangle(25, 10, 10);
    assertEquals(false, triangle.isATriangle());
  }

  @Test
  public void isATriangle_sideThreeSideOneGreaterThanSideTwo_false() {
    Triangle triangle = new Triangle(10, 25, 10);
    assertEquals(false, triangle.isATriangle());
  }

  @Test
  public void isATriangle_sideOneSideTwoLessThanSideThree_true() {
    Triangle triangle = new Triangle(10, 10, 15);
    assertEquals(true, triangle.isATriangle());
  }

  @Test
  public void typeOfTriangle_sideOneSideTwoEqualSideTwoSideThreeEqual_equilateral() {
    Triangle triangle = new Triangle(10, 10, 10);
    assertEquals("It's an equilateral!", triangle.typeOfTriangle());
  }

  @Test
  public void typeOfTriangle_sideOneSideTwoEqual_isosceles() {
    Triangle triangle = new Triangle(10, 10, 15);
    assertEquals("It's an isosceles!", triangle.typeOfTriangle());
  }

  @Test
  public void typeOfTriangle_sideTwoSideThreeEqual_isosceles() {
    Triangle triangle = new Triangle(15, 10, 10);
    assertEquals("It's an isosceles!", triangle.typeOfTriangle());
  }

  @Test
  public void typeOfTriangle_sideThreeSideOneEqual_isosceles() {
    Triangle triangle = new Triangle(10, 15, 10);
    assertEquals("It's an isosceles!", triangle.typeOfTriangle());
  }

  @Test
  public void typeOfTriangle_noSidesAreEqual_scalene() {
    Triangle triangle = new Triangle(10, 15, 11);
    assertEquals("It's a scalene!", triangle.typeOfTriangle());
  }
}
