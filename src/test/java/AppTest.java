import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class AppTest extends FluentTest {
  public WebDriver webDriver = new HtmlUnitDriver();
  public WebDriver getDefaultDriver() {
      return webDriver;
  }

  @ClassRule
  public static ServerRule server = new ServerRule();

  @Test
  public void rootTest() {
      goTo("http://localhost:4567/");
      assertThat(pageSource()).contains("Triangle Generator");
  }

  @Test
  public void rootTest_DimensionsSide1() {
    goTo("http://localhost:4567");
    assertThat(pageSource()).contains("Dimensions of side one:");
  }

  @Test
  public void rootTest_DimensionsSide2() {
    goTo("http://localhost:4567");
    assertThat(pageSource()).contains("Dimensions of side two:");
  }

  @Test
  public void rootTest_DimensionsSide3() {
    goTo("http://localhost:4567");
    assertThat(pageSource()).contains("Dimensions of side three:");
  }

  @Test
  public void results_equilateral() {
    goTo("http://localhost:4567");
    fill("#sideOneInput").with("10");
    fill("#sideTwoInput").with("10");
    fill("#sideThreeInput").with("10");
    submit(".btn");
    assertThat(pageSource()).contains("Side one: 10");
    assertThat(pageSource()).contains("Side two: 10");
    assertThat(pageSource()).contains("Side three: 10");
    assertThat(pageSource()).contains("It's an equilateral!");
  }


}
