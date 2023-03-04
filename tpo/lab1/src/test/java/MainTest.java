import org.junit.Test;

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

        Integer result = g.main(g, 2).get(3);
        if (result == null) {
            fail("You should use vertex number that exists");
        } else {
            assertEquals(Optional.of(3), Optional.of(result));
        }
    }

    @Test
    public void TestFifth() {
        Graph g = new Graph(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        Integer result = g.main(g, 2).get(0);
        if (result == null) {
            fail("You should use vertex number that exists");
        } else {
            assertEquals(Optional.of(2), Optional.of(result));
        }
    }

    @Test
    public void TestNingth() {
        Graph g = new Graph(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        Integer result = g.main(g, 2).get(1);
        if (result == null) {
            fail("You should use vertex number that exists");
        } else {
            assertEquals(Optional.of(0), Optional.of(result));
        }
    }

    @Test
    public void TestTenth() {
        Graph g = new Graph(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        Integer result = g.main(g, 2).get(2);
        if (result == null) {
            fail("You should use vertex number that exists");
        } else {
            assertEquals(Optional.of(1), Optional.of(result));
        }
    }
}
