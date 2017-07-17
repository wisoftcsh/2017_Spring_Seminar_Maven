package chap02;

/**
 * Created by choiseonho on 2017. 7. 17..
 */
public class Greeter {
  private String format;

  public String greet(String guest){
    return String.format(format, guest);
  }

  public void setFormat(String format){
    this.format = format;
  }
}
