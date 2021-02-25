import org.junit.Test;

import static org.junit.Assert.*;
public class InfixTest {

    @Test
    public void infixToPostfix() {
        Infix in = new Infix((""));
        String res =  in.infixToPostfix("3+6");

        assertEquals("36+",res);
    }
}