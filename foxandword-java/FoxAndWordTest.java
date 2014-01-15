import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FoxAndWordTest {

    protected FoxAndWord solution;

    @Before
    public void setUp() {
        solution = new FoxAndWord();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String[] words = new String[]{"tokyo", "kyoto"};

        int expected = 1;
        int actual = solution.howManyPairs(words);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String[] words = new String[]{"aaaaa", "bbbbb"};

        int expected = 0;
        int actual = solution.howManyPairs(words);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String[] words = new String[]{"ababab", "bababa", "aaabbb"};

        int expected = 1;
        int actual = solution.howManyPairs(words);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String[] words = new String[]{"eel", "ele", "lee"};

        int expected = 3;
        int actual = solution.howManyPairs(words);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        String[] words = new String[]{"aaa", "aab", "aba", "abb", "baa", "bab", "bba", "bbb"};

        int expected = 6;
        int actual = solution.howManyPairs(words);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        String[] words = new String[]{"top", "coder"};

        int expected = 0;
        int actual = solution.howManyPairs(words);

        Assert.assertEquals(expected, actual);
    }

}
