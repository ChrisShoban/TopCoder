import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SuperRotTest {

    protected SuperRot solution;

    @Before
    public void setUp() {
        solution = new SuperRot();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String message = "Uryyb 28";

        String expected = "Hello 73";
        String actual = solution.decoder(message);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String message = "GbcPbqre";

        String expected = "TopCoder";
        String actual = solution.decoder(message);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String message = "";

        String expected = "";
        String actual = solution.decoder(message);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String message = "5678901234";

        String expected = "0123456789";
        String actual = solution.decoder(message);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        String message = "NnOoPpQqRr AaBbCcDdEe";

        String expected = "AaBbCcDdEe NnOoPpQqRr";
        String actual = solution.decoder(message);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        String message = "Gvzr vf 54 71 CZ ba Whyl 4gu bs gur lrne 7558 NQ";

        String expected = "Time is 09 26 PM on July 9th of the year 2003 AD";
        String actual = solution.decoder(message);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase6() {
        String message = "Gur dhvpx oebja sbk whzcf bire n ynml qbt";

        String expected = "The quick brown fox jumps over a lazy dog";
        String actual = solution.decoder(message);

        Assert.assertEquals(expected, actual);
    }

}
