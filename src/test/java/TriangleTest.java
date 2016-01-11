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

  @Test
  public void isATriangle_sideTwoSideThreeGreaterThanSideOne_false() {
    assertEquals(false, triangle.isATriangle(25, 10, 10));
  }

  @Test
  public void isATriangle_sideThreeSideOneGreaterThanSideTwo_false() {
    assertEquals(false, triangle.isATriangle(10, 25, 10));
  }

  @Test
  public void isATriangle_sideOneSideTwoLessThanSideThree_true() {
    assertEquals(true, triangle.isATriangle(10, 10, 15));
  }

  @Test
  public void typeOfTriangle_sideOneSideTwoEqualSideTwoSideThreeEqual_equilateral() {
    assertEquals("It's an equilateral!", triangle.typeOfTriangle(10, 10, 10));
  }

  @Test
  public void typeOfTriangle_sideOneSideTwoEqual_isosceles() {
    assertEquals("It's an isosceles!", triangle.typeOfTriangle(10, 10, 15));
  }

  @Test
  public void typeOfTriangle_sideTwoSideThreeEqual_isosceles() {
    assertEquals("It's an isosceles!", triangle.typeOfTriangle(15, 10, 10));
  }

  @Test
  public void typeOfTriangle_sideThreeSideOneEqual_isosceles() {
    assertEquals("It's an isosceles!", triangle.typeOfTriangle(10, 15, 10));
  }

  @Test
  public void typeOfTriangle_noSidesAreEqual_scalene() {
    assertEquals("It's a scalene!", triangle.typeOfTriangle(10, 15, 11));
  }

  @Test
  public void Triangle_SideOne10SideTwo10SideThree10_TriangleObject() {
    assertEquals(Triangle, new Triangle(10, 10, 10));
  }
}
