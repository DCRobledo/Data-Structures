package DS;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

import org.junit.Before;    
    
public class TrieTest {
    protected Trie trie;

    @Before
    public void setup(){
        trie = new Trie();
    }
        
    @Test
    public void insertTest() {
        String keys[] = { "the", "a", "there", 
                      "answer", "any", "by", 
                      "bye", "their", "hero", "heroplane" };
        for (String word : keys) trie.insert(word);

        assertTrue(trie.find("hero") && !trie.find("word"));
    }

    @Test
    public void deleteTest() {
        String keys[] = { "the", "a", "there", 
                      "answer", "any", "by", 
                      "bye", "their", "hero", "heroplane" };
        for (String word : keys) trie.insert(word);
        
        trie.delete("hero");

        assertTrue(!trie.find("hero"));
    }
}
    