package api;

import com.google.gson.Gson;
import groovy.transform.Internal;
import io.restassured.response.Response;
import jdk.nashorn.internal.ir.debug.JSONWriter;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import net.thucydides.core.annotations.Title;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import tasks.GetWeatherInfo;

import java.util.HashMap;

import static config.Config.*;
import static config.ServiceKey.LATEST_WEATHER_INFO;
import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;
import static tasks.GetWeatherInfo.withInfo;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value = "api/get_weather_info/API_Get_Weather_Info_Test_Data.csv", separator = '|')
public class API_Get_Weather_Info_Test {
  private static Actor actor = new Actor("Jonathan").can(CallAnApi.at(MOUNTEBANK_DOMAIN));
  private HashMap temp = new HashMap();

  private String testCaseKey;
  private String testCaseName;
  private String testLocation;
  private String testAppID;
  private Integer expectedHTTPCode;
  private String expectedResultBody;

  @BeforeClass
  public static void setUp() {
    // do nothing
  }

  @Before
  public void prepareData() {
    temp.put("q", testLocation);
    temp.put("appid", testAppID);
  }

  @Title("")
  @Test()
  public void performTest() {
    when(actor).attemptsTo(withInfo(temp));
    Response resp = actor.recall(LATEST_WEATHER_INFO);

    resp.then().statusCode(expectedHTTPCode);
    assertEquals(true, compareBody(resp.body().asString(), expectedResultBody));
  }

  @Internal
  public boolean compareBody(String actual, String expected) {
    boolean result = false;

    String temp1 = actual.replaceAll("[ ]+", "").replace("\n", "");
    String temp2 = expected.replaceAll("[ ]+", "");

    return result ? temp1.equalsIgnoreCase(temp2) : temp1.equals(temp2);
  }
}
