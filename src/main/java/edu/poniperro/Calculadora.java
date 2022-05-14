package edu.poniperro;

/**
 * Almacena operaciones básicas de una calculadora
 */
public class Calculadora implements ICalculadora{

    @Override
    public double sumar(double sumandoA, double sumandoB) {
        return sumandoA + sumandoB;
    }

    @Override
    public double restar(double minuendo, double sustraendo) {
        return minuendo - sustraendo;
    }

    @Override
    public double multiplicar(double factorA, double factorB) {
        return factorA * factorB;
    }

    /**
     * @throws ArithmeticException si el divisor es 0
     */
    @Override
    public double dividir(double dividendo, double divisor) throws ArithmeticException {
        if (divisor == 0) throw new ArithmeticException();
        return dividendo / divisor;
    }
}



