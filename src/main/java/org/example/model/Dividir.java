package org.example.model;

import java.util.ArrayList;

public class Dividir implements IOperation {
    public int calcular(int a, int b) {
        if (b == 0){
            throw new IllegalArgumentException("Divisão por zero");
        }
        else{
            return a / b;
        }
    }
    public int calcular(ArrayList<Integer> valores) {
        int resultado = valores.get(0);

        for (int i = 0; i < valores.size(); i++) {
            if(valores.get(i) == 0) {
                throw new IllegalArgumentException("Divisão por zero");
            }
        }

        for (int j = 1; j < valores.size(); j++) {
            resultado /= valores.get(j);
        }
        return resultado;
    }
}