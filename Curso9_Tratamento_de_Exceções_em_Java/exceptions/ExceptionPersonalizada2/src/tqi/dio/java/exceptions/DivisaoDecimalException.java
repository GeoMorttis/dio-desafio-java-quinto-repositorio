package tqi.dio.java.exceptions;

public class DivisaoDecimalException extends Exception {

    private int numerador;
    private int denominador;

    public DivisaoDecimalException(String message, int numerador, int denominador) {
        super(message);
        this.numerador = numerador;
        this.denominador = denominador;
    }
}
