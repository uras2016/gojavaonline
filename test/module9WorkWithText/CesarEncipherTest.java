package module9WorkWithText;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

public class CesarEncipherTest {
    CesarEncipher cesarEncipher;

    @After
    public void tearDown() throws Exception {
        System.out.println("After was runned");
    }

    @Test(timeout = 3000)
    public void test() throws Exception {
        String in = "Homework for module 11";
        boolean operation = true;
        String expected = "KyÒ⠿☜\u1CC9퀗䃅\u1FC5惀ꀔ惌鿅惇ꀔ悾ꀚ惆ꀊ恺\u9FD6悋";
        cesarEncipher = new CesarEncipher(in, true);

//        Assert.assertTrue(cesarEncipher.equals(expected));

        Assert.assertEquals(expected, cesarEncipher);
    }
}