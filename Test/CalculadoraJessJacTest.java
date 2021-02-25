import org.junit.Test;

import static org.junit.Assert.*;


public class CalculadoraJessJacTest {

    @Test
    public void calculo() {
        CalculadoraJessJac jc = new CalculadoraJessJac("");
        String st = jc.Calculo("1 2 3 / 4 * + 5 - 6 7 *+");
        assertEquals("38",st);

    }
}