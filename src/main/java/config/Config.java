package config;

public class Config {

  private Config() {
    // do nothing
  }

  public static final String MOUNTEBANK_DOMAIN;
  public static final String HOST = "/api.openweathermap.org";
  public static final String DATA = "/data";
  public static final String VERSION = "/2.5";
  public static final String WEATHER = "/weather";

  static {
    MOUNTEBANK_DOMAIN = "http://localhost:5555";
  }
}
