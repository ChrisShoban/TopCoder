import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RoundaboutTest {

    protected Roundabout solution;

    @Before
    public void setUp() {
        solution = new Roundabout();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String north = "--";
        String east = "--";
        String south = "WE";
        String west = "-S";

        int expected = 6;
        int actual = solution.clearUpTime(north, east, south, west);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String north = "WWW";
        String east = "NNN";
        String south = "---";
        String west = "---";

        int expected = 9;
        int actual = solution.clearUpTime(north, east, south, west);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String north = "SSS";
        String east = "WW-";
        String south = "N";
        String west = "S------";

        int expected = 13;
        int actual = solution.clearUpTime(north, east, south, west);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String north = "SSS-";
        String east = "--W---W";
        String south = "WE";
        String west = "-S";

        int expected = 14;
        int actual = solution.clearUpTime(north, east, south, west);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        String north = "E";
        String east = "-N";
        String south = "W";
        String west = "-S";

        int expected = 5;
        int actual = solution.clearUpTime(north, east, south, west);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        String north = "";
        String east = "";
        String south = "";
        String west = "";

        int expected = 0;
        int actual = solution.clearUpTime(north, east, south, west);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase6() {
        String north = "W";
        String east = "";
        String south = "--E";
        String west = "";

        int expected = 6;
        int actual = solution.clearUpTime(north, east, south, west);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase7() {
        String north = "ES";
        String east = "N";
        String south = "E";
        String west = "";

        int expected = 9;
        int actual = solution.clearUpTime(north, east, south, west);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase8() {
        String north = "E";
        String east = "SN";
        String south = "-N";
        String west = "S-E";

        int expected = 12;
        int actual = solution.clearUpTime(north, east, south, west);

        Assert.assertEquals(expected, actual);
    }
    
    @Test(timeout = 2000)
    public void testCase9() {
        String north = "E------";
        String east =  "-------";
        String south = "-------";
        String west =  "-------";

        int expected = 5;
        int actual = solution.clearUpTime(north, east, south, west);

        Assert.assertEquals(expected, actual);
    }

}
