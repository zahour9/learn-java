import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

public class wordsTest {

    @Test
    public void testWordsMethodWithSimpleSentence() {
        List<String> result = words.wordsMethod("I have a cat and a dog.");
        assertEquals(6, result.size());
        assertTrue(result.contains("I x 1"));
        assertTrue(result.contains("have x 1"));
        assertTrue(result.contains("a x 2"));
        assertTrue(result.contains("cat x 1"));
        assertTrue(result.contains("and x 1"));
        assertTrue(result.contains("dog x 1"));
    }

    @Test
    public void testWordsMethodWithEmptyString() {
        List<String> result = words.wordsMethod("");
        assertEquals(1, result.size());
        assertTrue(result.contains(""));
    }

    @Test
    public void testWordsMethodWithSpecialCharacters() {
        List<String> result = words.wordsMethod("Hello, world! Hello!!!");
        assertEquals(2, result.size());
        assertTrue(result.contains("Hello x 2"));
        assertTrue(result.contains("world x 1"));
    }

    @Test
    public void testWordsMethodWithMixedCase() {
        List<String> result = words.wordsMethod("Hello hello HELLO");
        assertEquals(3, result.size());
        assertTrue(result.contains("Hello x 1"));
        assertTrue(result.contains("hello x 1"));
        assertTrue(result.contains("HELLO x 1"));
    }
}