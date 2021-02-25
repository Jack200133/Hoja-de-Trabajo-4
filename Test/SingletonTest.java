import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingletonTest {

    @Test
    void getStack() {
        Stack e = Singleton.getStack("");

        assertEquals(e.getClass(),Singleton.getStack("").getClass());
    }
}