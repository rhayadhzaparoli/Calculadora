import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CalcTest {

    Calc calc = new Calc();

    @Test
    public void diferenca() {
        assertEquals(5, calc.diferenca(10, 5));
    }

    @Test
    void divisao() {
        assertEquals(5, calc.divisao(25, 5));

    }

    @Test
    void produto() {
        assertEquals(6, calc.produto(2,3));

    }

    @Test
    void soma() {
        assertEquals(6, calc.soma(3,3));

    }
}