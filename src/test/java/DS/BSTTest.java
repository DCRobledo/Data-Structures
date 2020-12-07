package DS;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
    
public class BSTTest {
    protected BST t;

    @Before
    public void setup(){
        t = new BST();
    }
        
    @Test
    public void createBSTTest() {
        int data[] = {1, 3, 5, 7, 2, 4, -1};
        for(int d : data) t.insert(t.root, d);

        assertTrue(t.checkBST(t.root));
    }

    @Test
    public void containsTest() {
        int data[] = {1, 3, 5, 7, 2, 4, -1};
        for(int d : data) t.insert(t.root, d);

        assertTrue(t.contains(t.root, 5) && t.contains(t.root, -1));
    }
}
    