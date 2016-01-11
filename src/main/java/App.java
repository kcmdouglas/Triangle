import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");
      String layout = "templates/layout.vtl";

      get("/", (request, response) -> {
        HashMap<String, Object> model = new HashMap<String, Object>();
        model.put("template", "templates/home.vtl");
        return new ModelAndView(model, layout);
      }, new VelocityTemplateEngine());

      get("/results", (request, response) -> {
        HashMap model = new HashMap();
        model.put("template", "templates/results.vtl" );
        int sideOne = Integer.parseInt(request.queryParams("sideOneInput"));
        int sideTwo = Integer.parseInt(request.queryParams("sideTwoInput"));
        int sideThree = Integer.parseInt(request.queryParams("sideThreeInput"));

        Triangle myTriangle = new Triangle(sideOne, sideTwo, sideThree);

        if (myTriangle.isATriangle() == true) {
          model.put("sideOne", sideOne);
          model.put("sideTwo", sideTwo);
          model.put("sideThree", sideThree);
          model.put("typeOfTriangle", myTriangle.typeOfTriangle());
        } else {
          model.put("typeOfTriangle", "Whoops! That's not a triangle!");
          model.put("sideOne", sideOne);
          model.put("sideTwo", sideTwo);
          model.put("sideThree", sideThree);
        }
        return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }
}
