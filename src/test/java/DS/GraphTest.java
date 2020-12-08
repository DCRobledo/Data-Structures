package DS;
import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertEquals;

import java.util.LinkedList;
    
public class GraphTest {
    protected Graph g;

    @Before
    public void setup(){
        g = new Graph(6);
    }
        
    @Test
    public void addAndTraverseTest() {
        int vertexOne[] = {1, 2, 3, 4, 5, 6};
        int vertexTwo[] = {2, 4, 5, 3, 1, 3};

        for(int i = 0; i<6; i++)
            g.addEdge(i, vertexOne[i], vertexTwo[i]);
        
        LinkedList<Integer> expected = new LinkedList<>();
        expected.add(1);
        expected.add(2);
        expected.add(4);
        expected.add(3);
        expected.add(5);
        expected.add(6);

        assertEquals(expected, g.traverse());
    }
}
    