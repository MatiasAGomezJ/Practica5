package edu.poniperro;

import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CalculadoraTest {

    static Calculadora calculadora;

    @BeforeClass
    public static void setup() {
        calculadora = new Calculadora();
    }

    @Test
    public void sumarTest() {
        assertEquals(10.0, calculadora.sumar(4.0, 6.0), 0.01);
    }

    @Test
    public void restarTest() {
        assertEquals(-8.0, calculadora.restar(2.0, 10.0), 0.01);
    }

    @Test
    public void multiplicarTest() {
        assertEquals(27.0, calculadora.multiplicar(9.0, 3.0), 0.01);
    }

    @Test
    public void dividirTest() {
        assertEquals(3.0, calculadora.dividir(6.0, 2.0), 0.01);
    }
}