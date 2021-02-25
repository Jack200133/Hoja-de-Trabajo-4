import org.junit.Test;

import static org.junit.Assert.*;
public class StackListTest {

    @Test
    public void push() {
        StackList<Integer> in = new StackList<>();
        in.push(12);
        in.push(3);

       assertEquals(2,in.size());
    }

    @Test
    public void pop() {
        StackList<Integer> fe = new StackList<>();
        fe.push(12);
        int aph = fe.pop();

        assertEquals(12,aph);
    }
    @Test
    public void empty(){
        StackList<Integer> fe = new StackList<>();
        fe.push(12);
        boolean sera = fe.empty();
        assertFalse(sera);
    }

}