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

    @Test
    public void addAndRemoveTest() {
        q.add(1);
        q.add(2);
        q.add(3);
        
        boolean firstRemove = q.remove() == 1;
        boolean secondRemove = q.remove() == 2;  
        boolean thirdRemove = q.remove() == 3;
        
        q.add(1);

        boolean isEmpty = q.isEmpty();

        assertTrue(!isEmpty && firstRemove && secondRemove && thirdRemove);
    }
}
    