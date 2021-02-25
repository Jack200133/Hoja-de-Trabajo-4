import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingletonCalcuTest {

    @Test
    void getCalcu() {
        CalculadoraGeneral fe = SingletonCalcu.getCalcu("");
        String res = fe.Calculo("36+");
        assertEquals("9",res);
    }
}