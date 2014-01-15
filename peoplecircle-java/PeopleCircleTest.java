import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

// SRM 147 DIV 1 - 350 points
public class PeopleCircleTest {

    protected PeopleCircle solution;

    @Before
    public void setUp() {
        solution = new PeopleCircle();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int numMales = 5;
        int numFemales = 3;
        int K = 2;

        String expected = "MFMFMFMM";
        String actual = solution.order(numMales, numFemales, K);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int numMales = 7;
        int numFemales = 3;
        int K = 1;

        String expected = "FFFMMMMMMM";
        String actual = solution.order(numMales, numFemales, K);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int numMales = 25;
        int numFemales = 25;
        int K = 1000;

        String expected = "MMMMMFFFFFFMFMFMMMFFMFFFFFFFFFMMMMMMMFFMFMMMFMFMMF";
        String actual = solution.order(numMales, numFemales, K);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int numMales = 5;
        int numFemales = 5;
        int K = 3;

        String expected = "MFFMMFFMFM";
        String actual = solution.order(numMales, numFemales, K);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int numMales = 1;
        int numFemales = 0;
        int K = 245;

        String expected = "M";
        String actual = solution.order(numMales, numFemales, K);

        Assert.assertEquals(expected, actual);
    }

}
