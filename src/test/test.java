package test;

import org.junit.Assert;
import org.junit.Test;

import calculadora.calculadora;
import org.junit.rules.ExpectedException;

import java.util.Arrays;

import static org.junit.Assert.*;

public class test {
    calculadora calculator = new calculadora();

    @Test
    public void sumaTest() {
        assertEquals(calculator.sumar(4, 5), 9);

    }
@Test
      public void sumatest() {
        assertNotEquals(calculator.sumar(5, 5), 9);

    }

    @Test
    public void restarTest() {
        assertEquals(calculator.restar(4, 2), 2);
    }
@Test
public void restartest () {
    assertNotEquals(calculator.restar(8, 5), 2);
}


    @Test
    public void multiplicarTest() {
        assertEquals(calculator.multiplicar(5, 3), 15);
    }

    @Test
    public void multiplicartest() {
        assertNotEquals(calculator.multiplicar(5, 3), 10);
    }

    @Test
    public void dividirTest() {
        assertEquals(calculator.dividir(9, 3), 3);
    }

@Test
public void dividirtest(){
    assertNotEquals(calculator.dividir(18, 3), 2);
}

    @Test  (expected = ArithmeticException.class)
public void div2testException() {
        calculator.dividir(2,0);
}

    @Test
    public void raizCuadraticaTest(){
        double[] result = calculator.raizCuadratica(4.0, 4.0, -3.0);
        double [] Expectedresults  = {-0.5, 1.5};
        assertFalse (Arrays.equals(Expectedresults, result));
    }

}
