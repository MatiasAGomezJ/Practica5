package edu.poniperro;

public interface ICalculadora {

    /**
     * Devuelve la suma de los dos argumentos.
     * @param sumandoA primer valor
     * @param sumandoB segundo valor
     * @return el resultado de la suma
     */
    double sumar(double sumandoA, double sumandoB);

    /**
     * Devuelve la diferencia de los dos argumentos.
     * @param minuendo primer valor
     * @param sustraendo segundo valor a restar del primero
     * @return el resultado de la resta
     */
    double restar(double minuendo, double sustraendo);

    /**
     * Devuelve el producto de los dos argumentos.
     * @param factorA primer valor
     * @param factorB segundo valor
     * @return el resultado de la multiplicación
     */
    double multiplicar(double factorA, double factorB);

    /**
     * Devuelve el cociente de los dos argumentos.
     * @param dividendo primer valor
     * @param divisor segundo valor a dividir del primero
     * @return el resultado de la división
     */
    double dividir(double dividendo, double divisor);
}