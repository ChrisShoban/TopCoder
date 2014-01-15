import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FuelConsumptionTest {

    protected FuelConsumption solution;

    @Before
    public void setUp() {
        solution = new FuelConsumption();
    }

    public static void assertEquals(double expected, double actual) {
        if (Double.isNaN(expected)) {
            Assert.assertTrue("expected: <NaN> but was: <" + actual + ">", Double.isNaN(actual));
            return;
        }
        double delta = Math.max(1e-9, 1e-9 * Math.abs(expected));
        Assert.assertEquals(expected, actual, delta);
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int[] velocities = new int[]{100};
        int[] consumptions = new int[]{10000};
        int fuel = 10000;

        double expected = 100.0;
        double actual = solution.maximalDistance(velocities, consumptions, fuel);

        assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int[] velocities = new int[]{70, 80, 90, 100, 60, 110};
        int[] consumptions = new int[]{4000, 4000, 4000, 4000, 4000, 4000};
        int fuel = 40000;

        double expected = 1100.0;
        double actual = solution.maximalDistance(velocities, consumptions, fuel);

        assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int[] velocities = new int[]{250, 240, 230, 220, 210, 211};
        int[] consumptions = new int[]{5000, 4500, 4000, 3500, 3000, 3000};
        int fuel = 50000;

        double expected = 3516.6666666666665;
        double actual = solution.maximalDistance(velocities, consumptions, fuel);

        assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int[] velocities = new int[]{5, 10, 20, 40, 80};
        int[] consumptions = new int[]{1000, 2500, 6250, 9000, 18000};
        int fuel = 47832;

        double expected = 239.16;
        double actual = solution.maximalDistance(velocities, consumptions, fuel);

        assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int[] velocities = new int[]{5, 10, 20, 40, 80, 160};
        int[] consumptions = new int[]{1000, 2500, 6250, 8000, 9500, 20000};
        int fuel = 47832;

        double expected = 402.79578947368424;
        double actual = solution.maximalDistance(velocities, consumptions, fuel);

        assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        int[] velocities = new int[]{240, 195, 130, 133, 15, 160, 111, 206, 72, 149, 146, 115, 235, 183, 102, 96, 163, 61, 196, 52, 87, 139, 33, 7, 90, 67, 118, 227, 197, 114};
        int[] consumptions = new int[]{14837, 2981, 17292, 18591, 4832, 7461, 17991, 18369, 18291, 9400, 15179, 3317, 2595, 2441, 6936, 8028, 14973, 18981, 12503, 7816, 2883, 6385, 6230, 18157, 16567, 9310, 2866, 4687, 14171, 4477};
        int fuel = 31710;

        double expected = 2871.6184971098264;
        double actual = solution.maximalDistance(velocities, consumptions, fuel);

        assertEquals(expected, actual);
    }

}
