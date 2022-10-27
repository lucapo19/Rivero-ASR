package calculadoraTest;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import calculadoraa.calculadora;

public class calculadoraTest {

    calculadora calculator = new calculadora();

    @Test
    public void sumaTest() {
        assertEquals(calculator.sumar(4, 5), 9);
    }

    @Test
    public void restarTest() {
        assertEquals(calculator.restar(3, 2), 1);
    }

    @Test
    public void multiplicarTest() {
        assertEquals(calculator.multiplicar(5, 3), 15);
    }

    @Test
    public void dividirTest() {
        assertEquals(calculator.dividir(9, 3), 3);
    }

    @Test
    public void raizCuadraticaTest(){
        assertEquals(calculator.raizCuadratica(1,2,-8),-4,2);
    }
}