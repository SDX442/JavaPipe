package pipe.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// REMOVE @SpringBootTest - use simple JUnit tests
class AppTest {

    @Test
    void simpleTest() {
        assertEquals(2, 1 + 1);
    }
    
    @Test
    void additionTest() {
        assertEquals(5, 2 + 3);
        assertEquals(0, 0 + 0);
        assertEquals(-5, -10 + 5);
    }
    
    @Test
    void alwaysTrue() {
        assertTrue(true);
        assertFalse(false);
    }
}