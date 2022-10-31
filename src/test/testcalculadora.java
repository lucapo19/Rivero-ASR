package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import calculadora.calculadora;

public class testcalculadora {
    calculadora calculator = new calculadora();

    @Test
    public void sumaTest() {
        assertEquals(calculator.sumar(4, 5), 9);
        assertNotEquals(calculator.sumar(5, 5), 9);

    }

    @Test
    public void restarTest() {
         assertEquals(calculator.restar(3, 2), 1);
         assertNotEquals(calculator.restar(8, 5), 2);
    }

    @Test
    public void multiplicarTest() {
        assertEquals(calculator.multiplicar(5, 3), 15);
        assertNotEquals(calculator.multiplicar(5, 3), 10);
    }

    @Test
    public void dividirTest() {
        assertEquals(calculator.dividir(9, 3), 3);
        assertNotEquals(calculator.dividir(18, 3), 2);
    }

    @Test
    public void raizCuadraticaTest(){
        assertEquals(calculator.raizCuadratica(1,2,-8),-4,2);
        assertNotEquals(calculator.raizCuadratica(2,4,-16),-2,1);
    }
}


