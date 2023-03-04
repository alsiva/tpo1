import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class MainTest {

    @Test
    public void TestFirst() {
        Graph g = new Graph(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        List<Integer> expectedResult = Arrays.asList(2, 0, 1, 3);
        List<Integer> realResult = g.main(g, 2);
        assertEquals(expectedResult, realResult);
    }

    @Test
    public void TestFifth() {
        Graph g = new Graph(1);
        g.addEdge(0, 0);

        List<Integer> expectedResult = Arrays.asList(0);
        List<Integer> realResult = g.main(g, 0);
        assertEquals(expectedResult, realResult);
    }

    @Test
    public void TestNingth() {
        Graph g = new Graph(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(0, 3);
        g.addEdge(1, 0);
        g.addEdge(2, 0);
        g.addEdge(3, 0);

        List<Integer> expectedResult = Arrays.asList(0, 1, 2, 3);
        List<Integer> realResult = g.main(g, 0);
        assertEquals(expectedResult, realResult);
    }

    @Test
    public void TestTenth() {
        Graph g = new Graph(5);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 0);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 0);
        g.addEdge(3, 1);
        g.addEdge(4, 1);


        List<Integer> expectedResult = Arrays.asList(0, 1, 3, 4, 2);
        List<Integer> realResult = g.main(g, 0);
        assertEquals(expectedResult, realResult);
    }
}
