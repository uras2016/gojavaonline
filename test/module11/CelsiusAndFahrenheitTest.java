package module11;


import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class CelsiusAndFahrenheitTest {
    public static CelsiusAndFahrenheit celsiusAndFahrenheit;

    @BeforeClass
    public static void setUpClass() throws Exception {
        celsiusAndFahrenheit = new CelsiusAndFahrenheit();
        System.out.printf("OK");

    }

    @Test(timeout = 3000)
    public void testCelsiusToFahrenheit() throws Exception {

        final double a = 50.0;
        final double result = celsiusAndFahrenheit.celsiusToFahrenheit(a);


        Assert.assertEquals("122.0", Double.toString(result));

    }
    @Test(timeout = 3000)
    public void testFahrenheitToCelsius() throws Exception {

        final double a = 350;
        final double result = celsiusAndFahrenheit.fahrenheitToCelsius(a);

        Assert.assertEquals("176.66666666666666", Double.toString(result));

    }



}