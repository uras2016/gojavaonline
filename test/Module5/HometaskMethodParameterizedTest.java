package Module5;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)

public class HometaskMethodParameterizedTest {

    public static final HometaskMethod homeTaskMethod = new HometaskMethod();
    int[] intArray;

    int expectedMin;

    public HometaskMethodParameterizedTest(int[] intArray, int expectedMin) {
        this.intArray = intArray;

        this.expectedMin = expectedMin;
    }

    @Parameterized.Parameters(name = "{index}:  (min is {1}") // тестовое сообщение
    public static Collection<Object[]> data() {
        int[] intArray1 = {1, -4, -5};
        int[] intArray2 = {78, 87, -7};
        int[] intArray3 = {-34, 2, 15};


        return Arrays.asList(new Object[][]{
                {intArray1, -5},
                {intArray2, -7},
                {intArray3, -34},

        }

        );
}

    @Test(timeout = 3000)
    public void testSortingMin() throws Exception {
        Assert.assertEquals(expectedMin, homeTaskMethod.sortingMin(intArray));
    }



//    @Test
//    public void testSortingMax() throws Exception {
//
//    }
}