package DS;
import org.junit.Test;
import org.junit.Before;  
import static org.junit.Assert.*;  
    
public class StackTest {
    protected Stack s;

    @Before
    public void setup(){
        s = new Stack();
    }
        
    @Test
    public void isEmptyTest() {
        assertTrue(s.isEmpty());
    }

    @Test
    public void peekTest() {
        s.push(3);
        assertEquals(3, s.peek());
    }

    @Test
    public void addAndRemoveTest() {
        s.push(1);
        s.push(2);
        s.push(3);

        boolean firstRemove = s.pop() == 3;
        boolean secondRemove = s.pop() == 2;  
        boolean thirdRemove = s.pop() == 1;
        
        s.push(1);

        boolean isEmpty = s.isEmpty();

        assertTrue(!isEmpty && firstRemove && secondRemove && thirdRemove);
    }
}
    