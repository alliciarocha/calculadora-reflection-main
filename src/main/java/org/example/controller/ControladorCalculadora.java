package org.example.controller;
import org.example.model.Calculadora;

public class ControladorCalculadora {
    public int calcular(String operacao, int a, int b) {

        Calculadora calc = new Calculadora();
        return calc.calcular(operacao, a, b);
    }
}