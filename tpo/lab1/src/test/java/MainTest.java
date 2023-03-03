import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {

    int[] array = {0, 34, 24, 86, 78, 12, 43, 100, 59, 34};
    @Test
    public void TestFirst() {
        var result = new BucketSorter().result(array)[0];
        assertEquals(0, result);
    }

    @Test
    public void TestFifth() {
        var result = new BucketSorter().result(array)[4];
        assertEquals(34, result);

    }

    @Test
    public void TestNingth() {
        var result = new BucketSorter().result(array)[8];
        assertEquals(86, result);
    }

    @Test
    public void TestTenth() {
        var result = new BucketSorter().result(array)[9];
        assertEquals(100, result);
    }
}
