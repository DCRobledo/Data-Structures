package DS;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;    
    
public class LinkedListTest {
    protected LinkedList l;


    @Before
    public void setup(){
        l = new LinkedList();
    }
        
    @Test
    public void appendTest() {
        l.append(1);

        assertEquals(1, l.get(0));
    }

    @Test
    public void prependTest() {
        l.append(1);
        l.append(2);
        l.prepend(3);

        assertEquals(3, l.get(0));
    }

    @Test
    public void deleteWithValueTest() {
        l.append(1);
        l.append(2);
        l.prepend(3);

        l.deleteWithValue(3);

        assertEquals(1, l.get(0));
    }
}
    