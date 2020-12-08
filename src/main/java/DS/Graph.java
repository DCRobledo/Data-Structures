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

    public List<Integer> traverse() {
        LinkedList<Integer> result = new LinkedList<>();

        LinkedList<Integer> visited = new LinkedList<>();
        
        for(int i = 0; i<edges.length; i++) visited.add(i, null);

        for(int i = 0; i < edges.length; i++) {
            int vertexOne = edges[i].get(0).vertexOne;
            int vertexTwo = edges[i].get(0).vertexTwo;

            if(!visited.contains(vertexOne)) {
                result.add(vertexOne);
                visited.add(vertexOne);
            }

            if(!visited.contains(vertexTwo)) {
                result.add(vertexTwo);
                visited.add(vertexTwo);
            }
        }

        return result;
    }
}
