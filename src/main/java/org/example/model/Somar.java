package org.example.model;
import java.util.ArrayList;
public class Somar implements IOperation {
    public int calcular(int a, int b) {
        return a + b;
    }
    public int calcular(ArrayList<Integer> valores) {
        int resultado = 0;
        for (int valor : valores){
            resultado += valor;
        }
        return resultado;
    }
}