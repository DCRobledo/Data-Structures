package DS;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;    
    
public class HeapTest {
    protected Heap h;

    @Before
    public void setup(){
        h = new Heap();
    }
        
    @Test
    public void peekTest() {
        int data[] = {1, 3, 5, 7, 2, 4, -1};
        for(int d : data) h.add(d);

        assertEquals(-1, h.peek());
    }

    @Test
    public void pollTest() {
        int data[] = {1, 3, 5, 7, 2, 4, -1};
        for(int d : data) h.add(d);

        int poll = h.poll();
        int peek = h.peek();

        assertTrue(poll == -1 && peek == 1);
    }
}
    