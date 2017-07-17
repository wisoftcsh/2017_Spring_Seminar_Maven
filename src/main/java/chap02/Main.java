package chap02;

import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Created by choiseonho on 2017. 7. 17..
 */
public class Main {
  public static void main(String[] args) {
    GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:chap02/applicationContext.xml");
    Greeter g = ctx.getBean("greeter", Greeter.class);
    String msg = g.greet("스프링");
    System.out.println(msg);
    ctx.close();
  }
}
