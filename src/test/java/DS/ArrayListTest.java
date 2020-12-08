package DS;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

import org.junit.Before;    
    
public class ArrayListTest {
    protected ArrayList al;

    @Before
    public void setup(){
        al = new ArrayList();
    }
        
    @Test
    public void addTest() {
        int data[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for(int d : data) al.add(d);

        assertTrue((int) al.get(0) == 1 && (int) al.get(8) == 9);
    }

    @Test
    public void removeTest() {
        int data[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for(int d : data) al.add(d);

        al.remove(4);
        
        assertTrue((int) al.get(0) == 1 && (int) al.get(7) == 9);
    }
}
    