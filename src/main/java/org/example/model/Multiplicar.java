package org.example.model;

import java.util.ArrayList;

public class Multiplicar implements IOperation {
    public int calcular(int a, int b) {
        return a * b;
    }
    public int calcular(ArrayList<Integer> valores) {
        int resultado = valores.get(0);

        for (int i = 1; i < valores.size(); i++) {
            resultado *= valores.get(i);
        }
        return resultado;
    }
}
