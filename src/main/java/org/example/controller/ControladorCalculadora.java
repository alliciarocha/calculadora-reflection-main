package org.example.controller;
import org.example.model.Calculadora;

import java.util.ArrayList;

public class ControladorCalculadora {
    public int calcular(String operacao, ArrayList<Integer> valores) {

        Calculadora calc = new Calculadora();
        return calc.calcular(operacao, valores);
    }
}