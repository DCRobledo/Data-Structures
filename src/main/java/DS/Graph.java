package DS;

import java.util.LinkedList;
import java.util.List;

public class Graph {
    private class Edge {
        private int vertexOne, vertexTwo;
        private Edge(int vertexOne, int vertexTwo) {
            this.vertexOne = vertexOne;
            this.vertexTwo = vertexTwo;
        }
    }

    public List<Edge> edges[];

    public Graph (int numVertex) {
        edges = new LinkedList[numVertex];
        for(int i = 0; i<edges.length; i++)
            edges[i] = new LinkedList<Edge>();
    }

    public void addEdge(int edge, int vertexOne, int vertexTwo) {
        edges[edge].add(new Edge(vertexOne, vertexTwo));
    }
}
