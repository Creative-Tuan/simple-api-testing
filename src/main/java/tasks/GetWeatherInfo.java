package tasks;

import io.restassured.response.Response;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import java.util.Map;

import static config.Config.*;
import static config.ServiceKey.LATEST_WEATHER_INFO;
import static io.restassured.RestAssured.given;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GetWeatherInfo implements Task {

  protected Map<String, String> queryParams;

  public GetWeatherInfo(Map<String, String> queryParams) {
    this.queryParams = queryParams;
  }

  public static GetWeatherInfo withInfo(Map<String, String> queryParams) {
    return instrumented(GetWeatherInfo.class, queryParams);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    String baseUri = MOUNTEBANK_DOMAIN + HOST + DATA + VERSION + WEATHER;
    Response response = given()
      .baseUri(baseUri)
      .contentType("application/json")
      .queryParams(queryParams)
      .get();

    actor.remember(LATEST_WEATHER_INFO, response);
  }
}
