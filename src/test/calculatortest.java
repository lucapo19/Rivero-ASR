package test;
import static org.junit.Assert.assertEquals;

import calculadora.calculator;
import org.junit.Test;


public class calculatortest {
    calculator calculator = new calculator();

    @Test
    public void sumaTest(){

        assertEquals(calculator.suma(1,2),  3);

    }
    @Test
    public void restaTest(){

        assertEquals(calculator.resta(5,3), 2);

    }
    @Test
    public void multiplicacionTest(){

        assertEquals(calculator.multiplicacion(2,2), 4);

    }
    @Test
    public void divisionTest(){

        assertEquals(calculator.division(5,1), 5);

    }
}