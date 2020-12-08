package DS;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

import org.junit.Before;    
    
public class HashTableTest {
    protected HashTable ht;

    @Before
    public void setup(){
        ht = new HashTable<>();
    }
        
    @Test
    public void addTest() {
        String keys[] = {"one", "two", "three", "four", "five",
                         "six", "seven", "eight", "nine", "ten"};
        int values[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for(int i = 0; i<keys.length; i++)
            ht.add(keys[i], values[i]);
        
        assertTrue((int) ht.get("two") == 2 && (int) ht.get("eight") == 8);
    }

    @Test
    public void removeTest() {
        String keys[] = {"one", "two", "three", "four", "five",
                         "six", "seven", "eight", "nine", "ten"};
        int values[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for(int i = 0; i<keys.length; i++)
            ht.add(keys[i], values[i]);

        boolean preRemoveGet = (int) ht.get("seven") == 7;
        
        ht.remove("seven");

        boolean postRemoveGet = ht.get("seven") == null;
        
        assertTrue(preRemoveGet && postRemoveGet);
    }
}
    