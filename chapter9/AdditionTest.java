import org.junit.Test;
import static org.junit.Assert.*;

public class AdditionTest {
    @Test
    public void testAddition() {
        int a = 2;
        int b = 3;
        int result = Addition.add(a, b);
        assertEquals(5, result);
    }
}

class Addition {
    public static int add(int a, int b) {
        return a + b;
    }
}