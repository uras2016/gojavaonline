package module11;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CelsiusTest {
    public static Celsius celsius;

    @Before
    public void setUp() throws Exception {
        celsius = new Celsius();
        System.out.printf("OK");

    }

    @Test(timeout = 3000)
    public void testMain() throws Exception {
    int a = 10;
        float result = celsius.temp(a);

        assertEquals(50, celsius.temp(a));

    }




}