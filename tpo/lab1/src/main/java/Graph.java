// Java program to print DFS
// traversal from a given
// graph
import java.io.*;
import java.util.*;

// This class represents a
// directed graph using adjacency
// list representation
class Graph {
    private int V; // No. of vertices

    // Array  of lists for
    // Adjacency List Representation
    private LinkedList<Integer>[] adj;

    // Constructor
    @SuppressWarnings("unchecked") Graph(int v)
    {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList();
    }

    // Function to add an edge into the graph
    void addEdge(int v, int w)
    {
        adj[v].add(w); // Add w to v's list.
    }

    // A function used by DFS
    List<Integer> DFSUtil(int v, boolean[] visited, List<Integer> visitOrder)
    {
        // Mark the current node as visited and print it
        visited[v] = true;
        visitOrder.add(v);


        // Recur for all the vertices adjacent to this
        // vertex
        Iterator<Integer> i = adj[v].listIterator();
        while (i.hasNext()) {
            int n = i.next();
            if (!visited[n]) {
                DFSUtil(n, visited, visitOrder);
            }
        }

        return visitOrder;
    }

    // The function to do DFS traversal.
    // It uses recursive
    // DFSUtil()
    List<Integer> DFS(int v)
    {
        // Mark all the vertices as
        // not visited(set as
        // false by default in java)
        boolean[] visited = new boolean[V];
        List<Integer> orderOfVisits = new ArrayList<>();

        // Call the recursive helper
        // function to print DFS
        // traversal
        return DFSUtil(v, visited, orderOfVisits);
    }

    // Driver's Code
    public List<Integer> main(Graph g, int vertex)
    {
        return g.DFS(vertex);
    }
}
// This code is contributed by Aakash Hasija