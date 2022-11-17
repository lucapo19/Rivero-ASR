package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Value;


import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class ApivanesaApplicationTests {

	ApivanesaApplication calculator = new ApivanesaApplication();

	@Test
	public void sumaTest() {
		assertEquals(calculator.sumar(5, 6), 11);
	}

	@Test
	public void sumaFail() {
		assertNotEquals(calculator.sumar(5, 3), 256);
	}


	@Test
	public void restarTest() {
		assertEquals(calculator.restar(9, 2), 7);
	}

	@Test
	public void restarFail() {
		assertNotEquals(calculator.restar(6, 1), 88);
	}

	@Test
	public void multiplicarTest() {
		assertEquals(calculator.multiplicar(9, 2), 18);
	}

	@Test
	public void multiplicarFail() {
		assertNotEquals(calculator.multiplicar(6, 4), 9);
	}

	@Test
	public void dividirTest() {
		assertEquals(calculator.dividir(2, 2), 1);
	}

	@Test
	public void dividirFail() {
		assertNotEquals(calculator.dividir(8, 2), 9);
	}

	@Test
	public void dividirException() {
		Assertions.assertThrows(ArithmeticException.class, () -> {
			calculator.dividir(1, 0);
		});

	}
}
