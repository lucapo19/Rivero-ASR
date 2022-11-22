package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;

class ApivanesaApplicationTest {
    ApivanesaApplication calculator = new ApivanesaApplication();

    @Test
    void sumar() {
             assertEquals(calculator.sumar(5, 6), 11);
    }

    @Test
    void sumarfail() {
        assertNotEquals(calculator.sumar(8, 9), 99);
    }

    @Test
    void resta() {
        assertEquals(calculator.restar(9, 6), 3);
    }

    @Test
    void restafail() {
        assertNotEquals(calculator.restar(55, 22), 66);
    }

    @Test
    void multiplicar() {
        assertEquals(calculator.multiplicar(9, 6), 54);
    }

    @Test
    void multiplicarfail() {
        assertNotEquals(calculator.multiplicar(6, 6), 21);
    }


    @Test
    void dividir() {
        assertEquals(calculator.dividir(6, 2), 3);
    }
    @Test
    void dividirfail() {
        assertNotEquals(calculator.dividir(8, 4), 9);
    }

@Test
public void dividirException() {
    Assertions.assertThrows(ArithmeticException.class, () -> {
        calculator.dividir(1, 0);
    });

}

}