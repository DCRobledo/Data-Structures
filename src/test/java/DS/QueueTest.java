package DS;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;    
    
public class QueueTest {
    protected Queue q;

    @Before
    public void setup(){
        q = new Queue();
    }
        
    @Test
    public void isEmptyTest() {
        assertTrue(q.isEmpty());
    }

    @Test
    public void peekTest() {
        q.add(3);
        assertEquals(3, q.peek());
    }
}
    