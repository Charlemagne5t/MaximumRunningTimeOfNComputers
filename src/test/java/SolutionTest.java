import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void maxRunTimeTest1() {
        int n = 2;
        int[] batteries = {3, 3, 3};
        long expected = 4L;
        long actual = new Solution().maxRunTime(n, batteries);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void maxRunTimeTest2() {
        int n = 2;
        int[] batteries = {1, 1, 1, 1};
        long expected = 2L;
        long actual = new Solution().maxRunTime(n, batteries);

        Assert.assertEquals(expected, actual);
    }
}
