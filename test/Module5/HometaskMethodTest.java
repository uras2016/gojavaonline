package Module5;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HometaskMethodTest {


    @Before
    public void setUp() throws Exception {
       HometaskMethod hometaskMethod = new HometaskMethod();
        System.out.println("Work");

    }

    @Test(timeout = 3000)
    public void testSorting() throws Exception {
        HometaskMethod hometaskMethod=new HometaskMethod();
        int[] firstArray = {1, 2, 5, -10, 0};
        hometaskMethod.sorting(firstArray);

        Assert.assertEquals(firstArray[3], hometaskMethod.sorting(firstArray));


    }
}