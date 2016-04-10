package Module5;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class HometaskMethodTest {
    public static HometaskMethod hometaskMethod;

    @BeforeClass
    public static void setUpClass() throws Exception {
       hometaskMethod = new HometaskMethod();
        System.out.println("Work");

    }

    @Test(timeout = 3000)
    public void testSortingMin() throws Exception {
        hometaskMethod=new HometaskMethod();
        int[] firstArray = {1, 2, 5, -10, 0};
        hometaskMethod.sortingMin(firstArray);

        Assert.assertEquals(firstArray[3], hometaskMethod.sortingMin(firstArray));

    }

    @Test
    public void testSortingMax() throws Exception {
        hometaskMethod=new HometaskMethod();
        int[] firstArray = {1, 2, 5, -10, 0};
        hometaskMethod.sortingMax(firstArray);

        Assert.assertEquals(firstArray[2], hometaskMethod.sortingMax(firstArray));
    }




}
