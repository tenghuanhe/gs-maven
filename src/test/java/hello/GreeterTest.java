package hello;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

public class GreeterTest
{

  private final Greeter greeter = new Greeter();

  @Test
  public void greeterSaysHello()
  {
    assertThat(greeter.sayHello(), containsString("Hello"));
  }

  @Test
  public void testHelloWorld()
  {
    HelloWorld.main(null);
  }
}
